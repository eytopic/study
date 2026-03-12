import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("java");
        list.add("c++");
        list.add("python");
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(0);
        int n=list.size();
        System.out.println(n);
    }
}
