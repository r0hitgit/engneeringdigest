//LeetCode1672
public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts ={
                        {1,2,3},
                        {3,2,1},
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        //ith customer = row
        //jth bank =col
        int ans =Integer.MIN_VALUE;
        /*for(int customer =0 ;customer<accounts.length;customer++){
                //when you start a new col, take a new sum of that row
            int sum =0;
            }*/
        for (int[] account : accounts) {
            //when you start a new col, take a new sum of that row
            int sum = 0;

            /*for (int bank = 0; bank < account.length; bank++) {
                sum = sum + account[bank];
            }*/
            for (int bank : account) {
                sum = sum + bank;
            }
            //now we have some of all banks of a customer
            //check with overall ans i.e. we are checking which is reachest
            if (sum > ans) {
                ans = sum;
            }

        }
        return ans;
    }
}
