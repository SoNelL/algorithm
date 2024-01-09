import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    // a를 b만큼 곱한 후 c로 나눈 나머지를 구하는 함수 (재귀함수)
    // 원리는 k승의 값을 알면 2k승과 2k+1승을 O(1)에 구할 수 있다는 원리를 이용함
    static long POW(long a, long b, long c){
        // base condition
        if(b==1) return a%c;

        // 현재의 b승 값을 O(1)에 구하기 위해 b/2승 값을 구한다.
        long val = POW(a,b/2,c);

        // 위에서 구한 b/2승 값을 이용하여 b승 값을 구한다.
        val = val * val % c;

        // 짝수일 경우 문제없이 구한 값을 그대로 출력한다.
        if(b%2==0) return val;

        // 홀수일 경우 a를 한번 더 곱한 후 값을 출력한다.
        return val * a % c;
    }

    // 메인
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        bw.write(POW(a,b,c)+"");
        bw.flush();
    }
}
