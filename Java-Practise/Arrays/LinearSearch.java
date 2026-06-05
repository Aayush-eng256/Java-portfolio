public class LinearSearch {
    public static int linearSearch(int arr[],int key) {
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] == key) {
                return i;
            }
        }
           return -1;
    }
public static void main(String[] args) {
    int arr[] = {2,4,6,8,10,12,14,16};
    int key = 2;
    if(linearSearch(arr, key) == -1) {
        System.out.print("Key not found");
    } else {
    System.out.print("The key is at index: " + linearSearch(arr,key));
}
}
}