import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        System.out.print(fibo(n));
    }

    private static int fibo(int num){
        if (num <= 2){
            return 1;
        }

        return fibo(num - 1) + fibo(num - 2);
    }
    
}