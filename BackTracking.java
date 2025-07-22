import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args) {
        //System.out.println(count(3,3 ));
        //pathD("", 03, 03);
        boolean[][] board = new boolean[][]{
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
       //pathriver("", board, 0, 0);
       //allpaths("", board, 0, 0);
       int[][] array = new int[board.length][board[0].length];
       Matrix(" ", board, 0, 0, array, 1);
    }
    static int count(int r , int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left+right;

    }
    //Debuggig required to see
    static void path(String p , int r , int c){
        if( r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p+"D", r-1, c);
        }
        if(c > 1){
            path(p+"R", r, c-1);
        }
    }
    static void pathD(String p , int r , int c){
        if( r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r > 1 && c>1){
            path(p+"D", r-1, c-1);
        }
        if(r > 1){
            path(p+"V", r-1, c);
        }
        if(c > 1){
            path(p+"H", r, c-1);
        }
    }
    static void pathriver(String p ,boolean[][] maze, int r , int c){
        if(r==maze.length-1&& c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length-1){
            pathriver(p+"D",maze, r+1, c);
        }
        if(c < maze[0].length-1){
            pathriver(p+"R",maze, r, c+1);
        }
    }
    
    static void allpaths(String p ,boolean[][] maze, int r , int c){
        if(r==maze.length-1&& c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        //  considering this in myn path

        maze[r][c] = false;
        if(r < maze.length-1){
            allpaths(p+"D",maze, r+1, c);
        }
        if(c < maze[0].length-1){
            allpaths(p+"R",maze, r, c+1);
        }
        if(r >0){
            allpaths(p+"U",maze, r-1, c);
        }
        if(c > 0){
            allpaths(p+"l",maze, r, c-1);
        }
        // After all the functionc done i should recall  the 
        // previous maze and make as it is by pretending its not done
        // this is called Backtracking
        maze[r][c]=true;
    }
    
    static void Matrix(String p ,boolean[][] maze, int r , int c, int[][] path, int step){
        if(r==maze.length-1&& c==maze[0].length-1){
            path[r][c] = step;
            for(int[] array : path ){
                System.out.println(Arrays.toString(array));
            }
            System.out.println(p);
            System.out.println();
            return;

        }
        if(!maze[r][c]){
            return;
        }
        //  considering this in myn path

        maze[r][c] = false;
        path[r][c]= step;
        if(r < maze.length-1){
            Matrix(p+"D",maze, r+1, c , path, step+1);
        }
        if(c < maze[0].length-1){
            Matrix(p+"R",maze, r, c+1 , path , step+1);
        }
        if(r >0){
            Matrix(p+"U",maze, r-1, c , path , step+1);
        }
        if(c > 0){
            Matrix(p+"L",maze, r, c-1 , path , step+1);
        }
        // After all the functionc done i should recall  the 
        // previous maze and make as it is by pretending its not done
        // this is called Backtracking
        maze[r][c]=true;
        path[r][c]=0;
    }
    
}
