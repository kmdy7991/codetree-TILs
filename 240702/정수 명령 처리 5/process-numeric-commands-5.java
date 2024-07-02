import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(in.readLine());
        
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(in.readLine());
            switch(st.nextToken()){
                case "push_back":
                    nums.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_back":
                    nums.remove(nums.size() - 1);
                    break;
                case "size":
                    System.out.println(nums.size());
                    break;
                case "get":
                    System.out.println(nums.get(Integer.parseInt(st.nextToken()) - 1));
                    break;
            }
        }
    }
}