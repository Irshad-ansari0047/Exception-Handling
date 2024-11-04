package exceptionExamples;

public class ThrowExample {

    public void sample() {
        System.out.println("Insde sample method ");
        int a = 10;
        if (a == 10) {
            throw new RuntimeException("Please enter another input");
        }
        System.out.println("a is " + a);
    }

    public static void main(String[] args) {
        try {
            ThrowExample ThrowExample = new ThrowExample();
            ThrowExample.sample();
        } catch (Exception e1) {
            System.out.println("Exception occured : " + e1.getMessage());
        }
    }
}
