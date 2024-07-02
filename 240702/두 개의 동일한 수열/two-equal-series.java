import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < (n << 1); i++){
            set.add(sc.nextInt());
        }

        System.out.print(set.size() == n ? "Yes" : "No");
    }
}