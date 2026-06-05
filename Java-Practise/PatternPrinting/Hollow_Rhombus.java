public class Hollow_Rhombus {
    public static void print_Hollow_Rhombus(int n) {
     // outerLoop
     for(int i = 1;i<=n;i++) {
        // spaces
        for(int j = 1;j<=(n-i);j++) {
            System.out.print(" ");
        }
         for(int j = 1;j<=n;j++) {
            if(i == 1 || i == n || j == 1 || j == n) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

         }
         System.out.println();
     }
    }
    public static void main(String[] args) {
        int n = 5;
        print_Hollow_Rhombus(n);
    }
}