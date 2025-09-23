// NO. OF OCCURANCE OF A NO. IN A NO.



import java.util.*;
public class occurance{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=sc.nextInt();
        System.out.println("ENTER THE NUMBER TO BE COUNTED");
        int c=sc.nextInt();
        int count =0;
        while(n>0)
        {
            int rem=n%10;
            if(rem==c)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println("Count of the Number is "+count);
    }
}