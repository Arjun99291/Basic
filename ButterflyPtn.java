import java.util.*;
public class ButterflyPtn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n=sc.nextInt();
        sc.close();
        //upper half
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop 1 -> print *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //inner loop 2 -> print space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //inner loop 3 -> print *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        //outer loop 
        for(int i=n;i>=1;i--){
            //inner loop 1 -> print * 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //inner loop 2 -> print space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //inner loop 3 ->print *
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //for hollow Butterfly
        //upper half
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop 1
            for(int j=1;j<=i;j++){
                //for printing *
                if(j==1||i==j){
                    System.out.print("*");
                }
                else{//for printing space
                    System.out.print(" ");
                }
            }
            //inner loop 2 -> print space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //inner loop 3
            for(int j=1;j<=i;j++){
                //for printing *
                if(j==1||i==j){
                    System.out.print("*");
                }
                else{//for printing space
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //lower half
        //outer loop
        for(int i=n;i>=1;i--){
            //inner loop 1
            for(int j=1;j<=i;j++){
                //for printing *
                if(j==1||i==j){
                    System.out.print("*");
                }
                else{//for printing space
                    System.out.print(" ");
                }
            }
            //inner loop 2 -> print space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //inner loop 3
            for(int j=1;j<=i;j++){
                //for printing *
                if(j==1||i==j){
                    System.out.print("*");
                }
                else{//for printing space
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
