import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // sort를 Comparator의 compare을 오버라이딩하여 정렬하기 위해 사용 
        ArrayList<Double> scoreList = new ArrayList<>();

        // 과목 수 (subject Numbers)
        double subNum = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < subNum; i++){
            scoreList.add(Double.parseDouble(st.nextToken()));
        }
        scoreList.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                if(o1>o2) return -1;
                else return 1;
            }
        });
        
        // scoreList의 0 인덱스 값을 max에 삽입
        double max = scoreList.get(0);
        
        // 개선된 점수의 총합이 저장될 sum 변수
        double sum = 0;
        
        // 개선된 점수의 총합을 계산
        for(int i = 0; i < subNum; i++){
            sum += scoreList.get(i)/max*100;
        }
        
        // 평균값을 출력하기 위해 sum에서 과목수인 subNum을 나눈값을 출력
        bw.write(sum/subNum+"");
        bw.flush();
    }
}
