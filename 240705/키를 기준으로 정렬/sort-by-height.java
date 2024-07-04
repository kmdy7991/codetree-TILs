import java.util.*;

class Person{
    String name;
    String height;
    String weight;

    Person(String name, String height, String weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getHeight(){
        return this.height;
    }

    @Override
    public String toString(){
        return this.name + " " + this.height + " " + this.weight;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;

        int n = Integer.parseInt(sc.nextLine());

        Person[] person = new Person[n];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(sc.nextLine());
            person[i] = new Person(st.nextToken(), st.nextToken(), st.nextToken());
        }

        Arrays.sort(person, Comparator.comparing(Person::getHeight));
        for (Person p : person) {
            System.out.println(p);
        }
    }
}