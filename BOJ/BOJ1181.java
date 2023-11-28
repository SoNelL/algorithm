//  단어 정렬
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class BOJ1181{
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        ArrayList<String> words = new ArrayList<>(nums);
        String box;
        for(int i = 0; i < nums; i++){
            box = br.readLine();
            if(!words.contains(box)) words.add(box);
        }
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length())
                    return o1.length() - o2.length();
                else
                    return o1.compareTo(o2);
            }
        });
        for(int i = 0; i < words.size(); i++){
            bw.write(words.get(i)+"\n");
        }
        bw.flush();
    }
}
