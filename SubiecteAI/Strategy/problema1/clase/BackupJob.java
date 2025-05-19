package SubiecteAI.Strategy.problema1.clase;

//Context
public class BackupJob {
    private ICompression algo;

    public BackupJob(ICompression algo) {
        this.algo = algo;
    }

    public BackupJob setAlgo(ICompression algo) {
        this.algo = algo;
        return this;
    }

    public void runBackup(String srcFolder){
        System.out.println("\n--- Backup pentru " + srcFolder + " ---");
        byte[] data = srcFolder.getBytes();
        byte[] packed = algo.compress(data);
        System.out.println("Dimensiune arhivă: " + packed.length + " B");
        System.out.println("Upload către cloud...\n");
    }
}
