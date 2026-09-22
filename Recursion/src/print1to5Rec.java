// printing 1 to 5 using recursion
public class print1to5Rec {
    static void main(String[] args) {
        print(1);
    }
    // here we make one function as we know in printNumber we using same function multiple time so by using self call function technique we can do it by just making one function
    static void print(int n ){
        // here we setting the boundary after which function call will stop if we don't do so it will call the function infinite time and the stack will get overflowed as the storage get exceed
        if(n==5){
            System.out.println(5);
            return;
        }
        // we call the function itself which we make after finding general thing in the process done int printNUmber
        // self calling function
        System.out.println(n);
        //this is the last function call that's why call tale recursion
        print(n+1);
    }
}
