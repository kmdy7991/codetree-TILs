import java.util.*;

public class Main {
    static class Secret{
        String code;
        String point;
        String time; 

        Secret(String code, String point, String time){
            this.code = code;
            this.point = point;
            this.time = time;
        }

        @Override
        public String toString(){
            return String.format("secret code : %s\nmeeting point : %s\ntime : %s", this.code, this.point, this.time);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        System.out.print(new Secret(st.nextToken(), st.nextToken(), st.nextToken()));


    }
}