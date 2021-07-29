
public class Calculator {
    public void calci(int num1 ,int num2,char ch){
        int op=0;
        if(ch=='+'){
            op=num1+num2;
        }
        else if(ch=='-'){
            op=num1-num2;
        }
        else if(ch=='*'){
            op=num1*num2;
        }
        else if(ch=='/'){
            op=num1/num2;
        }
        else{
            System.out.println("Wrong Choice");
        }
        System.out.println(op);
    }
}
