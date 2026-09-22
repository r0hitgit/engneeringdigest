public class secondLargest {
    public static void main(String args[]){
        int[] arr = {12,3,4,3,2,43};
        int largest =Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;
        for(int i =0;i<=arr.length-1;i++){
            int element =arr[i];
            if(element>largest){
                secondLargest =largest;
                largest =element;

            }else if(element<largest && element>=secondLargest){
                secondLargest =element;
            }
        }
        System.out.println(secondLargest);
    }
}
