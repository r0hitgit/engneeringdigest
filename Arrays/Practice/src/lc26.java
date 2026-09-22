//remove duplicate from the sorted array

public class lc26 {
    static void main(String[] args) {
        int [] arr={0,0,1,1,1,2,2,3,3,4};
        int ans= count(arr);
        System.out.println(ans);

    }
    static int count(int[] arr){
        if(arr.length ==0) return 0;
        // two pointer approach
        // we are shifting all the duplicate element in the last
        int i =0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
