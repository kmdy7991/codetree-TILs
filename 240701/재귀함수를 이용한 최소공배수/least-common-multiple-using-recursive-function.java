import java.util.*;

public class Main {
    static int[] nums;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int sum = nums[0];
        for (int i = 1; i < n; i++){
            sum = lcd(sum, nums[i]);
        }
        // Arrays.sort(nums);
        System.out.print(sum);
    }

    private static int lcd(int n, int m){
        return n * m / gcd(n, m);
    }

    private static int gcd(int n, int m){
        if(m == 0){
            return n;
        }
        return gcd(m, n % m);
    }
}