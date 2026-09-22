public class checkArrayIsSotted {
    static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 5};
        boolean ans =check(arr);
        if(!ans){      //by default ans == true
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }

    }

    static boolean check(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true;   // agar swap true huwa then array is not sorted
                }
                if (swapped) {
                    return true;
                }
            }
        }
        return false;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
