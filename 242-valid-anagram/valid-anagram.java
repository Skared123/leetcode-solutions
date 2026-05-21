

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() ) return false;
        char[] sSortedCharArray = s.toCharArray();
        char[] tSortedCharArray = t.toCharArray();

        Arrays.sort(sSortedCharArray);
        Arrays.sort(tSortedCharArray);

        for (int i = 0 ; i < sSortedCharArray.length ; i++) {
            if (sSortedCharArray[i] != tSortedCharArray[i]){
                return false;
            }
        }
        return true;
    }
}