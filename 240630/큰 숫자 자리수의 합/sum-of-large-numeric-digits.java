import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        System.out.print(modNum(n * m * l));
    }

    private static int modNum(int num){
        if (num < 10){
            return num % 10;
        }

        return modNum(num / 10) + (num % 10);
    }
}