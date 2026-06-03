import java.util.Scanner;
public class PrintAllPrime {
    public static void printAllPrime(int n) {
        for(int i = 2;i<=n;i++) {
            if(isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int n) {
  if(n == 2) return true;
  if(n % 2 == 0) return false;
  for(int i = 3;i*i<=n;i+=2) {
    if(n % i == 0) {
        return false;
    }
  } return true;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n to print prime in range: ");
    int n = sc.nextInt();
    if(n <= 1) {
        System.out.print("Prime exists for number greater than 1");
    } else {
    printAllPrime(n);
    sc.close();
    }
}

}