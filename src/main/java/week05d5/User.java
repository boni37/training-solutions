package week05d5;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(email.contains("@")&email.contains(".")){
            this.email = email;
        } else {
            throw new IllegalArgumentException("E-mail does not contain @ and .");
        }
    }

    public void getFullName(User user){
        System.out.println(user.firstName+" "+user.lastName);
    }

   /* public static void main(String[] args) {
        User user = new User("John","Doe","john_doe@alba.com");
        user.getFullName(user);
    }*/

}
