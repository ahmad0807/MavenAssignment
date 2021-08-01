
public class Calculator {
    public void calci(int num1 ,int num2,char operator){
        int result;
        switch (operator){
            case '+':
               result=num1+num2;
               System.out.println(result);
                break;
            case '-':
                result=num1-num2;
                System.out.println(result);
                break;
            case '*':
                result=num1*num2;
                System.out.println(result);
                break;
            case '/':
                result=num1/num2;
                System.out.println(result);
                break;
            default:
                System.out.println("wrong operator");
        }

    }
}
