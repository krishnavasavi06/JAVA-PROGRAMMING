
import java.util.Scanner;

public class employgrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bonus = 0;
        
        System.out.print("Enter the grade of the employee: ");
        char grade = input.next().charAt(0);
        
        System.out.print("Enter the salary of the employee: ");
        int salary = input.nextInt();
        
        switch (grade) {
            case 'A':
                bonus = salary * 0.05;
                if (salary < 10000) {
                    bonus += salary * 0.02;
                }
                System.out.println("Salary = " + salary);
                System.out.println("Bonus = " + bonus);
                System.out.println("Total to be paid = " + (salary + bonus)); 
                break;
                
            case 'B':
                bonus = salary * 0.1;
                if (salary < 10000) {
                    bonus += salary * 0.02;
                }
                System.out.println("Salary = " + salary);
                System.out.println("Bonus = " + bonus);
                System.out.println("Total to be paid = " + (salary + bonus));
                break;
                
            default:
                System.out.println("Enter valid grade");
        }
        
        input.close();
    }
}
