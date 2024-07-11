import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Character> bread = new LinkedList<>();
        
        String line = in.readLine();
        for (char c : line.toCharArray()) {
            bread.add(c);
        }

        ListIterator<Character> point = bread.listIterator(n);
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(in.readLine());
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

        StringBuilder sb = new StringBuilder();
        bread.forEach(sb::append);
        System.out.print(sb.toString());
    }
}