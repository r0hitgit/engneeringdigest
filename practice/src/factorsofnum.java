import java.util.Scanner;

public class factorsofnum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i = 1 ; i*i<=n ; i++){
            if( n%i == 0){
                System.out.print(i+ " ");
            if(i != n/i){                       // avoiding duplicate of perfect sq
                System.out.print((n/i)+ " ");
                }
            }
        }

    }
}
//Learning
/* factor is which is fully divisible give zero reminder
 while checking factor we divide number to the given number if the reminder is zero then we get two of its factors
  one the number is divided to the given num and the one the resulant num we get after dividing...
  ex lets number is entered 12 now if 12 / 1 = 12 remender is zero and factor is both 12 and 1
                                      12 / 3 = 4  remender is zero and factor is both 3 and 4
  so factor is get repeated after root of entered number
  and factor is always less then entered number
  and we have to make sure about root can't be repeated as it repeat when there is perfect sq....
            ex if entered number is 36 then the factor is 36 / 1 = 36    here we are getting two factor at a time which is  36 and 1
                                                          36 / 2 = 18                                                       18 and 2
                                                          36 / 3 = 12                                                       12 and 3
                                                          36 / 4 = 9                                                        9 and 4
                                                          36 / 5 = remender is not equals to zero
                                                          36 / 6 = 6                                                        6 and 6 here it appears twice so we check
                                                                                                                            using (i != n/i)
                                                          36 / 7 = remender is not equals to zero
                                                          36 / 8 = remender is not equals to zero
                                                          36 / 9 = 4  here we se that factors are repeating 4 and 9
                                                          therefor after the root of entered number it factor start repeating therefore i is tacken i*i<= n
*/