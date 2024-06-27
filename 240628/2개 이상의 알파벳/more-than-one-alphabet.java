import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.print(another(s) ? "Yes" : "No");
    }

    private static boolean another(String s){
        int num = 0;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++){
            if (num != s.charAt(i)){
                num = s.charAt(i);
                cnt++;
            }
            
            if(cnt >= 2){
                return true;
            }
        }
        return false;
    }
}