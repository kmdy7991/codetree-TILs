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

        // Arrays.sort(nums);
        System.out.print(lcd(n - 1));
    }

    private static int lcd(int idx){
        if(idx == 0){
            return nums[idx];
        }
        int element = lcd(idx - 1);
        // System.out.println("element = " + element);
        return element % nums[idx] == 0 ? Math.max(element, nums[idx]) : nums[idx] * element;

    }
}