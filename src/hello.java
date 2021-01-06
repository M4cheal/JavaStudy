import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        // System.out.println("hello  world!3!!");

        int[] a = new int[10], b;
        int i;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 10; i++)
        {
            a[i] = scanner.nextInt();
        }
        b = sort(a);
        for (i = 0; i < 10; i++)
        {
            System.out.print(b[i] + "\t");
        }
    }
    public static int[] sort(int[] a)
    {
        int i, j, k;
        for (i = 0; i < a.length-1; i++)
        {
            for (j = 0; j < a.length-i-1; j++)
            {
                if (a[j] > a[j+1])
                {
                    k = a[j];
                    a[j] = a[j+1];
                    a[j+1] = k;
                }
            }
        }
        return a;
    }
}
