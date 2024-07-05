import java.util.*;

class Student implements Comparable<Student> {
    int height;
    int weight;
    int number;

    Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student){
        if (this.height == student.height) {
            if(this.weight == student.weight) {
                return - this.number - student.number;
            }
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }

    @Override
    public String toString(){
        return this.height + " " + this.weight + " " + this.number;
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
            students[i] = new Student(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i + 1);
        }

        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}