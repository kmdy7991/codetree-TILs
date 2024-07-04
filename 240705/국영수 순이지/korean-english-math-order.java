import java.util.*;

class Student {
    String name;
    int kor;
    int eng;
    int math;

    Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getKor(){
        return this.kor;
    }

    public int getEng(){
        return this.eng;
    }

    public int getMath(){
        return this.math;
    }

    @Override
    public String toString(){
        return this.name + " " + this.kor + " " + this.eng + " " + this.math;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;

        int n = Integer.parseInt(sc.nextLine());

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(sc.nextLine());
            students[i] = new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(students, Comparator.comparing(Student::getKor).thenComparing(Student::getEng).thenComparing(Student::getMath).reversed());
        for (Student s : students) {
            System.out.println(s);
        }
    }
}