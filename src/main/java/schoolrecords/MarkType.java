package schoolrecords;

public enum MarkType { A,B,C,D,F

    private int value;
    private String description;

    MarkType(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
