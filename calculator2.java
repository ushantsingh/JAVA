// CALCULATOR


import java.util.*;
public class calculator2{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // Take input from user till does not press X or x
        int ans=0;
        while(true)
        {
            // take the operator as input 
            System.out.println("Enter the Operator ");
            char op=sc.next().trim().charAt(0);
            System.out.println();
            if(op== '+'||op== '-'||op=='*'||op=='/'||op=='%')
            {
                System.out.println("Enter Two Numbers: ");
                int num1=sc.nextInt();
                int num2=sc.nextInt();

                if(op=='+')
                {
                    ans = num1+num2;
                }
                if(op=='-')
                {
                    ans = num1-num2;
                }
                if(op=='*')
                {
                    ans = num1*num2;
                }
                if(op=='/')
                {
                    if(num2!=0)
                    {
                        ans =num1/num2;
                    }
                }
                if(op=='%')
                {
                    ans = num1%num2;
                }
            }
                else if(op=='X'||op=='x')
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid Operatiom!!");
                }
                
                System.out.println(ans);
            
        }
    }
}