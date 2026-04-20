class Solution {
    public int characterReplacement(String s, int k) {

        int start=0;
        int max_len=0;
        int max_count=0;
        int[] count = new int[26];


        for(int end =0;end<s.length();end++){
            int cur_charcount=++count[s.charAt(end)-'A'];
            max_count =Math.max(max_count, cur_charcount); 

            while((end-start+1)- max_count>k ){
                count[s.charAt(start)-'A']--;
                start ++;
                
            }
            int cur_len = end-start+1;
            max_len=Math.max(max_len , cur_len);

        }
        return max_len;
        
    }
}
