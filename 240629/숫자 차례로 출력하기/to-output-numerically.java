import java.util.*;

public class Main {
    static int n;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        output(1);
    }

    private static void output(int num){
        if(num > n){
            System.out.println();
            return;
        }
        
        System.out.print(num + " ");
        output(num + 1);
        System.out.print(num + " ");
    }
}