import java.util.Scanner;
import java.util.InputMismatchException;

public class Bai_2_2_6 {
	public static void main(String[] args) {
		System.out.println("1. Linear equation with one variable");
		System.out.println("2. Linear system with two variable");
		System.out.println("3. Second-degree equation with one variable");
		
		Scanner sc = new Scanner(System.in);
		
		try {
            System.out.println("Enter your option number:");
            int option = sc.nextInt();
            if (option < 1 || option > 3) {
            	System.out.println("You've entered a wrong option. Please re-run and enter a number 1-3.");
            	System.exit(0);
            } else {
            	if (option == 1) {
            		System.out.println("Enter the coefficients for the linearq equation ax + b = 0");
            		System.out.println("Enter a:");
            		double a = sc.nextDouble();
            		
            		System.out.println("Enter b:");
            		double b = sc.nextDouble();
            		
            		if (a == 0) {
            			if (b == 0) {
            				System.out.println("The equation has infinitely many solutions");
            			} else {
            				System.out.println("The equation has no solution");
            			}
            		} else {
            			double sol = -b/a;
            			System.out.println("The solution is: " + sol);
            		}
            	} else if (option == 2) {
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
                    
                    double n = a11 * a22 - a12 * a21;
                    if (n == 0) {
                    	if (a11 * b2 - a21 * b1 == 0 && a12 * b2 - a22 * b1 == 0) {
                            System.out.println("The system has infinitely many solutions");
                        } else {
                            System.out.println("The system has no solution");
                        }
                    } else {
                    	double x1 = (b1 * a22 - a12 * b2) / n;
                        double x2 = (a11 * b2 - a21 * b1) / n;
                        System.out.println("The solution is: x1 = " + x1 + ", x2 = " + x2);
                    }
            	} else if (option == 3) {
            		System.out.println("Enter the coefficients for the quadratic equation ax^2 + bx + c = 0");
            		
            		System.out.print("Enter a: ");
                    double a = sc.nextDouble();

                    System.out.print("Enter b: ");
                    double b = sc.nextDouble();

                    System.out.print("Enter c: ");
                    double c = sc.nextDouble();

                    if (a == 0) {
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
                    } else {
                    	double discriminant = b * b - 4 * a * c;
                    	if (discriminant > 0) {
                    		double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                            System.out.println("The solutions are: " + root1 + " and " + root2);
                        } else if (discriminant == 0) {
                            double root = -b / (2 * a);
                            System.out.println("The equation has a double root: " + root);
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