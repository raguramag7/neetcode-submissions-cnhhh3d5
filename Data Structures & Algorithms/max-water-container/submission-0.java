class Solution {
    public int maxArea(int[] heights) {
        int i =0;
        int j =heights.length-1;
        int max = 0;
    while(i<j){
        int cur_amt = (j-i)*Math.min(heights[i],heights[j]);
        max=Math.max(max,cur_amt);
        if(heights[i]<heights[j]){
            i++;
        }
        else{
            j--;
        }
    }
    return max;        
    }
}
