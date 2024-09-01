import MyException.InvalidEmailException;

public class EmailValidator {
    public void validate(String email) {
        if (!email.contains("@") || email.endsWith("@") || email.endsWith(".") || email.startsWith("@") || email.startsWith(".")) {
            try {
                throw new InvalidEmailException();
            }catch (InvalidEmailException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.printf("Ваш Email %s корректен.\n", email);
        }
    }
}
