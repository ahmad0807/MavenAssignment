
import java.util.Scanner;

public class Application {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();
        System.out.println("Enter operator");
        char operator=sc.next().charAt(0);
        Calculator com=new Calculator();
        com.calci(num1,num2,operator);
    }
}
