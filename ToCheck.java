public class ToCheck {
    public static void main(String[] args) {
        Login login1 = new Login("", 123456);
        Login login2 = new Login("qwerty", 0);
        login1.verify();
        login2.verify();

    }
}

class Login {
    private String userName;
    private int password;

    public Login(String userName, int password) {
        this.userName = userName;
        this.password = password;
    }

    public void verify() {
        if (userName.isEmpty()) {
            System.out.println("UserName can't be empty");
        } else {
            System.out.println("You entered correct login and password. Welcome!");
        }
    }
}