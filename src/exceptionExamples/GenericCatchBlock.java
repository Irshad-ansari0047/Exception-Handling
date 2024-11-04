package exceptionExamples;

public class GenericCatchBlock {
    public static void main(String[] args) {
        
        try {

            System.out.println("Inside try block");
            int a = 20;
            int res = a/5;

            int arr[] = {5,10,15,20};
            System.out.println("Element at 6th index is "+arr[6]);
        } catch (Exception e) {
            System.out.println("Exception occured : "+e.getMessage());
        }

        System.out.println("after genric catch block");
    }
}
