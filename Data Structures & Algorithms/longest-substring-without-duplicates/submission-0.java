class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set =new HashSet<>();
        int start =0;
        
        int max=0;

        for(int end =0;end<s.length();end++){
            char w =s.charAt(end);

            while(set.contains(w)){
                set.remove(s.charAt(start));
                start++;           
            }
            set.add(w);
            max=Math.max(end-start+1,max);            
        }
        return max;
    }
}
