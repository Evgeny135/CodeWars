package leetcode;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int head = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[head] = nums[i];
                head++;
            }
        }
        return head;
    }
}
