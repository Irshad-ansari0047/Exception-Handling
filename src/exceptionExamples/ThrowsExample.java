package exceptionExamples;

public class ThrowsExample {
    
    public void demo() throws InterruptedException, IllegalAccessException {
        System.out.println("Inside demo method ");
        int b = 40;
        if (b == 10) {
            throw new RuntimeException("b is 10 and it is checked exception ");
        }
        if (b == 20) {
            throw new ArithmeticException("b is 20 and it is checked exception ");
        }
        if (b == 30) {
            throw new InterruptedException("b is 30 and it is unchecked exception ");
        }
        if (b == 40) {
            throw new IllegalAccessException("b is 40 and it is checked exception");
        }
    }
    public static void main(String[] args) {
        try {
            ThrowsExample ThrowsExample = new ThrowsExample();
            ThrowsExample.demo();
        }catch (Exception e) {
            System.out.println("Exception occured : "+ e.getMessage());
        }
    }
}
