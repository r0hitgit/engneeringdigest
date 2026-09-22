public class searchTarget {
    static void main(String[] args) {
        int[] arr = {2,4,7,1};
        int target =7;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] ==target){
                return i;

            }
        }
        return -1;
    }
}
