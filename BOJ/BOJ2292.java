import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 현재 위치로 가기까지 거리는 거리
        int num = 1;

        // 입력받은 현재 위치를 저장한 변수
        int location = Integer.parseInt(br.readLine());

        // 위치 제한을 걸어줄 떄, 단계별로 +6, +12, +18 이런식으로 늘어나므로 그때 사용하기 위한 변수
        int index = 0;

        // 위치 제한을 나타내는 변수. 이 변수에 위에서 말한 +6, +12, +18 이 값들이 실제로 더해진다.
        int size_limit = 1;

        // 위치값이 사이즈 제한보다 큰 경우에만 반복문 돌린다.
        // 만약 현재 위치가 1인 경우, 반복문을 건너뛰지만
        // 거리의 값 num이 1로 초기화 되어있으므로 그대로 num을 출력해도 문제없다.
        while(location > size_limit){
            index++;
            size_limit += index*6;
            num++;
        }
        bw.write(num+"");
        bw.flush();
    }
}
