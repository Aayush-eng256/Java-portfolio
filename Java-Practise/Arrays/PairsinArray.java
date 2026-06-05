public class PairsinArray {
    public static void printPairs(int arr[]) {
  for(int i = 0;i<arr.length;i++) {
    for(int j = i+1;j<arr.length;j++) {
        System.out.print("(" + arr[i] + "," + arr[j] + ")");
    }
    System.out.println();
  }
    }
public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};
    printPairs(arr);
    /*pairs will be (2,4),(2,6),(2,8),(2,10)
                     (4,6),(4,8),(4,10)
                     (6,8),(6,10)
                     (8,10) */
}    
}
