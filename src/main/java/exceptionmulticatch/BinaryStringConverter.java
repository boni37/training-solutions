package exceptionmulticatch;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String binaryString){
        if(binaryString == null) throw new NullPointerException("binaryString null");
        boolean[] booleans = new boolean[binaryString.length()];
        for(int i=0; i< binaryString.length();i++){
            if((binaryString.charAt(i)!= '0') && (binaryString.charAt(i)!= '1')) throw new IllegalArgumentException("binaryString not valid");
            booleans[i]= (binaryString.charAt(i)=='1')? true:false;
        }return booleans;
    }

    public String booleanArrayToBinaryString(boolean[] booleans){
        if(booleans == null) throw new NullPointerException("boolean null");
        if(booleans.length ==0) throw new IllegalArgumentException("boolean size 0");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< booleans.length;i++){
            sb.append((booleans[i]==true)? 1:0);
        }
        return sb.toString();

    }
}
