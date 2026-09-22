public class to_darray {
    public static void main (String[] args){
        char arr[][]= new char[3][2]; //character array
        arr[0][0] = 'a'; //intilising
        arr[0][1] = 'b';
        arr[1][0] = 'c';
        arr[1][1] = 'd';
        arr[2][0] = 'e';
        arr[2][1] = 'f';
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+ " ");
                
            }
            System.out.println();
            
        }
    }
}
//  a b
//  c d
//  e f