// LOWER LEFT TRIANGLE

// ****
// ***
// **
// *

public class pattern4{
    public static void main(String[] args)
    {
        int n=4;
        for(int i=1;i<=4;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}