import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int res = (day - 11) * 1440 + (hour - 11) * 60 + minute - 11;
        System.out.print(res < 0 ? -1 : res);
    }
}