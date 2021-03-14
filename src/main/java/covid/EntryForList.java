package covid;

public class EntryForList {

    private String typeOfRecord;
    private int numberOfRecord;

    public EntryForList() {
    }

    public EntryForList(String typeOfRecord, int numberOfRecord) {
        this.typeOfRecord = typeOfRecord;
        this.numberOfRecord = numberOfRecord;
    }

    public String getTypeOfRecord() {
        return typeOfRecord;
    }

    public int getNumberOfRecord() {
        return numberOfRecord;
    }

    public void setTypeOfRecord(String typeOfRecord) {
        this.typeOfRecord = typeOfRecord;
    }

    public void setNumberOfRecord(int numberOfRecord) {
        this.numberOfRecord = numberOfRecord;
    }

    @Override
    public String toString() {
        return typeOfRecord + " = " + numberOfRecord + "\n";
    }
}
