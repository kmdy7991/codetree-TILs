import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<Integer> large = new PriorityQueue<>();
        Queue<Integer> small = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++){
            if (small.size() - 1 == large.size()){
                large.offer(sc.nextInt());
            } else {
                small.offer(sc.nextInt());
            }

            if (!large.isEmpty() && small.peek() > large.peek()) {
                int temp = large.poll();
                large.offer(small.poll());
                small.offer(temp);
            }

            if(i % 2 == 0){
                System.out.print(small.peek() + " ");
            }

        }
    }
}