/*The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2 */
import java.util.Arrays;
public class MajorityElements {
    public static int MooresAlgorithm(int arr[]) {
        int freq = 0, ans = 0;
        for(int i = 0;i<arr.length;i++) {
            if(freq == 0) {
                ans = arr[i];
            }
            if(ans == arr[i]) {
                freq++;
            } else {
                freq--;
            }
        }
          return ans;
    }
    public static int optimizeMajority(int arr[]) {
        // first i will sort this array 
        Arrays.sort(arr);
        int freq = 1;
        int ans = arr[0];
        int n = arr.length;
        for(int i = 1;i<n;i++) {
        if(arr[i] == arr[i-1]) {
            freq++;
        } else {
            freq = 0;
            ans = arr[i];
        }
        if(freq > n/2) {
            return freq;
        }
        }
        return ans;
    }
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
        System.out.print(optimizeMajority(arr));
    }
}