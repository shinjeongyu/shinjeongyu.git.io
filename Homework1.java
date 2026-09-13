import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.print("정수를 입력하세요: ");
        num = scanner.nextInt();
        sum +=num;
        System.out.print("현재까지 입력된 정수의 합은 " + sum + "입니다.");


        System.out.print("정수를 입력하세요: ");
        num = scanner.nextInt();
        sum +=num;
        System.out.print("현재까지 입력된 정수의 합은 " + sum + "입니다.");

        System.out.print("정수를 입력하세요: ");
        num = scanner.nextInt();
        sum +=num;
        System.out.print("현재까지 입력된 정수의 합은 " + sum + "입니다.");

        System.out.print("정수를 입력하세요: ");
        num = scanner.nextInt();
        sum +=num;
        System.out.print("현재까지 입력된 정수의 합은 " + sum + "입니다.");

        System.out.print("정수를 입력하세요: ");
        num = scanner.nextInt();
        sum +=num;
        System.out.print("현재까지 입력된 정수의 합은 " + sum + "입니다.");

        scanner.close();
    }
}

