// 팰린드롬수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str,strCheckbox;
        StringBuilder sb;
        for(str = br.readLine();!str.equals("0");str = br.readLine()){
            sb = new StringBuilder(str);
            strCheckbox = sb.reverse().toString();
            if(str.equals(strCheckbox)){
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        bw.flush();
    }
}
