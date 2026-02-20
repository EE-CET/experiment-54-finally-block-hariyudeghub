import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        try {
           
            int result = a / b;

            System.out.println("Result: " + result);
        }

        // catch ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage ());
        }
        finally {
            System.out.println("Finally block executed");
        }

        sc.close();
    }
}
