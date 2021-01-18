package week12.d01;

public class GradeRounder {

    public int[] roundGrades(int[] grades){
        int[] gradesAfterRound= new int[grades.length];
        for(int i =0; i< grades.length; i++){
            if(grades[i]<40){
                gradesAfterRound[i] = grades[i];
            }else if((((grades[i]/5+1)*5-grades[i])>0)&&((((grades[i]/5+1)*5-grades[i])<3))){
                gradesAfterRound[i] = (grades[i]/5+1)*5;
            }else gradesAfterRound[i] = grades[i];
        }return gradesAfterRound;
    }
}
