// SWITCH CASE

import java.util.*;
public class switch_case{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Click the button which you want click ");
        int button=sc.nextInt();

        switch(button)
        {
            case 1:
                    System.out.println("Hello!");
                    break;
            case 2:
                    System.out.println("NAMASTE");
                    break;
            case 3:
                    System.out.println("BONJUR");
                    break;
            default:
                    System.out.println("INVALID BUTTON");
                    break;
        }
    }
}