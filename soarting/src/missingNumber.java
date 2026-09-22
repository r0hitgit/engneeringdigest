//Leetcode 268  #amazon

public class missingNumber {
    static void main(String[] args) {
        int[] arr ={4,0,2,1};
        int ans =MissingNumber(arr);
        System.out.println(ans);

    }
    static int MissingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int element=arr[i];
            int correct =arr[i];
            if(element<arr.length && element !=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
            return arr.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] =temp;
    }
}
