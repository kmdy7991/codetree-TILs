import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String match = st.nextToken();

        String[] words = new String[n];
        for(int i = 0; i < n; i++){
            words[i] = in.readLine();
        }

        String answer = Stream.of(words)
                                .filter(i -> i.startsWith(match))
                                .sorted()
                                .toArray(String[]::new)[m - 1];

        System.out.print(answer);
    }
}