class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> setNums = new HashSet<>();

        for (int num : nums){
            setNums.add(num);
        }

        int longest = 0;

        for (int num : setNums) {
            int currentNumber = num;
            int currentStreak = 1;
            if (!setNums.contains(currentNumber - 1 )){
                while(setNums.contains(currentNumber + 1)) {
                    currentNumber += 1;
                    currentStreak += 1;
                }
                longest = Math.max(longest,currentStreak);
            }
        }
        return longest;
    }
}