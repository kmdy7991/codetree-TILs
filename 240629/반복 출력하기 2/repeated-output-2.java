import java.util.*;

public class Main {
    static final String HELLO = "HelloWorld";
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        repeat(sc.nextInt());
    }

    private static void repeat(int cnt){
        if(cnt == 0){
            return;
        }

        System.out.println(HELLO);
        repeat(cnt - 1);
    }
}