// TO FIND THE MINIMUM NO. IN AN ARRAY

public class min_no {
    public static void main(String[] args) {
        int[] arr = {1, 2, 54, 83, 6, 8, 64, -87, -62};
        System.out.println(min(arr));
    }
    
    static int min(int arr[])
    {
        int ans=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<ans)
            {
                ans=arr[i];
            }
        }
        return ans;
    }
}
