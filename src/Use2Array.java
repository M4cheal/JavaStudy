import java.util.InputMismatchException;
import java.util.Scanner;

public class Use2Array {
    public static void main(String[] args) {
        int i, j, sum=0;
        int[][] a = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        try {
            for (i = 0; i < a.length; i++)
            {
                for (j = 0; j < a[i].length; j++)
                {
                    System.out.format("a[%d][%d]:", i, j);
                    a[i][j] = scanner.nextInt();
                    sum += a[i][j];
                }
            }
            System.out.println("sum = " + sum);
        }catch (InputMismatchException e){
            System.out.println("please input num!");
        }
    }
}
