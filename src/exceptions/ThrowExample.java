package exceptions;

public class ThrowExample {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Access denied, You must be 18 years old!");
        } else {
            System.out.println("Access granted!");
        }
    }
    public static void main(String[] args) {
        checkAge(20);
    }
}
