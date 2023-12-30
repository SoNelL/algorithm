import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class BOJ2231{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int intnum = Integer.parseInt(br.readLine());
        for(int i = 1; i < intnum+1; i++){
            int num_sum = i + sum(i);
            if(num_sum==intnum) {
                bw.write(i + "");
                bw.flush();
                return;
            }
        }
        bw.write("0");
        bw.flush();
    }
    static int sum(int num){
        int result = 0;
        for(;num!=0;num/=10){
            result += num%10;
        }
        return result;
    }
}
