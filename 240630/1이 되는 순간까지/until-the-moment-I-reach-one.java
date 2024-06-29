import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(call(0, n));
    }

    private static int call(int cnt, int num){
        if(num == 1){
            return cnt;
        }

        num = num % 2 == 0 ? num / 2 : num / 3;
        return call(cnt + 1, num);
    }
}