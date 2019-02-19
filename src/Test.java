import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner str = new Scanner(System.in);
        ArrayList<News>data = new ArrayList<>();
       while(flag){
           ChucNang();
           Scanner sc = new Scanner(System.in);
           int chon =sc.nextInt();
switch(chon){
    case 1: {
        System.out.println("Nhập ID");
        int id = sc.nextInt();
        System.out.println("Nhập title");
        String title = str.nextLine();
        System.out.println("Nhập PublishDate");
        String pd = str.nextLine();
        System.out.println("Nhập Author");
        String at = str.nextLine();
        System.out.println("Nhập Content");
        String content = str.nextLine();
        System.out.println("Nhập vào 3 số kiểu int");
        int so1 = sc.nextInt();
        int so2 = sc.nextInt();
        int so3 = sc.nextInt();
        data.add(new News(id,title,pd,at,content, new int[]{so1, so2, so3}));
    break;
    }
    case 2 :  {
       for(News value : data){
           value.Display();
       }
       break;
    }
    case 3 : {
        for(News value : data){
           value.Calculate();
           value.Display();
        }
        break;
    }
    case 4 : {
        flag = false;
        System.out.println("Thoát chương trình");
    }
}
       }
    }

    private static void ChucNang() {
        System.out.println("1:Insert News");
        System.out.println("2:View list news");
        System.out.println("3:Average rate");
        System.out.println("4:Exit");
    }
}
