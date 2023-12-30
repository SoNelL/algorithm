import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ4153{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받은 삼각형 변의 값을 1차적으로 저장할 String 변수
        String inputString;
        StringTokenizer st;

        // 입력받은 삼각형의 각 변의 길이를 저장할 배열
        int[] intArr = new int[3];




        // 입력받은 각 행을 검사하는 반복문
        do{
            // 최댓값을 저장할 int 변수 max, 최댓값의 index를 저장할 변수 index
            int max = 0;
            int index = 0;

            // 입력값들을 String에서 int값으로 처리
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 3; i++){
                intArr[i] = Integer.parseInt(st.nextToken());
                if(intArr[i] > max){
                    index = i;
                    max = intArr[i];
                }
            }

            // 0 0 0 일때 반복문 종료
            if(intArr[0]==0) break;

            // 최대길이 변이 아닌 나머지 변들의 제곱의 합을 저장할 변수 sum
            int sum = 0;

            // 직각삼각형의 참 거짓을 판단하기 위한 for문
            for(int i = 0; i < 3; i++){
                if(i != index) {
                    sum += Math.pow(intArr[i], 2);
                }
            }

            // right, wrong을 구별하여 출력해주는 if문
            if((int)Math.pow(max,2)==sum)
                bw.write("right"+"\n");
            else
                bw.write("wrong"+"\n");
        } while(true);
        bw.flush();
    }
}
