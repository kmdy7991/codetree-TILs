import java.util.*;
public class Main {
    static int n;
    static int[] nums;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        sort(1);
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();
        
        sort(-1);
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
    }

    private static void sort(int flag){
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(nums[i] * flag > nums[j] * flag){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

}