// LeetCode 1: Two Sum
// Time Complexity: O(n)
// Space Complexity: O(n)

var twoSum = function(nums, target) {
    const map = {};
    for (let i = 0; i < nums.length; i++) {
        const diff = target - nums[i];
        if (map[diff] !== undefined) {
            return [map[diff], i];
        }
        map[nums[i]] = i;
    }
};
