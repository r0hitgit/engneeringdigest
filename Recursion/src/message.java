public class message {
    static void main(String[] args) {
        printMassage();
    }
    static void printMassage(){
        System.out.println("Hello World");
// If we want to print the message without calling multiple function or a single function multiple time and without printing the massage multiple time then we should have one option to just make new function and pass each function within the function
        printMassage1();
    }
    static void printMassage1(){
        System.out.println("Hello World");
        printMassage2();
    }

    static void printMassage2(){
        System.out.println("Hello World");
        printMassage3();
    }

    static void printMassage3(){
        System.out.println("Hello World");
        printMassage4();
    }

    static void printMassage4(){
        System.out.println("Hello World");
    }

}

