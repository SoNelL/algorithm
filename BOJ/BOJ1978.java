import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ1978{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력값 첫번째 줄에 주어지는 수의 갯수를 저장할 변수 N
        int N = Integer.parseInt(br.readLine());

        // 입력값들을 저장할 배열 intArr
        int[] intArr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        // 입력값들을 int로 변환하여 intArr에 저장하는 for문
        for(int i = 0; i < N; i++){
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        // 소수의 갯수를 저장하기 위한 변수 num
        int num = 0;

        for(int i : intArr){
            if(isPrime(i))
                num++;
        }

        bw.write(num+"");
        bw.flush();
    }

    // 입력값 num이 소수인지 검사하는 함수
    static boolean isPrime(int num){
        if (num < 2)
            return false;
        else if (num == 2)
            return true;
        else {
            for(int i = 2; i < num; i++){
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }
}
