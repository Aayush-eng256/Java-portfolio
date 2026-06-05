import java.util.Scanner;
public class Factorial {
    public static long factorial(int val) {
        if(val < 0) {
            return -1;
        }
        long fac = 1;
        for(int i = 1;i<=val;i++) {
            fac*=i;
        }
       return fac;
    }
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int val = sc.nextInt();
if(val < 0) {
    System.out.print("Factorial of Negative Numbers not exists");
} else {
System.out.println("The Factorial of " + val + ": is " + factorial(val));
    }
}
}
