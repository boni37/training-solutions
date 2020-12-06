package methodvarargs;

public class ExamStats {

    private double maxPoints;

    public ExamStats(int maxPoints){
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results){
        int numOfTopGrades = 0;
        if (results.length == 0){
            throw new IllegalArgumentException("The results is empty");
        }
        for(int result:results){
            if(result > (1.0*limitInPercent/100*maxPoints)){
                numOfTopGrades+=1;
            }
        }return numOfTopGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int...results){
        if (results.length == 0){
            throw new IllegalArgumentException("The results is empty");
        }
        for(int result:results){
            if(result < limitInPercent){
                return true;
            }
        }return false;
    }
}
