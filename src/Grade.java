import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Grade:");
        try {
            a = scanner.nextInt();
            System.out.println((a >= 0 && a <= 100) ? Grade2Str(a) : "Please input right grade!");
        }catch (Exception e)
        {
            System.out.println("error:please input num");
        }
    }
    public static String Grade2Str(int a)
    {
        int n = a / 10;
        switch (n){
            case 10:
            case 9:return "优";
            case 8:return "良";
            case 7:return "中";
            case 6:return "及格";
            default:return "不及格";
        }
    }
}
