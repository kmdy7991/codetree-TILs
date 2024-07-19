import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        String weekDay = sc.nextLine();
        
        int idx = 0;
        for(int i = 0; i < 7; i++){
            if(week[i].equals(weekDay)){
                idx = i;
                break;
            }
        }

        int day1 = d1;
        for(int i = 0; i < m1 - 1; i++){
            day1 += days[i];
        }

        int day2 = d2;
        for(int i = 0; i < m2 - 1; i++){
            day2 += days[i];
        }

        int diffDay = day2 - day1;

        System.out.println(((diffDay + 1) / 7) + ((diffDay + 1) % 7) / idx);
    }
}