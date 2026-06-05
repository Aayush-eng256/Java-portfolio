/*The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2 */

public class MajorityElements {
    public static int bruteMajority(int arr[]) {
        for(int i = 0;i<arr.length;i++) {
            int freq = 0;
            for(int j = 0;j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                    freq++;
                }
            }
            if(freq > arr.length/2) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.print(bruteMajority(arr));
    }
}