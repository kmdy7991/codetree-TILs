import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] order = sc.nextLine().split(" ");
            switch(order[0]){
                case "push_back":
                    list.addLast(Integer.parseInt(order[1]));
                    break;
                case "push_front":
                    list.addFirst(Integer.parseInt(order[1]));
                    break;
                case "pop_front":
                    System.out.println(list.pollFirst());
                    break;
                case "pop_back":
                    System.out.println(list.pollLast());
                    break;
                case "front":
                    System.out.println(list.peekFirst());
                    break;
                case "back":
                    System.out.println(list.peekLast());
                    break;
                case "empty":
                    System.out.println(list.isEmpty() ? 1 : 0);
                break;
                case "size":
                    System.out.println(list.size());
                    break;
            }

        }
    }
}