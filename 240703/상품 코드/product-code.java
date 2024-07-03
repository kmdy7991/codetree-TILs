import java.util.*;

class Product{
    String name;
    String code;

    Product(){
        this.name = "codetree";
        this.code = "50";
    }

    Product(String name, String code){
        this.name = name;
        this.code = code;
    }
    
    @Override
    public String toString(){
        return "product " + this.code + " is " + this.name;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        
        System.out.println(new Product());
        System.out.print(new Product(st.nextToken(), st.nextToken()));
    }
}