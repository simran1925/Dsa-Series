package Recursion.Q20_WordSearch;

public class Q20_WordSearch_Optimal
{
    public static boolean exist(char[][] board, String word)
    {
        int index=0;
        int n = board.length;
        int m= board[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(index))
                {
                    if(searchNext(board,word,i,j,index, n, m))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public  static boolean searchNext(char[][]board,String word,int row,int col,int index,int n,int m)
    {
        if(word.length()==index)
        {
            return true;
        }

        if(row==n|| col==m||row<0 || col<0|| board[row][col]!=word.charAt(index)|| board[row][col]=='!')
        {
            return false;
        }

        char ch = board[row][col];
        board[row][col]='!';

        //top
        boolean top = searchNext(board,word,row-1,col,index+1,n,m);
        // right
        boolean right= searchNext(board,word,row,col+1,index+1,n,m);

        //bottom
        boolean bottom=searchNext(board,word,row+1,col,index+1,n,m);

        //left
        boolean left=searchNext(board,word,row,col-1,index+1,n,m);

        board[row][col]=ch;

        return top||right||bottom||left;
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};

        String word = "ABCCED";
        boolean res = exist(board, word);
        System.out.println(res);
    }
}
