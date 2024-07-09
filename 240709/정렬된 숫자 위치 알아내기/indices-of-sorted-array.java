import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;

        int n = sc.nextInt();
        sc.nextLine();
        

        int[] origin = new int[n];
        int[] nums = new int[n];

        st = new StringTokenizer(sc.nextLine());
        for(int i = 0; i < n; i++){
            origin[i] = nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        Map<Integer, Integer> res = new HashMap<>();
        for(int i = 0; i < n; i++){
            res.put(nums[i], i + 1);
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(res.get(origin[i]) + " ");
        }
    }
}