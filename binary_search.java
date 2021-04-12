import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        System.out.print("검색할 데이터를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();

        int[] arr = {11, 13, 17, 19, 23, 29, 31};
        Bsearch(arr, search);        
    }

    public static void Bsearch(int[] arr, int search) {
        int head = 0, tail = arr.length - 1, center; // 선언과 동시에 초기화. (맨 왼쪽, 맨 오른쪽, 중앙)

        while (head <= tail) {
            center = (head + tail) / 2;
            if (arr[center] == search) {
                System.out.print((center + 1)+"번째의 요소가 일치");
                break;
            } else if (arr[center] < search) {
                head = center + 1;
            } else if (arr[center] > search) {
                tail = center - 1;
            }
            if (head > tail) {
                System.out.print("찾지 못했습니다.");
            }
        }
    }
}