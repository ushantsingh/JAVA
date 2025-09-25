// find whether 14 exists in the array or not

public class rangesearch {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 3;

        int ans = linearSearch(arr, target,1,4);
        System.out.println(ans);
    }

    // search the array: return the index if item found,
    // otherwise return -1 if item not found
    static int linearSearch(int[] arr, int target,int start,int end){
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <=end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}
