import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int temp = n;           // we take temp as n is not decided
        int count=0;            /*we havent counted any digit yet , we are starting counting so we have to take count =0 as we
                                have apples in basket so we don't have any apple so zero apple counted after that we start counting*/

        // for finding number of digit for power
        while (temp>0) {           // we are using for loop because we dont have fixed length or any fixed number of iteration
            temp = temp /10;          // this will give remaining digit of the number so number of time it divid = no. of digit we get
            count++;
        }

        int sum = 0;
        temp = n;
        while(temp>0){
            int digit = temp%10;       //this will seprate last digit or give last digit
            sum = sum+(int)Math.pow(digit,count);  //for doing sum and power
            temp = temp/10;           //for removing the last digit for required result

        }
        if(sum == n){
            System.out.println("armstrong");
        }else{
            System.out.println("Not armstrong");
        }



    }
}
/* insted for using (int)Math.pow(digit,count); we use loop also inside loop we do just
                                                                           power = 1            here we take 1 because if we take 0 base become 1
                                                                           repeat count time:
                                                                           power = power*digit */
//a number that is equal to the sum of its own digits, each raised to the power of the total number of digits.
// 153 = 1^3+5^3+3^3

/* steps to remember
1: take the input of the num
2: count the digit of the number
3: know do the Armstrong operation*/
