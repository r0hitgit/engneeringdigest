public class printAtoZ {
    public static void main(String[] args){
        String ans="";
        for(int i =0;i<26;i++){
            char ch=(char)('a'+i);
            ans+=ch;
        }
        System.out.println(ans);
    }
}
/* here as we know String is immutable therefore internaly char add like this afre every addition new obj form as the string is not update in present one only as it is not mutable
 (a,ab,abc,abcd,abcde,abcdef,..........abcdefghijklmnopqrstuvwxyz)  every time new obj will be formed
 therefor space will consume more at every obj formation so for avoiding this we use StringBuilder datatype while is mutable like an array
 when we use StringBuilder then at every addition the present StringBuilder got updated with new charachter without any new obejct formation */
