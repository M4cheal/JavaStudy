import java.util.InputMismatchException;
import java.util.Scanner;

public class UseIntArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n, sum=0;
        try {
            System.out.print("please input n:");
            n = scanner.nextInt();
            int a[] = new int[n];
            for (i = 0; i < n; i++)
            {
                System.out.print("please input " + (i+1) + ":");
                a[i] = scanner.nextInt();
            }
            for (i = 0; i < n; i++)
            {
                sum += a[i];
            }
            System.out.println("sum = " + sum);
        }catch (InputMismatchException e){
            System.out.println("please input num!");
        }catch (IndexOutOfBoundsException e){
            System.out.println("error: index beyond the array boundary");
        }finally {
            char ch[] = new char[26];
            int j = 0;
            for (char c='A'; c <= 'Z'; c++, j++)
            {
                ch[j] = c;
            }
            for (j = 0; j < ch.length; j++)
            {
                System.out.print(ch[j] + "\t");
            }
        }
    }
}
