// TO MAKE A CALCULATOR 

import java.util.*;
public class calculator{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER FIRST NO. ");
        double a=sc.nextDouble();

        System.out.println("Enter an Operator (+,-,*,/): ");
        char operator=sc.next().charAt(0);

        System.out.println("ENTER SECOND NO. ");
        double b=sc.nextDouble();
        
        double result;

        switch(operator)
        {
            case '+' :
                result=a+b;
                System.out.println("Result :"+ result);
                break;
            case '-' :
                result=a-b;
                System.out.println("Result :"+ result);
                break;
            case '*' :
                result=a*b;
                System.out.println("Result :"+ result);
                break;
            case '/' :
                if(b !=0)
                {
                    result=a/b;
                    System.out.println("Result :"+ result);
                }          
                else
                {
                    System.out.println("Cannot Devide by Zero!");
                }
                break;
            default :
                    System.out.println("INVALID OPERATOR");   
                    break; 
        }
          
       
    }
}