import java.util.Scanner;
public class SwappingCode {
    public static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;

          System.out.println("After swapping the value of a and b are: " + a + " " + b);
          
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a & b respectively.");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("The value of a and b are:" + a + " " + b);
    swap(a,b);
  sc.close();
}
}