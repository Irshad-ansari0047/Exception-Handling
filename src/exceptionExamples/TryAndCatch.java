package exceptionExamples;

public class TryAndCatch {
    public static void main(String[] args) {
        int a = 10;
        int res = 0;

        try{            // program code which might give Exception should be written in try block   
            // code to monitor Exception

            System.out.println("Before Exception occures");
            res = a / 0;
            System.out.println("After Exception occures");

        }catch(ArithmeticException e){                // Exception occured in try block will be catched inside catch block
            // code to handle Exception

            System.out.println("Exception occured : "+ e.getMessage());
        }

        System.out.println("a is "+ a);
        System.out.println("res is "+ res);
    }
    
}
