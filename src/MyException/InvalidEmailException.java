package MyException;

public class InvalidEmailException extends Exception{
    public InvalidEmailException(){
        super("Некорректный адрес электронной почты!");
    }

    public InvalidEmailException(String message){
        super(message);
    }
}
