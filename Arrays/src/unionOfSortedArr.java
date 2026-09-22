import java.util.*;
public class unionOfSortedArr {
    public static void main(String[] args) {
        int[] a ={1,1,2,3,4,5};
        int[] b= {2,3,4,4,5,6};
        ArrayList<Integer> union=sortedArray(a,b);
        System.out.println(union);

    }
    static ArrayList<Integer> sortedArray(int[] a,int[] b){
        int n = a.length;
        int l = b.length;
        int i=0;
        int j =0;
        ArrayList<Integer>unionArr =new ArrayList<>();
        while(i<n && j<l){
             if(a[i]<=b[j]){
                  if(unionArr.isEmpty() ||unionArr.get(unionArr.size()-1)!=a[i]){
                      unionArr.add(a[i]);
                  }
                  i++;
             }else{
                 if(unionArr.isEmpty() ||unionArr.get(unionArr.size()-1)!=b[j]){
                     unionArr.add(b[j]);
                 }
                 j++;
             }
        }
        while(j<l){
            if(unionArr.isEmpty() ||unionArr.get(unionArr.size()-1)!=b[j]){
                unionArr.add(b[j]);
            }
            j++;
        }
        while(i<n){
            if(unionArr.isEmpty() ||unionArr.get(unionArr.size()-1)!=a[i]){
                unionArr.add(a[i]);
            }
            i++;
        }
        return unionArr;
    }
}
