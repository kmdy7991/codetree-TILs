import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        
        abs(n, nums);
        for (int num : nums){
            System.out.print(num + " ");
        }
    }

    private static void abs(int n, int[] nums) {
        for(int i = 0; i < n; i++){
            nums[i] = Math.abs(nums[i]);
        }
    }
}