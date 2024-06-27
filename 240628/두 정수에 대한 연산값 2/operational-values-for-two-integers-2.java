import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        System.out.print(calculate(new int[] {sc.nextInt(), sc.nextInt()}));
    }

    private static String calculate(int[] nums) {
        if(nums[0] > nums[1]){
            nums[0] *= 2;
            nums[1] += 10;
        } else{
            nums[1] *= 2;
            nums[0] += 10;
        }
        return String.valueOf(nums[0] + " " + nums[1]);
    }

}