package Behavioral.Memento;

public class Client {
    public static void main(String[] args) {
        OperatingSystemCareTaker osBackup = new OperatingSystemCareTaker();

        OperatingSystem windows = new OperatingSystem();
        windows.OS = "windows 10 pro";
        windows.systemUserNameList = new String[]{"ramazan", "can"};
        windows.foldersList = new String[] {"Desktop", "Documents", "Pictures"};
        windows.errorLogs = new String[] {"errorFromCPU.log","errorFromToastMachine.log"};

        //OS backed up
        osBackup.Memento = windows.Backup();

        //deleting file from OS
        windows.foldersList[0] = "deleted";
        System.out.println("Deleted 'Desktop' from OS");
        //System is restored from backup
        windows.SystemRestoreFromBackup(osBackup.Memento);
    }
}
