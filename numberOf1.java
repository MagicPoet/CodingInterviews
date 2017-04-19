import java.util.Scanner;

public class numberOf1 {
    public static int numberOf1(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n = (n-1) & n;
        }
        return count;
    }

    public static void main(String args[]){
        System.out.println("输入一个数:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n + "换算成二进制数中1的个数是：" + numberOf1(n));
    }
}
