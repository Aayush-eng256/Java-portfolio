import java.util.Scanner;
public class BinaryToDec {
    public static int binToDec(int bin) {
        int dec = 0;
        int pow = 0;
        int myNum = bin;
  while(bin > 0) {
  int lastDigit = bin % 10;
    dec+= lastDigit*(int)Math.pow(2,pow);
    bin = bin/10;
    pow++;
 }
   return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of binary Number: ");
        int bin = sc.nextInt();
        System.out.println("The value of binary " + bin + "in decimal is: " + binToDec(bin));
        sc.close();
    }
}