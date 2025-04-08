package Recapitulare.Builder.clase;

public class PachetCalatorie {
    private boolean hasWifi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;

    private PachetCalatorie(PachetCalatorieBuilder builder) {
        this.hasWifi = builder.hasWifi;
        this.hasAnimale = builder.hasAnimale;
        this.isFumator = builder.isFumator;
        this.hasAC = builder.hasAC;
        this.hasTV = builder.hasTV;
    }

    public static PachetCalatorieBuilder builder(){
        return new PachetCalatorieBuilder();
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public boolean isHasAnimale() {
        return hasAnimale;
    }

    public boolean isFumator() {
        return isFumator;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public boolean isHasTV() {
        return hasTV;
    }
    public static class PachetCalatorieBuilder implements IBuilder{
        private boolean hasWifi;
        private boolean hasAnimale;
        private boolean isFumator;
        private boolean hasAC;
        private boolean hasTV;

        public PachetCalatorie build(){
            return new PachetCalatorie(this);
        }

        public PachetCalatorieBuilder setHasWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public PachetCalatorieBuilder setHasAnimale(boolean hasAnimale) {
            this.hasAnimale = hasAnimale;
            return this;
        }

        public PachetCalatorieBuilder setFumator(boolean fumator) {
            isFumator = fumator;
            return this;
        }

        public PachetCalatorieBuilder setHasAC(boolean hasAC) {
            this.hasAC = hasAC;
            return this;
        }

        public PachetCalatorieBuilder setHasTV(boolean hasTV) {
            this.hasTV = hasTV;
            return this;
        }
    }

    @Override
    public String toString() {
        return "PachetCalatorie{" +
                "hasWifi=" + hasWifi +
                ", hasAnimale=" + hasAnimale +
                ", isFumator=" + isFumator +
                ", hasAC=" + hasAC +
                ", hasTV=" + hasTV +
                '}';
    }
}
