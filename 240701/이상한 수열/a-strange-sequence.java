import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(find(n));
    }

    private static int find(int num){
        if(num < 2){
            return 1;
        }
        if(num == 2){
            return 2;
        }
        return find(num / 3) + find(num - 1);
    }
}