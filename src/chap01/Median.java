package chap01;

import java.util.Scanner;

public class Median {

    /*
    * 매개변수 3개의 중앙값
    * */
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

    /*
    * 매개변수 3개의 중앙값
    * */
    static int med3_2(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a)) {
            return a;
        } else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("A의 값");
        int a = stdIn.nextInt();
        System.out.println("b의 값");
        int b = stdIn.nextInt();
        System.out.println("C의 값");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}
