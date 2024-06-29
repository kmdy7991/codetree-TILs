import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        star(n);
    }

    private static void star(int cnt) {
        if(cnt == 0){
            return;
        }
        for(int i = 0; i < cnt; i++){
            System.out.print("* ");
        }
        System.out.println();

        star(cnt - 1);

        for(int i = 0; i < cnt; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}