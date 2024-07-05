import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int height;
    int weight;

    Student(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student){
        if(this.height == student.height){
            return student.weight - this.weight;
        }
        return this.height - student.height;
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

        Student[] students = new Student[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(sc.nextLine());
            students[i] = new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}