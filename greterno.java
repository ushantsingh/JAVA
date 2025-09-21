//GREATER NUMBER 

import java.util.*;
public class greterno{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();

        if(a==b)
        {
            System.out.println("Both Numers are equal");
        }
        else if(a>b)
        {
            System.out.println("First Number is Greater");
        }
        else 
        {
            System.out.println("Second Number is Greater");
        }
    }
}