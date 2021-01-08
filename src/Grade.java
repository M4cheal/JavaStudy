import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        String a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Grade:");
        try {
            a = scanner.next();
            b = Integer.parseInt(a);
            inputGrade(b);
            if (a == "")
            {
                throw new InputNumException("Not Null!");
            }
            System.out.println(Grade2Str(b));
            // System.out.println((b >= 0 && b <= 100) ? Grade2Str(b) : "Please input right grade!");
        } catch (NumberFormatException e)
        {
            System.out.println("error:please input num");
        } catch (InputNumException e)
        {
            System.out.println(e.getMessage());
        } catch (Exception e)
        {
            System.out.println("error:" + e.toString());
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
    public static void inputGrade(int b) throws InputNumException {
        if (!(b >= 0 && b <= 100)) {
            throw new InputNumException("Please input right grade!");
        }
    }
}
class InputNumException extends Exception{
    public InputNumException(){}
    public InputNumException(String msg){
        super(msg);
    }
}
