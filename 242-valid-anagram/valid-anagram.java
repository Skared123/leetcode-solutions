

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() ) return false;
        char[] sSortedCharArray = s.toCharArray();
        char[] tSortedCharArray = t.toCharArray();

        Arrays.sort(sSortedCharArray);
        Arrays.sort(tSortedCharArray);

        return Arrays.equals(sSortedCharArray, tSortedCharArray);
    }
}