package week05d02;
public class ChangeLetter {
    public String changeVowels(String stringChange){
        String s = stringChange.toLowerCase();
        stringChange = "";
        for(int j=0; j< s.length();j++){
           char ch=s.charAt(j);
           if ((ch=='a')|(ch=='e')|(ch=='i')|(ch=='o')|(ch=='u')){
               stringChange += "*";}
           else { stringChange += ch;}
        } return stringChange;
    }
}
