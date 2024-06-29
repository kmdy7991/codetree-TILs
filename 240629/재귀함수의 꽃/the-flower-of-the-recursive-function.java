import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        output(n);
    }

    private static void output(int num) {
        if(num == 0){
            return;
        }

        System.out.print(num + " ");
        output(num - 1);
        System.out.print(num + " ");
    }
}