import java.util.Scanner;
public class BinomialCoeff {
    public static int factorial(int n) {
        if(n < 0) {
            return -1;
        }
        int fac = 1;
        for(int i = 1;i<=n;i++) {
            fac*=i;
        }
        return fac;
    }
    public static int binoCoeff(int n,int r) {
        // edge case-1 
        if(r > n) {
            return 0;
        }
        // egde case - 2
        if(r < 0) {
            return 0;
        }
        int n_Fac = factorial(n);
        int r_Fac = factorial(r);
        int n_R = factorial(n-r);

        return n_Fac/(r_Fac*n_R);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r : ");
        int n = sc.nextInt();
        if(n < 0) {
            System.out.print("The factorial of Negative not exits");
            sc.close();
            return;
        }
        int r = sc.nextInt();
        System.out.print("The value of ncr is: " + binoCoeff(n, r));
        sc.close();
        
    }
}