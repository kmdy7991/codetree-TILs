import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Character> bread = new LinkedList<>();
        
        String line = sc.nextLine();
        for (char c : line.toCharArray()) {
            bread.add(c);
        }

        ListIterator<Character> point = bread.listIterator(n);
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(sc.nextLine());
            switch(st.nextToken()){
                case "L":
                    if(point.hasPrevious()){
                        point.previous();
                    }
                    break;
                case "R":
                    if(point.hasNext()){
                        point.next();
                    }
                    break;
                case "D":
                    if(point.hasNext()){
                        point.next();
                        point.remove();
                    }
                    break;
                case "P":
                    point.add(st.nextToken().charAt(0));
                    break;
            }
        }
        bread.forEach(System.out::print);
    }
}