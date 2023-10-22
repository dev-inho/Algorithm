package chap01;

public class Max3m {

    /*
    * 3개의 정수 중 최대값을 구하는 함수
    * */
    static int max3m(int a, int b, int c) {
        int max = a;

        if(b > max) max = b;
        if(c > max) max = c;

        return max;
    }

    /*
    * 매개변수가 4개에서 최대값 구하기
    * */
    static int max4(int a, int b, int c, int d) {
        int max = a;

        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max;
    }

    /*
    * 매개변수 3개 중 최소값 구하기
    * */
    static int min3(int a, int b, int c) {
        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;

        return min;
    }

    /*
    * 매개변수 4개 중 최소값 구하기
    * */
    static int min4(int a, int b, int c, int d) {
        int min = a;

        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;

        return min;
    }

    public static void main(String[] args) {

        /* 3자릿수 중 최대값 */
        System.out.println("max(3, 2, 1) = " + max3m(3, 2, 1));
        System.out.println("max(3, 1, 2) = " + max3m(3, 1, 2));

        /* 4자릿수 중 최대값 */
        System.out.println("max4(1, 2, 3, 4) = " + max4(1, 2, 3, 4));
        System.out.println("max4(4, 3, 2, 1) = " + max4(4, 3, 2, 1));

        /* 3자릿수 중 최소값 */
        System.out.println("min(3, 2, 1) = " + min3(3, 2, 1));
        System.out.println("min(1, 2, 3) = " + min3(1, 2, 3));

        /* 4자릿수 중 최소값 */
        System.out.println("min(4, 3, 2, 1) = " + min4(4, 3 , 2, 1));
        System.out.println("min(1, 2, 3, 4) = " + min4(1, 2, 3, 4));
    }
}
