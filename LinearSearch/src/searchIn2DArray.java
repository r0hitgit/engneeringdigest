import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12},
        };
        int target = 9;
        int[] ans = search(arr, target);//format of return value {row,col}
        System.out.println(max(arr));
        System.out.println(Arrays.toString(ans));    //for printing in array form
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 1; row < arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // if we want to print max value form an arr
    static int max(int[][] arr) {
        int ans = Integer.MIN_VALUE;       //we can write Integer.MIN_VALUE instead of arr[0][0] and here MIN_VALUE is in capital because it is constant
        for (int row = 1; row < arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                if (arr[row][col] > ans) {
                    ans = arr[row][col];
                }
            }
        }
            return ans;
    }
    static int maxx(int[][] arr){
        int ans = Integer.MIN_VALUE;
        // we can use for each loop also
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > ans) {
                    ans = element;
                }
            }
        }
        return ans;
    }

}

