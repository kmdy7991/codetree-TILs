import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] nums = new int[n << 1];
        for(int i = 0; i < (n << 1); i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        int res = 0;
        for(int i = 0; i < n; i++){
            res = res > (nums[i] + nums[(n << 1) - 1 - i]) ? res : nums[i] + nums[(n << 1) - 1 - i];
        }
        System.out.print(res);

    }
}