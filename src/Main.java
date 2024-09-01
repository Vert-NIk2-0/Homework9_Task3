public class Main {
    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();
        emailValidator.validate("123@aasd.");
        emailValidator.validate("123@aasd.com");
    }
}