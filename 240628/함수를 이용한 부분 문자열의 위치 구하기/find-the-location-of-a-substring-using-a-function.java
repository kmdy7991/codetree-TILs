import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String s = sc.nextLine();

        int res = -1;
        for(int i = 0; i < str.length() - s.length() + 1; i++){
            if(str.substring(i, i + s.length()).equals(s)){
                res = i;
            }
        }
        System.out.print(res);
    }
}