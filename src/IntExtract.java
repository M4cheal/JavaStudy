public class IntExtract {
    public static void main(String[] args) {
        int n = 1678;
        System.out.print("n = ");
        Extract(n);
        System.out.print("\b");
    }
    public static void Extract(int n)
    {
        if (n != 0)
        {
            Extract(n/10);
            System.out.print(n%10 + ",");
        }
    }
}
