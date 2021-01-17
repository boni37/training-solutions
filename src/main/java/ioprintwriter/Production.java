package ioprintwriter;

public class Production {

    private String codeOfProduction;
    private String nameOfProduction;
    private int votes;


    public Production(String codeOfProduction, String nameOfProduction) {
        this.codeOfProduction = codeOfProduction;
        this.nameOfProduction = nameOfProduction;
    }

    public String getCodeOfProduction() {
        return codeOfProduction;
    }

    public String getNameOfProduction() {
        return nameOfProduction;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
