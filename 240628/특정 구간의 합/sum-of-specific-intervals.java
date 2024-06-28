import java.util.*;

public class Main {
    static int[] nums;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            System.out.println(sum(sc.nextInt(), sc.nextInt()));
        }
    }

    private static int sum(int n, int m){
        int res = 0;
        for(int i = n - 1; i < m; i++){
            res += nums[i];
        }

        return res;
    }
}