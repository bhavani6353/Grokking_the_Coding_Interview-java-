/*


We are given an unsorted array containing ‘n+1’ numbers taken from the range 1 to ‘n’. The array has only one duplicate but it can be repeated multiple times. Find that duplicate number without using any extra space. You are, however, allowed to modify the input array.

Example 1:

Input: [1, 4, 4, 3, 2]
Output: 4
Example 2:

Input: [2, 1, 3, 3, 5, 4]
Output: 3
Example 3:

Input: [2, 4, 1, 4, 4]
Output: 4


*/



class FindDuplicate {
    public static int findNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i]!=i+1){
                if(nums[i]!=nums[nums[i]-1])
                    swap(nums,i,nums[i]-1);
                else
                    return nums[i];
            }
            else
                i++;
        }
        return -1;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        System.out.println(FindDuplicate.findNumber(new int[] { 4,3,2,7,8,2,3,1}));
        System.out.println(FindDuplicate.findNumber(new int[] { 2, 1, 3, 3, 5, 4 }));
        System.out.println(FindDuplicate.findNumber(new int[] { 2, 4, 1, 4, 4 }));
    }
}
