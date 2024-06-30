import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(sequence(n, 0));
    }

    private static int sequence(int num, int cnt){
        if(num == 1){
            return cnt;
        }

        return sequence(num % 2 == 0 ? num / 2 : num * 3 + 1, cnt + 1);
    }
}