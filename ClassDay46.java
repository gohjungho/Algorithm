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
        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수 a: ");
        // int a = sc.nextInt();
        // System.out.print("정수 b: ");
        // int b = sc.nextInt();
        // System.out.print("정수 c: ");
        // int c = sc.nextInt();

        // System.out.println("c >= b >= a가 되도록 정렬했습니다.");
        // if (a > b) {
        //     int t = a; a = b; b = t;
        // }
        // if (a > c) {
        //     int t = a; a = c; c = t;
        // }
        // if (b > c) {
        //     int t = b; b = c; c = t;
        // }
        // System.out.println("변수 a는 " + a + "입니다.");
        // System.out.println("변수 b는 " + b + "입니다.");
        // System.out.println("변수 c는 " + c + "입니다.");

        // 4-1. 3-5를 반복 실행 가능하도록 만들기 
        // 아직 못 풂 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값: ");
        // int a = sc.nextInt();

        // do {
        //     if (a > 0) {
        //         System.out.println("값이 양수입니다.");
        //     } else if (a < 0) {
        //         System.out.println("값이 음수입니다.");
        //     } else {
        //         System.out.println("값이 0입니다.");
        //     }
        // 

        // System.out.print("다시 한번? 1 - Yes / 0 - NO : ");
        // retry = sc.nextInt();
        // } while (retry = 1);

        // 4-2. 3자리의 양의 정숫값(100-999)을 읽는 프로그램 작성하기 

        // Scanner sc = new Scanner(System.in);
        // int a; 
        
        // do {
        //     System.out.print("세 자리의 정숫값: ");
        //     a = sc.nextInt();       

        // } while (a < 100 || a >= 1000);
        
        // System.out.print("입력한 값은 " + a + "입니다.");
        
        // 4-3. 2자리의 정숫값(10-99)을 맞추는 '숫자 맞추기'게임 만들기 

        // Scanner sc = new Scanner(System.in);
        // Random rd = new Random();
        // int num = 10 + rd.nextInt(90);

        // System.out.println("숫자 맞추기 게임 시작!");
        // System.out.println("10부터 99까지의 숫자를 맞추세요.");
        // int a;

        // do {
        //     System.out.print("어떤 숫자일까?: ");
        //     a = sc.nextInt(); 

        //     if (a > num) {
        //         System.out.println("더 작은 숫자입니다.");
        //     } else if (a < num) {
        //         System.out.println("더 큰 숫자입니다.");
        //     }
        // } while (a != num); 
        // // while은 반복하기위한 조건. 내 입장에선 False여야 반복하고 True면 탈출하는 셈 
            
        // System.out.println("정답입니다.");

        // 4-4. 값을 읽어서 두 정수 사이에 있는 모든 정숫값을 작은 것부터 큰 순으로 나열하는 프로그램 만들기 

        // Scanner sc = new Scanner(System.in);

        // System.out.print("정수 A: ");
        // int a = sc.nextInt(); 
        // System.out.print("정수 B: ");
        // int b = sc.nextInt();

        // // 오름차순이 아닐 때를 대비 
        // if (a > b) {
        //     int t = a; a = b; b = t;
        // }


        // do {
        //     System.out.print(a + " ");
        //     a += 1;
        // } while (a <= b);

        // 4-5. 입력받은 정숫값부터 0까지 카운트다운하는 프로그램을 작성하기 

        // Scanner sc = new Scanner(System.in);
        // System.out.println("카운트다운 합니다.");

        // int a;
        // // 양의정수만 받기 위한 함수
        // do { 
        //     System.out.print("양의 정숫값: ");
        //     a = sc.nextInt(); 
        // } while (a <= 0);

        // // 카운트다운 
        // while (a >= 0) {
        //     System.out.println(a--); // 출력 후 계산 
        // }
        
        // System.out.print("x값이 "+ a + "이 됐습니다.");

        // 4-6. a--를 --a로 바꾸면? 
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("카운트다운 합니다.");

        // int a;
        // // 양의정수만 받기 위한 함수
        // do { 
        //     System.out.print("양의 정숫값: ");
        //     a = sc.nextInt(); 
        // } while (a <= 0);

        // // 카운트다운 
        // while (a >= 0) {
        //     System.out.println(--a); // 계산 후 출력 
        // }
        
        // System.out.print("x값이 "+ a + "이 됐습니다.");

        // 4-7. 입력한 같의 개수만큼 '*'을 표시하는 프로그램. 줄바꿈 문자 표시하기. 
        // 1미만이면 줄 바꿈 문자 없어야 함 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("몇 개의 *을 표시할까요?: ");
        // int a = sc.nextInt(); 

        // if (a >= 0) {
        //     while (a != 0) {
        //         System.out.print("*"); 
        //         a--; 
        //     }
        // }
        // // 줄 바꿈 처리 왜 하는지 모르겠네;; 
        // if (a >= 1) {
        //     System.out.println(); // 줄바꿈 
        // }

        // 4-8. 읽은 값의 개수만큼 '*'와 '+'를 번갈아 가며 표시하는 프로그램 만들기 
        // 마지막에는 줄바꿈 문자 출력 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("몇 개를 표시할까요?: ");
        // int a = sc.nextInt(); 
        // int i = 0;

        // while (i < a) {
        //     if (i % 2 == 1) {
        //         System.out.print("+");
        //     } else {
        //         System.out.print("*");
        //     }
        //     i++;
        // } 
        // if (i == a) {
        //     System.out.println(); // 줄바꿈 
        // }

        // 4-9. 입력값을 읽어서 그 자릿수를 출력하는 프로그램 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("양의 정수값을 표시합니다.");
        // System.out.print("양의 정수값: ");
        // int a = sc.nextInt(); 
        // int i = 0;
        
        // while (a > 0) {
        //     i++;
        //     a = a / 10; // 한 자리씩 날리기. a는 정수형이므로 소수점은 전부 버림 
        // }
        // System.out.println("입력한 숫자는 " + i + "자리 입니다.");

        // 4-10. 양의 정숫값 n을 읽어서 1~n까지의 곱을 구하기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("양의 정수값: ");
        // int n = sc.nextInt(); 
        // int i = 1; // 인덱스 
        // int mul = 1;  // 곱 
        
        // while (n >= i) {
        //     mul *= i;
        //     i++;
        // }

        // System.out.println("1부터 " + n + "까지의 곱은 " + mul + "입니다.");

        // 4-11. 4-7을 for 문으로 작성하기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("몇 개의 *을 표시할까요?: ");
        // int a = sc.nextInt(); 
       
        // for (int i = 0; i < a; i++) {
        //     System.out.print("*"); 
        // }
        
        // if (a >= 1) {
        //     System.out.println(); // 줄바꿈 
        // }

        // 4-14. 1~n의 합 구하기 (for문 사용)

        // Scanner sc = new Scanner(System.in);
        // System.out.print("1부터 n까지의 합을 구합니다. n의 값: ");
        // int a = sc.nextInt(); 
        // int sum = 0;
       
        // for (int i = 1; i <= a; i++) {
        //     sum += i;
        // }
        // System.out.print("1부터 n까지의 합은 " + sum + "입니다.");

        // 4-15. 4-14를 수정해서 결과뿐 아니라 계산식까지 표시하기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("1부터 n까지의 합을 구합니다. n의 값: ");
        // int a = sc.nextInt(); 
        // int sum = 0;
       
        // for (int i = 1; i <= a; i++) {
        //     sum += i;
        //     System.out.print(i);
        //     if (i == a) {
        //         System.out.print(" = " + sum);
        //     } else {
        //         System.out.print(" + ");
        //     }
        // }
        // System.out.println();
        // System.out.println("1부터 n까지의 합은 " + sum + "입니다.");

        // 4-16. 신장별 표준 체중 대응표를 표시하는 프로그램 작성하기 
        // 표시할 신장의 범위(시작값/종료값/증가값)는 정숫값으로 입력받을 것 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("몇 cm부터: ");
        // int start = sc.nextInt(); 
        // System.out.print("몇 cm까지: ");
        // int stop = sc.nextInt(); 
        // System.out.print("몇 cm 단위: ");
        // int step = sc.nextInt(); // 얘는 어떻게 쓰지???

        // double standard_weight; 
       
        // System.out.println("신장 표준 체중");
        // System.out.println("----------");

        // for (int i = start; i <= stop; i += step) {
        //     standard_weight = (i - 100) * 0.9;
        //     System.out.println(i + " " + standard_weight);
        // }

        // 4-18. 입력한 정숫값의 모든 약수와 그 개수를 표시하는 프로그램 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정숫값: ");
        // int num = sc.nextInt(); 
        // int cnt = 0;

        // for (int i = 1; i <= num; i++) {
        //     if (num % i == 0) {
        //         cnt++;
        //         System.out.print(i + " ");
        //     }
        // }
        // System.out.println("\n의 약수는 " + cnt + "개입니다.");

        // 4-19. 1~n의 정숫값에 각 값을 제곱해서 표시하는 프로그램 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("정수값: ");
        // int num = sc.nextInt();

        // for (int i = 1; i <= num; i++) {
        //     System.out.println(i + "의 제곱은 " + i * i + "입니다.");
        // }

        // 4-20. 달을 정숫값으로 읽어서 해당하는 달의 계절을 표시하는 프로그램 
        // 원하는 만큼 입력 및 출력할 수 있게 하며, 1~12 이외의 값이 입력된 경우 
        // 재입력 하도록 할 것(do-while 안의 do-while 구문)

        // Scanner sc = new Scanner(System.in);
        // System.out.println("계절을 찾습니다.");

        // int month, again;
        // do {
        //     do {
        //         System.out.print("몇 월입니까?: ");
        //         month = sc.nextInt();
        //     } while (month <= 0 | month > 12);
       
        //     if (month < 3) 
        //         System.out.println("겨울입니다.");
        //     else if (month < 6) 
        //         System.out.println("봄입니다.");
        //     else if (month < 9) 
        //         System.out.println("여름입니다.");
        //     else if (month < 12) 
        //         System.out.println("가을입니다.");
        //     else 
        //         System.out.println("겨울입니다.");

        //     System.out.print("다시 하시겠습니까? 1...Yes/0...No: ");
        //     again = sc.nextInt(); 
        // } while (again == 1);

        // 4-21. 기호 문자 '*'를 나열해서 n단의 정방형을 표시하는 프로그램 

        // Scanner sc = new Scanner(System.in);
        // System.out.println("정방형을 표시합니다.");
        // System.out.print("단수는: ");
        // int num = sc.nextInt();

        // for (int i = 0; i < num; i++) { // 줄 
        //     for (int j = 0; j < num; j++) { // 칸 
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 4-22. 기호 문자 '*'를 나열해서 직각의 이등변삼각형을 표시하는 프로그램 
        // 직각의 위치가 왼쪽 아래, 왼쪽 위, 오른쪽 아래, 오른쪽 위인 삼각형 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("한 변의 값: ");
        // int num = sc.nextInt();

        // // 왼쪽 위
        // for (int i = 0; i < num; i++) {
        //     for (int j = num; j > i; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        // // 왼쪽 아래
        // for (int i = 0; i < num; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        // // 오른쪽 위
        // for (int k = 1; k <= num; k++) { // 줄 
        //     for (int i = 1; i <= (k - 1); i++) { // 빈칸
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= (num - k + 1); j++) { // 별 
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 4-23. 트리 만들기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("몇 단 트리 만들까?: ");
        // int num = sc.nextInt();

        // for (int k = 1; k <= num; k++) {
        //     for (int i = num - 1; i >= k; i--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= (2 * k - 1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // // 1줄 빈칸 4 별 1
        // // 2줄 빈칸 3 별 3
        // // 3줄 빈칸 2 별 5
        // // 4줄 빈칸 1 별 7
        // // 5줄 빈칸 x 별 9 

        // 4-24. 숫자 트리 만들기 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("몇 단 트리 만들까?: ");
        // int num = sc.nextInt();

        // for (int k = 1; k <= num; k++) {
        //     for (int i = num - 1; i >= k; i--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= (2 * k - 1); j++) {
        //         System.out.print(k % 10);
        //     }
        //     System.out.println();
        // }

        // 4-25. 소수인지 판정하는 프로그램  

        // Scanner sc = new Scanner(System.in);
        // System.out.print("2이상의 정숫값: ");
        // int a = sc.nextInt();
        // int i;
        // for(i = 2 ; i < a ; i++) {
        //   if(a % i == 0)
        //     break;
        // }

        //   if(i == a)
        //     System.out.print("소수입니다. ");
        //   else
        //     System.out.print("소수가 아닙니다.  ");


        // 4-26. 정수값을 연속해서 입력 받아 합계와 평균을 구하는 프로그램 
        // 0 입력시 프로그램 종료 

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 더합니다.");
        System.out.print("몇 개를 더할까요?: ");
        int cnt = sc.nextInt();
        int i;
        int sum = 0;
       
        for (i = 0; i < cnt; i++) {
            System.out.print("정수(0으로 종료): ");
            int t = sc.nextInt();

            if(t == 0) break;

            sum += t;
        }
        
        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균은 " + sum / i + "입니다.");
    }
}