public class printNumber {
    static void main(String[] args) {
        print(1);
    }
    static void print(int n ){
        // this will print the number which is pass in the function
        System.out.println(n);
        // if we want to print n number of the number let take first 5 number without calling the function multiple time and without just printing that five number one by one we have to make new function one by one and call with in the function one by one like a chain
        print1(2);
    }
    static void print1(int n ){
        System.out.println(n);
        print2(3);
    }
    static void print2(int n ){
        System.out.println(n);
        print3(4);
    }
    static void print3(int n ){
        System.out.println(n);
        print4(5);
    }
    static void print4(int n ){
        System.out.println(n);

    }
}
