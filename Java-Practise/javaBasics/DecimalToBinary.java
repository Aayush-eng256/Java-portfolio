import java.util.Scanner;
public class DecimalToBinary {
    public static int decToBin(int dec) {
        int bin = 0;
        int pow = 0;
        while(dec > 0) {
            int rem = dec % 2;
            bin+= rem*(int)Math.pow(10,pow);
            dec/=2;
            pow++;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of decimal number: ");
        int dec = sc.nextInt();
        System.out.println("The value of decimal number " + dec + "to BinaryNumber is: "+ decToBin(dec));
    }
}