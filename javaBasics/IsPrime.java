import java.util.Scanner;
public class IsPrime {
    public static boolean isPrime(int n) {
   if(n == 2) return true;
   if(n % 2 == 0) return false;
   for(int i = 3;i*i<=n;i+=2) {
    if(n % i == 0) {
        return false;
    }
   }
   return  true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <=1) {
            System.out.println("Prime exists only for number greater than 1");
            return;
        } else {
            if(isPrime(n) == true) {
                System.out.println("The number is Prime");
            } else {
                System.out.print("The number is not prime");
            }
        }
        sc.close();
        
    }
}