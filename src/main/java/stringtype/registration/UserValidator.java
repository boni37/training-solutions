package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username){
        int nameLength = username.length();
        if (nameLength > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isValidPassword(String password1, String password2){
        if (password1.equals(password2) & (password1.length()>=8) & (password2.length()>=8)){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean isValidEmail(String email){
        if ((email.indexOf("@") != 0) & (email.indexOf("@") < email.indexOf(".")) & (email.indexOf(".")<(email.length()-1))){
            return true;
        } else {
            return false;
        }

    }
}




