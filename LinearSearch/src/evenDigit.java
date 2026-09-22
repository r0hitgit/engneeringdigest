//LeetCode 1295 = given an array nums return how many of them contain even number of the digit
public class evenDigit  {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int ans = findNumbers(arr);
        System.out.println(ans);

    }
    // we find the number which contain an even number of the digit
    static int findNumbers(int[] arr){
        // storing the even number in count
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    // function to check weather the number contain even digit or not
    static boolean even(int num){
        int numberOfDigit =digit2(num);
        /*if(numberOfDigit %2 ==0){
            return true;
        }
        return false;*/
        //checking that number of digit even or not
        return numberOfDigit % 2==0;       // this is the shortcut basically means if the statement is true then return true else return false because we have taken boolean already

    }
    //counting the digits
    static int digit2(int num){
        //Trick for count a digit
        return (int)(Math.log10(num))+1;
    }
    static int digit(int num){
        //if number is negative
        if(num<0){
            //we make that num +ve
            num =num*-1;
        }
        if(num ==0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
