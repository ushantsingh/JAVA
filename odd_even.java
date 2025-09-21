//TO CHECK WHETHER A NUMBER IS ODD OR EVEN

import java.util.*;
public class odd_even{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n=sc.nextInt();

        if(n%2==0)
        {
            System.out.println("THE NUMBER IS EVEN ");
        }
        else 
        {
             System.out.println("THE NUMBER IS ODD ");
        }
        

    }
}