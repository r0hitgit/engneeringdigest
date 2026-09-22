public class kunalPattern {
    static void main(String[] args) {
        printPattern28(4);
    }
    static void printPattern31(int n ){
        int originalN=n;
        n=2*n;
        for(int row =0;row<=n;row++){
            for(int col =0;col<=n;col++){
                int atEveryIndex = originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    static void printPattern17(int n ){
        //for numeric pattern we always
        for(int row =1;row<2*n;row++){
            int c =row>n ? 2*n-row :row;
            for(int space =0; space < n-c; space++){
                System.out.print("  ");
            }

            for(int col =c;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=c;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }


    static void printPattern30(int n ){
        //for numeric pattern we always
        for(int row =1;row<n;row++){
            for(int space =0; space < n-row; space++){
                System.out.print("  ");
            }
            for(int col =row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void printPattern28(int n ){
        for(int row =0;row<2*n;row++){
            // we have to identify how many col we have to print
            int totalColInRow = row>n ? 2*n-row :row;       // ? mean agr given condition(row>n) huwa toh 2*n-row+1 : means otherwise row hi totalColInRow hoga
            int noOfSpace =n-totalColInRow;
            for(int s=0;s<noOfSpace;s++){
                System.out.print(" ");
            }
            for(int col =0;col<totalColInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void printPattern4(int n ){
        for(int row =1;row<=n;row++){
            //for every row run the col
            for(int col =1;col<=row;col++){
                System.out.print(col);
            }
            //when one row is printed,we need to add new line
            System.out.println();
        }
    }

    static void printPattern5(int n ){
        for(int row =0;row<2*n;row++){
            // we have to identify how many col we have to print
            int totalColInRow = row>n ? 2*n-row :row;       // ? mean agr given condition(row>n) huwa toh 2*n-row+1 : means otherwise row hi totalColInRow hoga
            for(int col =0;col<totalColInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void printPattern3(int n ){
        for(int row =1;row<=n;row++){
            for(int col =1;col<=n+1-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void printPatter1(int n ){
        for(int row =1;row<=n;row++){
            for(int col =1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void printPattern2(int n ){
        for(int row =1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
