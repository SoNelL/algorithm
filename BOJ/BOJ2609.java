import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2609 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // min = 최대 공약수를 구해서 담을 변수
        int min = Math.min(a,b);

        // 최대 공약수를 구하는 반복문
        while(min>0){
            if(a%min==0&&b%min==0)
                break;
            else
                min--;
        }

        // max = 최소 공배수를 구하여 담을 변수
        int max = 1;

        // div = 최소 공배수를 구할 때 사용하는 나누기 인자
        int div = 0;
        while(!(div>a || div>b)){
            div = 2;
            while(!(div>a || div>b)){
                if(a%div == 0 && b%div == 0){
                    max *= div;
                    a/=div;
                    b/=div;
                    break;
                } else {
                    div++;
                }
            }
        }

        // 위 인자들과 남은 서로소인 a, b를 모두 곱하면 최소 공배수를 구할 수 있음
        max = max * a * b;
        bw.write(min + "\n" + max);
        bw.flush();
    }
}
