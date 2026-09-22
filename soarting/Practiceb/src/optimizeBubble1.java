public class optimizeBubble1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3,6, 5};

        boolean sorted = optimize(arr);

        if(sorted){
            System.out.println("Array was already sorted");
        } else {
            System.out.println("Array was not sorted initially");
        }
    }

    static boolean optimize(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){

            int count = 0;  // reset for each pass

            for(int j = 1; j < arr.length - i; j++){

                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    count++;
                }
            }

            // IMPORTANT: check after full pass
            if(count == 0){
                return true;
            }
        }

        return false;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}