package easy;

public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target<=nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    };

    public static void main(String[] args) {
        Solution35 solution = new Solution35();
        int[] nums = {1,2,3,4,5};
        int target = 6;
        System.out.println(solution.searchInsert(nums, target));

    }
    }


