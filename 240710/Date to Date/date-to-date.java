import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int startMonth = sc.nextInt();
        int startDay = sc.nextInt();
        int endMonth = sc.nextInt();
        int endDay = sc.nextInt();

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int res = 0;
        for(int i = startMonth - 1; i < endMonth - 1; i++){
            res += days[i];
        }

        System.out.print(res - startDay + endDay + 1);
        
    }
}