// optimize

public class findOnlyPrimeTillN {
    static void main(String[] args) {
        int n =40;
        // we have to print only prime till 40
        boolean[] arr = new boolean[n+1];
        // all the element is false initially
        seive(n,arr);

    }
    static void seive(int n ,boolean[] arr){
        for(int i =2;i*i<n;i++){
            if(!arr[i]){
                for(int j=i*2;j<=n;j+=i){
                    // we marked true when we got multiple of the picked number
                    arr[j] = true;
                }
            }
        }
        // print rest of all which is not true or composite
        for(int i =2;i<=n;i++){
            if(!arr[i]) {
                System.out.print(i+ " ");
            }
        }

    }
}
