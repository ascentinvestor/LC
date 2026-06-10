class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x = 0; x < nums.length; x++) {
            if (map.containsKey(nums[x])) {
                int j = map.get(nums[x]);

                if (Math.abs(x - j) <= k) {
                    return true;
                }
            }

            map.put(nums[x], x);
        }

        return false;
    }
}