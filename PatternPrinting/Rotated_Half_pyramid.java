public class Rotated_Half_pyramid {
    public static void printHalf_Pyramid(int n) {
        // outer loops
        for(int i = 1;i<=n;i++) {
            // inner loop for printing spaces
            for(int j = 1;j<=n-i;j++) {
                System.out.print(" ");
            }
            // inner loop for printing stars
            for(int j = 1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    int n = 4;
    printHalf_Pyramid(n);
}
}