import java.util.*;

class Person {
    String name;
    String addr;
    String city;

    Person(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "name " + this.name + "\naddr " + this.addr + "\ncity " + this.city;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        StringTokenizer st;
        
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Person[] persons = new Person[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(sc.nextLine());
            persons[i] = new Person(st.nextToken(), st.nextToken(), st.nextToken());
        }

        Arrays.sort(persons, Comparator.comparing(Person::getName).reversed());
        System.out.print(persons[0]);
    }
}