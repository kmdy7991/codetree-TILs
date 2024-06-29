import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(sum(n));
    }
    private static int sum(int num){
        if(num < 1){
            return 0;
        }

        return num + sum(num - 2);
    }
}