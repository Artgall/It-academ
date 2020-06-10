package HomeWork1;

public class PriorityMain {

    public static void main(String[] args) {

        int a = 5;
        int b = 2;
        int c = 8;
        int d = 7;
        int e = 20;
        int f = 68;
        int g = 22;
        int h = 6;
        int i = 3;
        int j = 12;
        int k = 119;
        boolean l = true;
        boolean m = false;

        System.out.println(a + b / c); // 2/8=0 ; 5+0=5

        System.out.println((a + b) / c); // 5+2=7 ; 7/8=0

        System.out.println((a + b++) / c); // 5+2=7 ; 7/8=0

        System.out.println((a + b++) / --c); // 5+3=8 ; 8/8=1

        System.out.println((a * b >> b++) / --c); // 5*4=20 ; 20>>4=1 ; 1/7=0

        System.out.println((a + d > e ? f : g * b>> b++) / --c); // 5+7>20=false ; 22*5=110 ; 110>>5=3 ; 3/6=0

        //System.out.println((a + d > e ? f >= f : g * b >> b++) / --c); Есть вариант что придётся делить boolean на int. Не компилируется.

        System.out.println(h - b > i && j * j <= k); // 6-6>3=false ; 12*12<=119=false ; false&&false=false Всегда будет false.

        System.out.println(l && m); // true&&false=false Всегда будет false.
    }
}
