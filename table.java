// TO PRINT A TABLE OF A NUMBER


import java.util.*;
public class table{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No. of which you want the table ");
        int n=sc.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" X "+i+"="+n*i);
        }
    }
}