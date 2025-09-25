// Even number of digits

public class even_no_of_digit {
    public static void main(String[] args) {
        int nums[] = {12, 345, 2, 6, 7896};
        System.out.println(findnumbers(nums)); 
    }

    static int findnumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;  
    }

    static boolean even(int num) {
        int numberofdigits = digits(num);
        return numberofdigits % 2 == 0;
    }

    static int digits(int num) {
        if (num == 0) return 1; 
        if (num < 0) num = num * -1; 
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;  
    }
}
