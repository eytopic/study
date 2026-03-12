import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap();
        map.put("张三",20);
        map.put("李四",21);
        System.out.println(map);
        System.out.println(map.get("张三"));
    }
}
