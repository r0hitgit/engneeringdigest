public class searchInString {
    static void main(String[] args) {
        String name ="rohit";
        char target ='h';
        System.out.println(search(name,target));
    }
    static boolean search(String str,char target){
        if(str.length() ==0){
            return false;
        }
        for(int i =0;i<str.length() ;i++){          //here we use length with bracket because of here str is function in string class that's why we use length() like we are calling a function internally it is array only
                                                    // in array arr.length where length is variable and arr is datatype
            if(target == str.charAt(i)){

                return true;
            }
        }
        return false;
    }
}
