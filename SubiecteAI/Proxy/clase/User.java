package SubiecteAI.Proxy.clase;

public class User {
    private final String nume;
    private final Role role;

    public User(String nume, Role role) {
        this.nume = nume;
        this.role = role;
    }

    public String getNume() {
        return nume;
    }

    public Role getRole() {
        return role;
    }
}
