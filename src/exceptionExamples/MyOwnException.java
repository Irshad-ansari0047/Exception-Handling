package exceptionExamples;

 public class MyOwnException extends Exception {
    public MyOwnException() {
        super();
    }

    // Constructor that takes a message
    public MyOwnException(String message) {
        super(message);
    }

    // Constructor that takes a message and a cause
    public MyOwnException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor that takes a cause
    public MyOwnException(Throwable cause) {
        super(cause);
    }

}
 class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block ");
            int a = 10;
            if (a == 10){
                throw new MyOwnException("some customized exception occured ");
            }
            // System.out.println("a is "+a);

        }catch (Exception e){
            System.out.println("Exception occured : "+ e.getMessage());
        }
    }

}
