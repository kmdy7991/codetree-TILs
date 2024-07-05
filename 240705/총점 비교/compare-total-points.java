import java.util.*;

class Student implements Comparable<Student> {
    String name;
    String firstSubject;
    String secondSubject;
    String thirdSubject;

    Student(String name, String firstSubject, String secondSubject, String thirdSubject){
        this.name = name;
        this.firstSubject = firstSubject;
        this.secondSubject = secondSubject;
        this.thirdSubject = thirdSubject;
    }

    public int sum(){
        return Integer.parseInt(this.firstSubject) +
               Integer.parseInt(this.secondSubject) +
               Integer.parseInt(this.thirdSubject);
    }

    @Override
    public int compareTo(Student student){
        return this.sum() - student.sum();
    }

    @Override
    public String toString(){
        return this.name + " " + this.firstSubject + " " + this.secondSubject + " " + this.thirdSubject;
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
            students[i] = new Student(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
        }

        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}