import java.util.Scanner;

class Student {
    int studentid;
    String name;
    String major;
    long num;

    void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    void setName(String name) {
        this.name = name;
    }
    void setMajor(String major) {
        this.major = major;
    }
    void setNum(long num) {
        this.num = num;
    }

    int getStudentid() {
        return studentid;
    }
    String getName() {
        return name;
    }
    String getMajor() {
        return major;
    }
    long getNum() {
        return num;
    }

    String getFormattednum() {
        String numStr = Long.toString(num);
        if (numStr.length() == 10) {
            numStr = "0" + numStr;
        }
        if (numStr.length() == 11) {
            return numStr.substring(0, 3) + "-" + numStr.substring(3, 7) + "-" + numStr.substring(7, 11);
        }
        return numStr;
    }

}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String idStr = scanner.next();
            String name = scanner.next();
            String major = scanner.next();
            String numStr = scanner.next();

            int studentid = Integer.parseInt(idStr);
            long num = Long.parseLong(numStr);

            students[i] = new Student();
            students[i].setStudentid(studentid);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setNum(num);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번째 학생: %d %s %s %s\n",

                    (i + 1),
                    students[i].getStudentid(),
                    students[i].getName(),
                    students[i].getMajor(),
                    students[i].getFormattednum());
        }
        scanner.close();
    }
}