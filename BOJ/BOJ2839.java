import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kg = Integer.parseInt(br.readLine());
        
        // 보면 5kg 봉투를 많이 쓸 수록 사용되는 봉투의 수를 최소화 시킬 수 있다.
        // 그렇기 때문에 먼저 5kg 봉투가 딱 맞아 떨어지는 경우에 먼저 제한을 걸어주고 그 이후에
        // 5kg을 최대로 쓰고 나서 3kg 봉투를 쓰는 경우에 제한을 걸어주고
        // 5kg봉투를 최대로 사용하고 나서 3kg봉투가 맞아 떨어지지 않는 경우
        // 해당 값에서 부터 사용하는 5kg봉투의 수를 하나씩 줄여가며 3kg봉투의 사용이 맞아
        // 떨어지는 경우를 만나면 제한이 걸리도록 해준다.
        // 봉투 사용이 가능한 최대로 봉투를 많이 사용하는 경우는 3kg봉투만 사용했을때 맞아떨아지는 경우이고
        // 이 것도 안되는 경우에는 봉투에 담을 수 없는 경우이므로 -1을 출력해주도록 한다.
        if(kg%5==0){
            bw.write(kg/5+"");
        } else{
            if((kg%5)%3==0)
                bw.write(kg/5 + kg%5/3 + "");
            else{
                int will5, will3;
                will3 = kg%5;
                will5 = kg-will3;
                while(true){
                    if(will5>=0&&will3%3==0){
                        bw.write(will5/5+will3/3+"");
                        break;
                    } else if(will5>=0 && will3%3!=0) {
                        will5 -= 5;
                        will3 += 5;
                        continue;
                    } else {
                        bw.write(-1+"");
                        break;
                    }
                }
            }
        }
        bw.flush();
    }
}
