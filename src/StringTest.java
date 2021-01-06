import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        String str4;
        str4 = str1 + " " + str3;
        if(str2.compareTo(str4) != 0)
        {
            System.out.println("str1 != str2");
        }else{
            System.out.println("str1 == str2");
        }

    }
}
