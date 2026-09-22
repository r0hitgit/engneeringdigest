import java.util.Arrays;

public class basic {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int element =0;
        int sum =0;
        int ecount =0;
        int ocount =0;
        for(int i =0;i<=arr.length-1;i++){
            element =arr[i];
            sum =sum+arr[i];
            //finding even and odd
            if(element%2 ==0){
                ecount++;
            }
            else{
                ocount++;
            }
        }
        for(int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println("total even: "+ecount);
        System.out.println("total odd: "+ocount);
        System.out.println("total sum: "+sum);
    }
}

