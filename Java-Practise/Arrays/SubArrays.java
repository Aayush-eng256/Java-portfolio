public class SubArrays {
    public static void SubArrays(int arr[]) {
        for(int start = 0;start<arr.length;start++) {
            for(int end = start;end<arr.length;end++) {
                for(int k = start;k<=end;k++) {
                    System.out.print( arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        /*Subarrays will be (2),(2,4),(2,4,6),(2,4,6,8),(2,4,6,8,10)
                            (4),(4,6),(4,6,8),(4,6,8,10)
                            (6),(6,8),(6,8,10)
                            (8),(8,10); */
                            SubArrays(arr);
    }
}