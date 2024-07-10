import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;

        int n = sc.nextInt();
        sc.nextLine();
        
        int[] origin = new int[n];
        int[][] nums = new int[n][2];

        st = new StringTokenizer(sc.nextLine());
        for(int i = 0; i < n; i++){
            origin[i] = nums[i][0] = Integer.parseInt(st.nextToken());
            nums[i][1] = i;
        }

        Arrays.sort(nums, Comparator.comparing(i -> i[0]));
        
        int[] orders = new int[n];
        for (int i = 0; i < n; i++){
            orders[nums[i][1]] = i + 1;
        }

        for (int order : orders){
            System.out.print(order + " ");
        }
    }
}