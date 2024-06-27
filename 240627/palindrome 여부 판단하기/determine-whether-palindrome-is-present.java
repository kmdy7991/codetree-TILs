import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.print(palindrome(s) ? "Yes" : "No");
    }

    private static boolean palindrome(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        return s.equals(sb.reverse().toString());
    }
}