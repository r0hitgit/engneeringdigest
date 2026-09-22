public class maxitem {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 10};
        System.out.println(maxRange(arr,1,3));
    }
// work in edge cases here, like array begin null
    static int maxRange(int[] arr, int start,int end) {

        // always check for null then any other condition will come
        if(arr == null){
            return-1;
        }
        if(start < 0 || end > arr.length || start > end){
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start+1; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    //imagine that arr is not empty
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
        for(int i =1 ;i<arr.length;i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];

            }
        }
        return maxVal;
    }
}
