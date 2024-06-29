import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(fact(n));
    }

    private static int fact(int num){
        if(num == 1){
            return 1;
        }
        return num * fact(num - 1);
    }
}