package exceptionExamples;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int ans = a / 10;
            System.out.println("ans is " + ans);

            int arr[] = { 2, 4, 6, 8 };
            System.out.println("the value at 5th index is " + arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Exception occured : " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occured : " + e.getMessage());
        }

        System.out.println("after multiple catch blocks ");
    }
}
