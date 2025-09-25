//  SEARCHHING IN 2D ARRAY

import java.util.Arrays;
public class serching_2D_array{
    public static void main(String[] args)
    {
        int [][] arr={
            {1,25,7,89},
            {8,65,32,98},
            {35,68},
            {5,9,68,24}
        };
        int target=68;
        int [] ans=Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }


    static int [] Search(int [][] arr,int target)
    {
        for(int row=0;row<arr.length;row++)
        {
            for (int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}