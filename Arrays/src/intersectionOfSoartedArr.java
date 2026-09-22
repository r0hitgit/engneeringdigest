import java.util.*;
public class intersectionOfSoartedArr {
    public static void main(String[] args){
        int[] a={1,2,2,3,3,4,5,6};
        int[] b={2,3,3,5,6,6,7};
        ArrayList<Integer> ans = intersection(a,b);
        System.out.println(ans);

    }
    static ArrayList<Integer> intersection(int[] a,int[] b){
        int n=a.length;
        int l=b.length;
        int[] visit=new int[l];

        ArrayList<Integer>intsArr=new ArrayList<>();

        for(int i =0;i<n;i++){
            for(int j=0;j<l;j++){
                if(a[i]==b[j] && visit[j]==0){
                    //if(intsArr.isEmpty() || intsArr.get(intsArr.size()-1)!=a[i]) we can use thing if we don't want duplicates
                    intsArr.add(a[i]);
                    visit[j]=1;
                    break;
                }
                if(b[j]>a[i]) break;

            }
        }
        return intsArr;
    }
}
