import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(modSequence(n));
    }

    private static int modSequence(int num){
        if (num == 1){
            return 2;
        }
        if (num == 2){
            return 4;
        }
        return (modSequence(num - 1) * modSequence(num - 2)) % 100;
    }
}