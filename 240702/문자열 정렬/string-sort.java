import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        Arrays.sort(str);
        System.out.print(new String(str));
    }
}