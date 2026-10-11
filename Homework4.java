import java.util.Scanner;

class Homework4 {
    int gcd(int m, int n) {
        if (n == 0) { return m; }
        int small = (m < n) ? m : n;
        int large = (m < n) ? n : m;
        return gcd(small, large % small);
    }

    int gcdLoop(int m, int n) {
        while (n != 0) {
            int small = (m < n) ? m : n;
            int large = (m < n) ? n : m;
            m = small;
            n = large % small;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Homework4 hw = new Homework4();

        System.out.print("두 수를 입력하세요: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("두 수의 최대공약수는 %d입니다.\n", hw.gcd(a, b));
    }
}