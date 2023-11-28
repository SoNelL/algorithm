import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ1018{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int boardRows = Integer.parseInt(st.nextToken());
        int boardCols = Integer.parseInt(st.nextToken());
        char[][] board = new char[boardRows][boardCols];
        for(int i = 0; i < boardRows; i++){
            board[i] = br.readLine().toCharArray();
        }
        int sum = 0;
        int min = 64;
        for(int rowMoving = 0; rowMoving < boardRows-8+1; rowMoving++){
            for(int colMoving = 0; colMoving < boardCols-8+1; colMoving++){
                sum = 0;
                for(int i = 0+rowMoving; i < 8+rowMoving; i++){
                    for(int j = 0+colMoving; j < 8+colMoving; j++){
                        if(board[i][j] != checkWB(board[rowMoving][colMoving],i,j)) sum++;
                    }
                }

                sum = Math.min(sum,64-sum);
                min = Math.min(sum,min);
            }
        }
        bw.write(min+"");
        bw.flush();
    }
    static char checkWB(char firstColor, int row, int col){
        if(firstColor == 'W'){
            if(row%2==0){
                if(col%2==0)
                    return 'W';
                else
                    return 'B';
            } else {
                if(col%2==0)
                    return 'B';
                else
                    return 'W';
            }
        } else {
            if(row%2==0){
                if(col%2==0)
                    return 'B';
                else
                    return 'W';
            } else {
                if(col%2==0)
                    return 'W';
                else
                    return 'B';
            }
        }
    }
}
