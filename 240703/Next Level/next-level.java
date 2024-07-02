import java.util.*;
class User{
    String id;
    String level;
    User(){
        this.id = "codetree";
        this.level = "10";
    }
    User(String id, String level){
        this.id = id;
        this.level = level;
    }

    @Override
    public String toString(){
        return String.format("user %s lv %s", this.id, this.level);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        System.out.println(new User());
        System.out.print(new User(st.nextToken(), st.nextToken()));
    }
}