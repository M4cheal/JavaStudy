import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int[] a = new int[10];
        int i;
        Scanner scanner = new Scanner(System.in);
        try {
            for (i = 0; i < 10; i++)
            {
                a[i] = scanner.nextInt();
            }
        }catch (InputMismatchException e){
            System.out.println("please input num!!");
            System.exit(-1);
        }
        sort(a);
        System.out.format("最大值%d,最小值%d\n", a[a.length-1], a[0]);
        for (i = 0; i < 10; i++)
        {
            System.out.print(a[i] + "\t");
        }
    }
    public static void sort(int[] a)
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
    }
}
