public class scopeex1 {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        String name = "rohit";

        {
      //      int a = 78 //already initialised outside the block in the same method,hence you cannot initialise again inside
            a = 100; //reassign the original ref variable to some other value
            System.out.println(a);
            int c = 99;
            //value initialised in this block , will remain in block
        }
        int c =900;//we can re initialise it outside the block
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c); //cannot use outside the block

        //scoping in for loops
        for(int i = 0 ; i<4;i++){
            System.out.println(i);
            int nums = 90;
     //       int a =10; // a is already variable see above
            a = 1000;

        }
    //    System.out.println(i);// i will give error as it cant be work outside the loop
        System.out.println();
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
