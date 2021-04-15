import java.util.Scanner;
import java.util.Random;

public class ClassDay46 {
    public static void main(String[] args) {
        // 1-3
        // System.out.print("첫 자바 프로그램입니다.");
        // System.out.print("화면에 출력중");

        // 1-4 
        // System.out.print("홍\n길\n동");

        // 1-5. 빈 줄 만들기 
        // System.out.print("홍\n\n길\n동");

        // 2-1. 합과 차 구하기 
        // 앞이 문자면 뒤도 문자로 인식되므로 괄호를 넣어주자. 
        // System.out.println("82 + 17 = " + (82 + 17)); 
        // System.out.println("82 + 17 = " + (82 - 17));

        // 2-2. 변수를 사용해 x, y의 합과 평균을 구하자 
        // int x = 63; 
        // int y = 18; 
        // System.out.println("x값은 " + x + "입니다.");
        // System.out.println("y값은 " + y + "입니다.");
        // System.out.println("합계는 " + (x + y) + "입니다.");
        // System.out.println("평균은 " + (x + y) / 2 + "입니다."); // 나누기는 +보다 우선순위가 높다.
        
        // 2-3. 변수를 사용해 x, y의 합과 평균을 구하자 (실수)
        // double x = 63.4; 
        // double y = 18.3; 
        // System.out.println("x값은 " + x + "입니다.");
        // System.out.println("y값은 " + y + "입니다.");
        // System.out.println("합계는 " + (x + y) + "입니다.");
        // System.out.println("평균은 " + (x + y) / 2 + "입니다.");

        // 2-4. int형 변수 3개의 합, 평균 구하기 
        // int x = 63; 
        // int y = 18; 
        // int z = 52;
        // int sum = x + y + z;
        // System.out.println("x값은 " + x + "입니다.");
        // System.out.println("y값은 " + y + "입니다.");
        // System.out.println("z값은 " + z + "입니다.");
        // System.out.println("합계는 " + (sum) + "입니다.");
        // System.out.println("평균은 " + (sum) / 3 + "입니다.");

        // 2-5. 입력한 정수값 표시하기 
        // 맨 위에 import java.util.Scanner 입력 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값: ";
        // int num = sc.nextInt();
        // System.out.println(num+"를 입력했습니다.");

        // 2-6. 입력한 정수값에 10을 더한 값과 10을 뺀 값을 출력하자. 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값: "); // 개행 없이 바로 입력 받는 값을 출력 
        // int num = sc.nextInt();
        // System.out.println("10을 더한 값은 " + (num + 10) + "입니다.");
        // System.out.println("10을 뺀 값은 " + (num - 10) + "입니다.");

        // 2-7. 입력한 정숫값에서 마지막 자릿수를 제외한 값과 마지막 자릿수의 값을 표시하기 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값: ");
        // String num = sc.next();
        // System.out.println("마지막 자릿수를 제외한 값은 " + num.substring(num.length() -1) + "입니다.");
        // System.out.println("마지막 자릿수는 " + num.substring(num.length() - 1, num.length()) + "입니다.");
        // int num2 = sc.nextInt();
        // System.out.println("마지막 자릿수를 제외한 값은 " + (num2 / 10) + "입니다.");
        // System.out.println("마지막 자릿수는 " + (num2 % 10) + "입니다.");

        // 2-9. 삼각형의 밑변과 높이를 입력받아 삼각형의 넓이 구하기 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("삼각형의 넓이를 구합니다.");
        // System.out.print("밑변: ");
        // double a = sc.nextDouble();
        // System.out.print("높이: ");
        // double h = sc.nextDouble();
        // System.out.println("넓이는 " + (a * h) / 2 + "입니다.");

        // 2-10. 구의 겉넓이와 부피 구하기 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("구의 겉넓이와 부피를 구합니다.");
        // System.out.print("반지름: ");
        // double r = sc.nextDouble();
        // final double PI = 3.141592; // 바뀌지 않는 상수 
        // System.out.println("겉넓이는 " + (4 * r * r * PI) + "입니다.");
        // System.out.println("부피는 " + 4 * (r * r * r) * PI / 3 + "입니다.");

        // 2-11. 랜덤 3개의 정수값 표시(1~9, -9~-1, 10~99)
        // 맨위 import java.util.Random; 입력 
        // System.out.println("3개의 난수를 생성했습니다.");
        // Random random = new Random();
        // int rd = 1 + random.nextInt(9); // nextInt(int(미만))
        // // 매개변수를 하나만 받기에 앞에 1을 더해주어 0이 출력되는걸 막아 주자
        // int rd2 = -9 + random.nextInt(10); // 괄호 안에는 범위 안의 개수. 앞에 숫자를 더하거나 빼는 것으로 시작점 설정 
        // // -1 - random.nextInt(9);
        // int rd3 = 10 + random.nextInt(90);
        // System.out.println("한 자리 양의 정수: " + rd);   
        // System.out.println("한 자리 음의 정수: " + rd2); 
        // System.out.println("두 자리 양의 정수: " + rd3); 

        // 2-12. 입력한 정숫값을 +-5 범위의 랜덤 정숫값을 생성하자 
        // Scanner sc = new Scanner(System.in);
        // Random rd = new Random();

        // System.out.print("입력값: ");
        // int x = sc.nextInt();

        // System.out.println("입력값의 5의 범위의 난수를 생성했습니다.");
        // System.out.println("값은 " + ((x - 5) + rd.nextInt(11)) + "입니다.");

        // 2-14. 입력받은 성과 이름으로 인사하는 프로그램 만들기 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("성: ");
        // String first = sc.next();
        // System.out.print("이름: ");
        // String last = sc.next();
        // System.out.println("안녕하세요. " + first + last + "씨.");

        // 2-16. String형의 변수를 문자열로 초기화하거나 변수에 문자열을 대입하기 
        // String s1 = "ABC"; // 초기화 
        // String s2 = "XYZ"; // 초기화 

        // System.out.println("문자열 s1은 " + s1 + "입니다.");
        // System.out.println("문자열 s2은 " + s2 + "입니다.");

        // s1 = "FBI"; // 대입(값을 변경) 

        // System.out.println("문자열 s1은 " + s1 + "입니다.");
        // System.out.println("문자열 s2은 " + s2 + "입니다.");

        // 3-1. 입력한 정숫값이 음이면 "이 값은 음의 값입니다"라고 출력하기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수값: ");
        // int num = sc.nextInt();
        // if (num < 0) {
        //     System.out.println("이 값은 음의 값입니다.");
        // }

        // 3-2. 정숫값을 읽어서 절댓값을 구하는 프로그램 만들기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값: ");
        // int num = sc.nextInt();
        // if (num < 0) {
        //     num = -num;
        // }
        // System.out.println("절댓값은 " + num + "입니다.");

        // 3-3. 2개의 양의 정수를 읽어서, 후자가 전자의 약수이면 "B는 A의 약수이다.", 
        // 아니면 "B는 A의 약수가 아니다." 출력하기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("변수A: ");
        // int a = sc.nextInt();
        // System.out.print("변수B: ");
        // int b = sc.nextInt();
        // if (b % a == 0) {
        //     System.out.println("B는 A의 약수이다.");
        // } else {
        //     System.out.println("B는 A의 약수가 아니다.");
        // }

        // 3-4. 논리 부정자 사용하기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("변수A: ");
        // int a = sc.nextInt();
        // System.out.print("변수B: ");
        // int b = sc.nextInt();
        // if (!(b % a == 0)) {
        //     System.out.println("B는 A의 약수가 아닙니다.");
        // } else {
        //     System.out.println("B는 A의 약수입니다.");
        // }

        // 3-5. 부호를 판정하는 프로그램 만들기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값: ");
        // int a = sc.nextInt();
        // if (a > 0) {
        //     System.out.println("값이 양수입니다.");
        // } else if (a < 0) {
        //     System.out.println("값이 음수입니다.");
        // } else {
        //     System.out.println("값이 0입니다.");
        // }

        // 3-6. 3-5의 문제에서 마지막 else를 else if(n==0)으로 변경하면 어떻게 될까? 

        // 차이가 없다. 

        // 3-7. 2개의 변수를 읽어서 대소관계를 표시하는 프로그램 만들기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("변수a: ");
        // int a = sc.nextInt();
        // System.out.print("변수b: ");
        // int b = sc.nextInt();
        // if (a > b) {
        //     System.out.println("a가 크다.");
        // } else if (a < b) {
        //     System.out.println("b가 크다.");
        // } else {
        //     System.out.println("a와 b가 같다.");
        // }

        // 3-9. 입력한 값이 10의 배수이면 '이 값은 10의 배수입니다.' 출력하기

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값: ");
        // int a = sc.nextInt();
        // if (a < 0) {
        //     System.out.println("음의 정숫값을 입력했습니다.");
        // } else if (a % 10 == 0) {
        //     System.out.println("이 값은 10의 배수입니다.");
        // } else {
        //     System.out.println("이 값은 10의 배수가 아닙니다.");
        // }

        // 3-11. 입력한 점수에 따라 수/우/미/양/가 판정하기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("점수: ");
        // int a = sc.nextInt();
        // if (a > 100) {
        //     System.out.println("잘못된 점수입니다.");
        // } else if (a >= 90) {
        //     System.out.println("수");
        // } else if (a >= 80) {
        //     System.out.println("우");
        // } else if (a >= 70) {
        //     System.out.println("미");
        // } else if (a >= 60) {
        //     System.out.println("양");
        // } else {
        //     System.out.println("가");
        // }

        // 3-13. 2개의 정숫값을 읽어서 두 값의 차를 표시하는 프로그램 만들기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수 a: ");
        // int a = sc.nextInt();
        // System.out.print("정수 b: ");
        // int b = sc.nextInt();
        // if (a > b) {
        //     System.out.println("두 값의 차는 " + (a - b) + "입니다.");
        // } else {
        //     System.out.println("두 값의 차는 " + (b - a) + "입니다.");
        // } 

        // Quiz. if를 사용하지 않고 3-13 만들기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수 a: ");
        // int a = sc.nextInt();
        // System.out.print("정수 b: ");
        // int b = sc.nextInt();
        
        // // Answer 1 - 절대값
        // System.out.println("두 값의 차는 " + Math.abs(a - b) + "입니다."); // 절대값
        
        // // Answer 2 - 삼항연산자 
        // System.out.println(
        //     (a > b) ? "두 값의 차는 " + (a - b) + "입니다." : 
        //     (b > a) ? "두 값의 차는 " + (b - a) + "입니다." : "a와 b는 같다."
        // ); 

        // 3-15. 입력한 3개의 정수 중 최솟값을 구하는 프로그램 만들기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수 a: ");
        // int a = sc.nextInt();
        // System.out.print("정수 b: ");
        // int b = sc.nextInt();
        // System.out.print("정수 c: ");
        // int c = sc.nextInt();
        
        // // Answer 1 
        // if (a > c & b > c) {
        //     System.out.println("최솟값은 " + c + "입니다."); 
        // } else if (a > b) {
        //     System.out.println("최솟값은 " + b + "입니다."); 
        // } else {
        //     System.out.println("최솟값은 " + a + "입니다."); 
        // }

        // // Answer 2 
        // int min = a;
        // if (b < min) min = b;
        // if (c < min) min = c;

        // System.out.println("최솟값은 " + min + "입니다."); 

        // 3-16. 입력한 3개의 정숫값 중 중앙값을 구해서 표시하는 프로그램 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수 a: ");
        // int a = sc.nextInt();
        // System.out.print("정수 b: ");
        // int b = sc.nextInt();
        // System.out.print("정수 c: ");
        // int c = sc.nextInt();
        
        // // Answer 1 - 음수 처리가 안됨 
        // if (a > c & b > c) {
        //     if (a > b) {
        //         System.out.println("중앙값은 " + b + "입니다."); 
        //     } else {
        //         System.out.println("중앙값은 " + a + "입니다."); 
        //     }
        // } else if (a > b & c > b) {
        //     if (a > c) {
        //         System.out.println("중앙값은 " + c + "입니다."); 
        //     } else {
        //         System.out.println("중앙값은 " + a + "입니다."); 
        //     }
        // } else {
        //     if (b > c) {
        //         System.out.println("중앙값은 " + c + "입니다."); 
        //     } else {
        //         System.out.println("중앙값은 " + b + "입니다."); 
        //     } 
        // }

        // // Answer 2 - 조건식 사용하기 
        // int mid = 0;

        // if ((b > a && c < a) || (b < a && c > a)) {
        //     mid = a; // b > a > c || c > a > b
        // } else if ((a > b && c < b) || (a < b && c > b)) {
        //     mid = b; // a > b > c || c > b > a
        // } else {
        //     mid = c; // a > c > b || b > c > a
        // }

        // System.out.println("중앙값은 " + mid + "입니다."); 

        // 3-18. 2개의 정숫값을 내림차순(큰 순서)으로 정렬하는 프로그램 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수 a: ");
        // int a = sc.nextInt();
        // System.out.print("정수 b: ");
        // int b = sc.nextInt();
 
        // // Answer 1 
        // if (a >= b) {
        //     System.out.println("변수 a는 " + a + "입니다.");
        //     System.out.println("변수 b는 " + b + "입니다.");
        // } else {
        //     System.out.println("a >= b가 되도록 정렬했습니다.");
        //     System.out.println("변수 a는 " + b + "입니다.");
        //     System.out.println("변수 b는 " + a + "입니다.");
        // }

        // // Answer 2 
        // System.out.println("a >= b가 되도록 정렬했습니다.");
        // if (a < b) {
        //     int t = a; // 임시 변수 
        //     a = b;
        //     b = t;
        // }
        // System.out.println("변수 a는 " + a + "입니다.");
        // System.out.println("변수 b는 " + b + "입니다.");

        // 3-19. 3개의 정숫값을 오름차순으로(작은 순) 정렬 
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 a: ");
        int a = sc.nextInt();
        System.out.print("정수 b: ");
        int b = sc.nextInt();
        System.out.print("정수 c: ");
        int c = sc.nextInt();

        System.out.println("c >= b >= a가 되도록 정렬했습니다.");
        if (a > b) {
            int t = a; 
            a = b;
            b = t;
        }
        if (a > c) {
            int t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            int t = b; 
            b = c;
            c = t;
        }
        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수 b는 " + b + "입니다.");
        System.out.println("변수 c는 " + c + "입니다.");

    }
}