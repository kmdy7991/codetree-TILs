import java.util.*;

class Agent implements Comparable<Agent> {
    String name;
    int point;

    Agent(String name, int point){
        this.name = name;
        this.point = point;
    }

    @Override
    public int compareTo(Agent a) {
        return this.point - a.point;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;

        Agent[] agents = new Agent[5];
        for (int i = 0; i < 5; i++){
            st = new StringTokenizer(sc.nextLine());
            agents[i] = new Agent(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(agents);

        System.out.print(agents[0].name + " " + agents[0].point);
    }
}