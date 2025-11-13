public class scopeex {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //System.out.println(marks); >>>>>this marks will give an error

    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks); //we can only acces these variable inside this fuction which is marks
    }
}
