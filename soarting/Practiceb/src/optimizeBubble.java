//Implement optimized Bubble Sort that stops early if the array becomes sorted before completing all passes.
public class optimizeBubble {
    static void main(String[] args) {
        int[] arr = {1, 2, 4,3, 5};
        boolean ans =optimize(arr);
        if(ans==true) {
            System.out.println("Array is already sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
    // we do if we know that the array is sorted in one pass of i then we return array already sorted if not then we sort the array
    static boolean optimize(int[] arr){
        boolean swapped= false;

        for(int i =0;i<=arr.length-1;i++){
            for(int j =1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swapped =true;
                }

            }
                if(!swapped) {
                    return true;
                }
        }
        return false;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
