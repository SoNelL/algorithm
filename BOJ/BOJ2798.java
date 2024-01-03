import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ2798{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int length = 0;
        int maxLimit = 0;

        st = new StringTokenizer(br.readLine(), " ");
        length = Integer.parseInt(st.nextToken());
        maxLimit = Integer.parseInt(st.nextToken());

        int[] cardList = new int[length];
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < length; i++){
            cardList[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;

        for(int i = 0; i < length - 2; i++){
            for(int j = i + 1; j < length - 1; j++){
                for(int k = j + 1; k < length; k++){
                    if(sum < cardList[i] + cardList[j] + cardList[k] && cardList[i] + cardList[j] + cardList[k] <= maxLimit)
                        sum = cardList[i] + cardList[j] + cardList[k];
                }
            }
        }
        bw.write(sum+"");
        bw.flush();
    }
}
