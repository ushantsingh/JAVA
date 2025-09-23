import java.util.*;
public class casecheck{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a character");
    char ch=sc.next().charAt(0);

    if(ch>='a' && ch<='z')
    {
        System.out.println("Lower case ");
    }
    else 
    {
        System.out.println("Upper case");
    }
    }
    
}