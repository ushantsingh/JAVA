// IF ELSE 

//GREATER NUMBER 

import java.util.*;
public class if_else2{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Click the button which you want click ");
        int button=sc.nextInt();

        if(button==1)
        {
            System.out.println("HELLO!");
        }
        else if(button==2)
        {
            System.out.println("NAMASTE");
        }
        else if(button==3)
        {
            System.out.println("BONJUR");
        }
        else 
        {
            System.out.println("INVALID BUTTON");
        }
    }
}