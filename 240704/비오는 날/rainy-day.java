import java.util.*;
import java.util.stream.Stream;

class Weather{
    String date;
    String day;
    String info;

    Weather (String date, String day, String info){
        this.date = date;
        this.day = day;
        this.info = info;
    }

    public String getDate(){
        return this.date;
    }

    @Override
    public String toString(){
        return this.date + " " + this.day + " " + this.info;
    }
}



public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;

        int n = Integer.parseInt(sc.nextLine());

        Weather[] weathers = new Weather[n];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(sc.nextLine());
            weathers[i] = new Weather(st.nextToken(), st.nextToken(), st.nextToken());
        }

        Weather rain = Arrays.stream(weathers)
                             .sorted(Comparator.comparing(Weather::getDate))
                             .filter(i -> i.info.equals("Rain"))
                             .findFirst()
                             .get();
        System.out.print(rain);
    }
}