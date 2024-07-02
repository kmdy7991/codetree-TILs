import java.util.*;

class Bomb{
    String code;
    String color;
    String seconds;

    Bomb(String code, String color, String seconds){
        this.code = code;
        this.color = color;
        this.seconds = seconds;
    }

    @Override
    public String toString(){
        return String.format("code : %s\ncolor : %s\nsecond : %s", this.code, this.color, this.seconds);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        System.out.print(new Bomb(st.nextToken(), st.nextToken(), st.nextToken()));
    }
}