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

        System.out.print(findMax(n - 1));
    }

    private static int findMax(int idx){
        if (idx == 0){
            return nums[idx];
        }

        return Math.max(nums[idx], findMax(idx - 1));
    }
}