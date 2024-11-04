package exceptionExamples;

public class NullPointerExample {
    public static void main(String[] args) {
       try{
        String str1 = "Hello Irshad";
        System.out.println("str1 length is "+ str1.length());

        String str2 = null;
        System.out.println("str2 length is "+ str2.length());
       }catch(NullPointerException e){
        System.out.println("Exception occured : "+e.getMessage());
       }
    }
}
