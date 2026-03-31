class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] row =new int[9];
        int[] col =new int[9];
        int[] boxes=new int[9];

        for (int r = 0; r<9;r++){
            for (int c=0;c<9;c++){
                if(board[r][c] =='.') continue;

                int digit = board[r][c] - '1' ;
                int mask = 1 << digit ;
                int boxindex = (r/3)*3 + (c/3);

                if((row[r] & mask) !=0||
                    (col[c] & mask) !=0||
                    (boxes [boxindex]& mask) !=0){
                        return false;
                    }

                row[r] |= mask;
                col[c] |= mask;
                boxes[boxindex] |= mask;

            }
        }
        return true ;
        
    }
}
