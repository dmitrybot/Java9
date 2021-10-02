public class Student {
    private String FIO;
    private String INN;

    public Student(String fio, String inn){
        FIO = fio;
        INN = inn;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }
}
