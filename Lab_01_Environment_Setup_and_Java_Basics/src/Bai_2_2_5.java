import java.util.Scanner;
import java.util.InputMismatchException;

public class Bai_2_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = num1 / num2;

            System.out.println("The sum of the two numbers is: " + sum);
            System.out.println("The difference of the two numbers is: " + difference);
            System.out.println("The product of the two numbers is: " + product);
            
//          Kiểm tra nếu chia cho 0 thì báo lỗi
            if (num2 == 0) {
                System.out.println("Cannot divide to 0");
            } else {
                System.out.println("The quotient of the two numbers is: " + quotient);
            }
//          Nếu người dùng nhập vào không đúng (nhập vào chữ hoặc ký tự đặc biệt) thì báo lỗi
        } catch (InputMismatchException e) {
            System.out.println("You've entered a non-numeric character. Please re-run and enter a number.");
        }
    }
}
