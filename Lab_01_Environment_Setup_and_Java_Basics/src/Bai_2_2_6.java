import java.util.Scanner;
import java.util.InputMismatchException;

public class Bai_2_2_6 {
	public static void main(String[] args) {
//		Đưa ra 3 lựa chọn tương ứng với 3 yêu cầu của đề bài
		System.out.println("1. Linear equation with one variable");
		System.out.println("2. Linear system with two variable");
		System.out.println("3. Second-degree equation with one variable");
		
		Scanner sc = new Scanner(System.in);
		
		try {
            System.out.println("Enter your option number:");
            int option = sc.nextInt();
//          Kiểm tra input của người dùng, nếu input sai thì tắt chương trình
            if (option < 1 || option > 3) {
            	System.out.println("You've entered a wrong option. Please re-run and enter a number 1-3.");
            	System.exit(0);
            } else {
//            	Lựa chọn 1: Tìm x của phương trình bậc 1
            	if (option == 1) {
//            		Nhập 2 số a và b
            		System.out.println("Enter the coefficients for the linearq equation ax + b = 0");
            		System.out.println("Enter a:");
            		double a = sc.nextDouble();
            		
            		System.out.println("Enter b:");
            		double b = sc.nextDouble();
            		
//            		TH1: Nếu a = 0
            		if (a == 0) {
//            			Nếu b = 0 -> Phương trình có vô số nghiệm
            			if (b == 0) {
            				System.out.println("The equation has infinitely many solutions");
//            			Nếu b != 0 -> Phương trình vô nghiệm
            			} else {
            				System.out.println("The equation has no solution");
            			}
//            		TH2: Nếu a != 0 -> Giải phương trình -> Đưa ra kết quả
            		} else {
            			double sol = -b/a;
            			System.out.println("The solution is: " + sol);
            		}
            	
//            	Lựa chọn 2: Tìm x hệ phương trình bậc 1 (2 biến)
            	} else if (option == 2) {
//            		Nhập số liệu
            		System.out.println("Enter the coefficients for the linear system a11x1 + a12x2 = b1 and a21x1 + a22x2 = b2");
            		
            		System.out.print("Enter a11: ");
                    double a11 = sc.nextDouble();

                    System.out.print("Enter a12: ");
                    double a12 = sc.nextDouble();

                    System.out.print("Enter b1: ");
                    double b1 = sc.nextDouble();

                    System.out.print("Enter a21: ");
                    double a21 = sc.nextDouble();

                    System.out.print("Enter a22: ");
                    double a22 = sc.nextDouble();

                    System.out.print("Enter b2: ");
                    double b2 = sc.nextDouble();
                    
//                  Tính định thức (n)
                    double n = a11 * a22 - a12 * a21;
//                  Nếu n = 0, hệ phương trình có thể không có nghiệm hoặc có vô số nghiệm. 
//                  Điều này được kiểm tra bằng cách so sánh a11 * b2 - a21 * b1 và a12 * b2 - a22 * b1 với 0
                    if (n == 0) {
                    	if (a11 * b2 - a21 * b1 == 0 && a12 * b2 - a22 * b1 == 0) {
                            System.out.println("The system has infinitely many solutions");
                        } else {
                            System.out.println("The system has no solution");
                        }
//                    	Nếu n != 0, hệ phương trình có một nghiệm duy nhất. 
//                    	Nghiệm được tính bằng cách sử dụng công thức Cramer: x1 = (b1 * a22 - a12 * b2) / n và x2 = (a11 * b2 - a21 * b1) / n
                    } else {
                    	double x1 = (b1 * a22 - a12 * b2) / n;
                        double x2 = (a11 * b2 - a21 * b1) / n;
                        System.out.println("The solution is: x1 = " + x1 + ", x2 = " + x2);
                    }
//              Lựa chọn 3: Phương trình bậc 2
            	} else if (option == 3) {
//            		Nhập số liệu
            		System.out.println("Enter the coefficients for the quadratic equation ax^2 + bx + c = 0");
            		
            		System.out.print("Enter a: ");
                    double a = sc.nextDouble();

                    System.out.print("Enter b: ");
                    double b = sc.nextDouble();

                    System.out.print("Enter c: ");
                    double c = sc.nextDouble();

//                  Nếu a bằng 0, phương trình trở thành phương trình bậc nhất bx + c = 0
                    if (a == 0) {
//                    	Nếu b cũng bằng 0, phương trình trở thành c = 0
//                    	Nếu c bằng 0, phương trình có vô số nghiệm
//                    	Nếu c khác 0, phương trình vô nghiệm
                        if (b == 0) {
                            if (c == 0) {
                                System.out.println("The equation has infinitely many solutions");
                            } else {
                                System.out.println("The equation has no solution");
                            }
                        } else {
                            double solution = -c / b;
                            System.out.println("The solution is: " + solution);
                        }
//                  Nếu a khác 0, phương trình là phương trình bậc hai
//                  Ta tính delta là b^2 - 4ac
                    } else {
                    	double delta = b * b - 4 * a * c;
//                    	Nếu delta lớn hơn 0, phương trình có hai nghiệm phân biệt x1 = (-b + sqrt(delta)) / (2a) và x2 = (-b - sqrt(delta)) / (2a)
                    	if (delta > 0) {
                    		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
                            System.out.println("The solutions are: " + root1 + " and " + root2);
//                      Nếu delta bằng 0, phương trình có nghiệm kép x = -b / (2a)
                    	} else if (delta == 0) {
                            double root = -b / (2 * a);
                            System.out.println("The equation has a double root: " + root);
//                      Nếu delta nhỏ hơn 0, phương trình vô nghiệm
                    	} else {
                            System.out.println("The equation has no real roots");
                    	}
                    }
            	} 
            }
        } catch (InputMismatchException e) {
            System.out.println("You've entered a wrong option. Please re-run and enter a number 1-3.");
            System.exit(0);
        }
	}
}
