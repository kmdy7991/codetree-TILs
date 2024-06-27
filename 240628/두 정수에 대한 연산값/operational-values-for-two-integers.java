import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];
        
        nums[0] = sc.nextInt();
        nums[1] = sc.nextInt();

        change(nums);
        System.out.print(nums[0] + " " + nums[1]);
    }

    private static void change(int[] nums) {
        if (nums[0] > nums[1]){
            nums[0] += 25;
            nums[1] *= 2;
        } else {
            nums[1] += 25;
            nums[0] *= 2;
        }
    }
}