import java.util.Scanner;

public class EuclideanAlgorithm {
    static int euclide1(int a, int b) {
        // 반복 
        int t = a % b;
        
        while (t != 0) {
            a = b;
            b = t;
            t = a % b;
        }
        return b;
    }

    static int euclide2(int a, int b) {
        // 재귀 
        if (a % b == 0) return b;
        return euclide2(a, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수: ");
        int a = sc.nextInt();
        System.out.print("두 번째 수: ");
        int b = sc.nextInt();

        System.out.println("최대공약수는 " + euclide1(a,b) + "입니다.");
        System.out.println("최대공약수는 " + euclide2(a,b) + "입니다.");
        
    }
}
