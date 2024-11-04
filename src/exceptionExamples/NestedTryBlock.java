package exceptionExamples;

public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            System.out.println("inside 1st try block");
            int abc = 16;
            int res = abc/4;
            System.out.println(res);

            try {
                System.out.println("inside 2nd try block");
                int arr[] = {2,3,4,5,6};
                System.out.println("The value at 10th index is "+arr[1]);

                try {
                    System.out.println("inside 3rd try block");
                    String str = null;
                    System.out.println("str length is "+str.length());
                } catch (NullPointerException e3) {
                    System.out.println("Exception occured : "+ e3.getMessage());
                }
            } catch (ArrayIndexOutOfBoundsException e2){
                System.out.println("Exception occured : "+e2.getMessage());
            }
        } catch (ArithmeticException e1) {
            System.out.println("Exception occured : "+ e1.getMessage());
        }
    }
}
