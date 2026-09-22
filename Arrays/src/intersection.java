//Intersection of two sorted array using two pointer approch
import java.util.*;

public class intersection {
    static void main(String[] args) {
        int[] a={1,2,2,3,3,4,5,6};
        int[] b={2,3,3,5,6,6,7};
        ArrayList<Integer>ans=intersectionOfArr(a,b);
        System.out.println(ans);

    }
    static ArrayList<Integer>intersectionOfArr(int[] a,int[] b){
        int n=a.length;
        int m=b.length;
        int i =0;
        int j =0;
        ArrayList<Integer>intsArr=new ArrayList<>();

        while(i<n &&j<m){
            if(a[i]<b[j]){
                i++;
            }else if(a[i]>b[j]){
                j++;
            }else{
                if(intsArr.isEmpty()||intsArr.get(intsArr.size()-1)!=a[i]) {
                    intsArr.add(a[i]);
                }
                    i++;
                    j++;
            }
        }
        return intsArr;
    }
}
