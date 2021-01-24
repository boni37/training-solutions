package exceptionmulticatch;

import java.util.logging.Logger;

public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public BinaryStringConverter getBinaryStringConverter() {
        return binaryStringConverter;
    }

    public int answerTruePercent(String answers){
        int countOnes=0;
        boolean[] booleans = binaryStringConverter.binaryStringToBooleanArray(answers);
        for(int i=0; i< booleans.length; i++){
            if(booleans[i]== true) countOnes+=1;
        }return countOnes*10/booleans.length*10;
    }

    public boolean[] convert(String bc){
        try {
            return binaryStringConverter.binaryStringToBooleanArray(bc);
        }
        catch (NullPointerException|IllegalArgumentException ex){
            throw  new InvalidBinaryStringException(ex);
        }
    }
}
