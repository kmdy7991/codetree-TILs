import java.util.*;

class Student {
    String name;
    String height;
    String weight;
    
    Student(String name, String height, String weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public int getHeight(){
        return Integer.parseInt(this.height);
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

        Student[] students = new Student[5];
        for(int i = 0; i < 5; i++){
            st = new StringTokenizer(sc.nextLine());
            students[i] = new Student(st.nextToken(), st.nextToken(), st.nextToken());
        }

        Arrays.sort(students, Comparator.comparing(Student::getName));
        
        System.out.println("name");
        for (Student student : students) {
            System.out.println(student);
        }

        Arrays.sort(students, Comparator.comparing(Student::getHeight).reversed());
        
        System.out.println("\nheight");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}