class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='.') continue;

                char num=board[i][j];
                String rowKey="row"+i+"-"+num;
                String colKey="col"+j+"-"+num;
                String boxKey="box"+(i/3)+"-"+(j/3)+"-"+num;

                if(set.contains(rowKey)) return false;
                set.add(rowKey);
                if(set.contains(colKey)) return false;
                set.add(colKey);
                if(set.contains(boxKey)) return false;
                set.add(boxKey);
            }
        }
        return true;
    }
}