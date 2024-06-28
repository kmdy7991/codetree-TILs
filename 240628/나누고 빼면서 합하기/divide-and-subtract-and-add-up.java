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

        System.out.print(calculate(m));
    }

    private static int calculate(int m){
        int res = 0;
        while (m != 1){
            res += nums[m - 1];
            m = m % 2 == 0 ? m / 2 : m - 1;
        }

        return res + nums[m - 1];
    }

}