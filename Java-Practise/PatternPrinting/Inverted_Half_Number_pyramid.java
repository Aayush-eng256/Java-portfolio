public class Inverted_Half_Number_pyramid {
    public static void invertedNumberPyramid(int n) {
        // outer loop 
        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=n-i+1;j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    int n = 4;
    invertedNumberPyramid(n);
}
}