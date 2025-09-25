// find whether 14 exists in the array or not

public class lsearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 54, 83, 6, 8, 64, -87, -62};
        int target = 64;

        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search the array: return the index if item found,
    // otherwise return -1 if item not found
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}
