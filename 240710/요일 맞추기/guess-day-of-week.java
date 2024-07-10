import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String[] weeks = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int start = d1;
        int end = d2;
        
        for(int i = 0; i < m1 - 1; i++){
            start += days[i];
        }

        for(int i = 0; i < m2 - 1; i++){
            end += days[i];
        }

        int res = Math.abs(start - end);
        System.out.print(weeks[(8 - (res % 7)) % 7]);
    }
}