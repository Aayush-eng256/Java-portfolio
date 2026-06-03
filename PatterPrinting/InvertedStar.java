public class InvertedStar {
    public static void main(String[] args) {
        for(int lines = 4;lines>0;lines--) {
            for(int stars = 1;stars<=lines;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}