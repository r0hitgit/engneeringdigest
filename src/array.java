

public class array {
    public static void main(String[] args){
        //find max element in an array
        int[] arr = new int [5]; // new use for storing an array is heap memory,arr refaring an array
        arr[0]= 2;
        arr[1]= 12;
        arr[2]= 4322;
        arr[3]= -32;
        arr[4]= 22;
        int res = Integer.MIN_VALUE; //MIN.VALUE means negative infinity
        for(int i = 0; i< arr.length; i++){
            if(arr[i]> res){
                res = arr[i];
            }


        }
        System.out.println(res);



    }
}
