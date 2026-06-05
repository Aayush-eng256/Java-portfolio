public class SmallestinArray {
    public static int smallest(int arr[]) {
    int smallest = Integer.MAX_VALUE;
    for(int i = 0;i<arr.length;i++) {
       if(arr[i] < smallest) {
        smallest = arr[i];
     }
    } 
     return smallest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,3,5};
        System.out.print("The smallest value in the array is: " + smallest(arr));
    }
}
