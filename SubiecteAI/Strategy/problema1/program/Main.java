package SubiecteAI.Strategy.problema1.program;

import SubiecteAI.Strategy.problema1.clase.BackupJob;
import SubiecteAI.Strategy.problema1.clase.FastCompression;
import SubiecteAI.Strategy.problema1.clase.UltraCompression;

public class Main {
    public static void main(String[] args) {
        BackupJob job = new BackupJob(new FastCompression());
        job.runBackup("C:\\Proiecte\\CTS");

        job.setAlgo(new UltraCompression()); //schimbare la runtime
        job.runBackup("D:\\Foto\\2024");
    }
}
