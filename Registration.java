package JavaP;

public class Registration {
    private String email;
    private String username;
    private String password;
    void setEmail(String email){
        this.email=email;
        if (email.endsWith("yahoo.com")){

            System.out.println("valid email"+" "+email);
        }else {
            System.out.println("invalid email");
        }
    }
    void setUsername(String username){
        this.username=username;
        if (!username.isEmpty()&&username.length()>6){
            System.out.println("valid username"+" "+username);
        }else {
            System.out.println("invalid username");
        }
    }
    void setPassword(String password){
        this.password=password;
        if (!password.isEmpty()&&password.length()>6&&!password.contains(username)){
            System.out.println("valid password"+" "+password);
        }else {
            System.out.println("invalid password"+" "+password);
        }
    }

    public static void main(String[] args) {
        Registration r=new Registration();
        r.setEmail("nasima.gmail.com");
        r.setUsername("sana234");
        r.setPassword("1234jfkjsana234");
    }

}
//14.	Create Registration Class in which you would have variables such as email,
// userName and password that have an access scope only within its own class. After
// creating an object of the class, the user should be able to call methods and in
// each method separately pass values to set users email, username and password.
//Requirements:
//●	Valid email consider to be only yahoo
//●	Valid userName and password cannot be empty and should be of length larger than 6
// characters. Also, valid passwords cannot contain userName.