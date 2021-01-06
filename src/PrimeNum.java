import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int n, i, j, s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number:");
        try {
            n = scanner.nextInt();
            for (i = 2; i <= n; i++)
            {
                s = (int) Math.sqrt(i);
                for (j = 2; j <= s; j++)
                {
                    if (i%j == 0)
                    {
                        break;
                    }
                }
                if (j > s)
                {
                    System.out.print(i + "\t");
                }
            }
        }catch (Exception e){
            System.out.println("please input number");
        }
    }
}
