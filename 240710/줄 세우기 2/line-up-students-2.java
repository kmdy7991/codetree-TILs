import java.util.*;

class Student implements Comparable<Student> {
    int height;
    int weight;
    int num;

    Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student student){
        if (this.height == student.height){
            return student.weight - this.weight;
        }
        return this.height - student.height;
    }

    @Override
    public String toString(){
        return this.height + " " + this.weight + " " + this.num;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] student = new Student[n];
        for (int i = 0; i < n; i++){
            student[i] = new Student(sc.nextInt(), sc.nextInt(), i + 1);
        }

        Arrays.sort(student);

        for(Student s : student){
            System.out.println(s);
        }
    }
}