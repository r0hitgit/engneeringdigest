public class reversenum {
    public static void main(String[] args) {
        int n = 124578;
        int count = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            System.out.print(rem);
            count++;
        }
    }
}
