import java.util.*;

public class system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        System.out.println("请输入有多少人");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("请输入姓名：");
            String name=sc.nextLine();

            System.out.println("请输入年龄：");
            int age= Integer.parseInt(sc.nextLine());

            map.put(name,age);
        }
        System.out.println(map);
    }
}
