// TO PRINT THE SUM OF N NUMBERS

import java.util.*;
public class sum_of_n_no{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No. till which you want to print the sum");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}