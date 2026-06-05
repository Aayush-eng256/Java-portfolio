public class ReverseanArray {
    // using for loop
    public static void reverse_for(int arr[]) {
        for(int i = 0,j = arr.length-1;i<j;i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    // using while loop
    public static void reverse_while(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
public static void main(String[] args) {
    int arr[] = {2,4,6,8,10};
    reverse_for(arr);
    for(int i = 0;i<arr.length;i++) {
        System.out.print(arr[i] + " ");
    }
}    
}
