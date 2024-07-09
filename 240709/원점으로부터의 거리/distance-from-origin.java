import java.util.*;

class Point implements Comparable<Point> {
    int x;
    int y;
    int dis;
    int order;

    Point(int x, int y, int order) {
        this.x = x;
        this.y = y;
        this.order = order;
    }

    @Override
    public int compareTo(Point point){
        return this.dis - point.dis;
    }

    @Override
    public String toString(){
        return String.valueOf(this.order);
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;

        int n = Integer.parseInt(sc.nextLine());

        Point[] points = new Point[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(sc.nextLine());
            points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i + 1);
            points[i].dis = distance(points[i]);
        }

        Arrays.sort(points);

        for (Point point : points) {
            System.out.println(point);
        }
    }

    private static int distance(Point p){
        return (int) Math.abs(0 - p.x) + Math.abs(0 - p.y);
    }
}