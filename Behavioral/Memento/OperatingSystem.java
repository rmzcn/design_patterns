package Behavioral.Memento;

public class OperatingSystem {
    public String OS ;
    public String[] errorLogs;
    public String[] foldersList;
    public String[] systemUserNameList;

    public OperatingSystemMemento Backup() {
        OperatingSystemMemento _OSMemento = new OperatingSystemMemento();
        _OSMemento.OS = this.OS;
        _OSMemento.errorLogs = this.errorLogs;
        _OSMemento.foldersList = this.foldersList;
        _OSMemento.systemUserNameList = this.systemUserNameList;
        System.out.println("System is backing up ...");
        return _OSMemento;
    }

    public void SystemRestoreFromBackup(OperatingSystemMemento lastBackup){
        this.errorLogs = lastBackup.errorLogs;
        this.foldersList = lastBackup.foldersList;
        this.OS = lastBackup.OS;
        this.systemUserNameList = lastBackup.systemUserNameList;
        System.out.println("System is restoring ...");
    }


}
