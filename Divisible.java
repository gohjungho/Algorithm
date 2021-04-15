import java.util.Arrays;

public class Divisible {
    public int[] divisible(int[] array, int divisor) {
        // array의 각 요소 중 divisor로 나누어 떨어지는 값만 포함하는 배열 반환 
        int count = 0; // 배열의 길이 

        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0) { // divisor로 나누어 떨어지면 
                count += 1; // 배열의 길이를 구하기 위함 
            }
        }

        int[] ret = new int[count]; // 배열 생성 
        int index = 0; // 배열 ret의 인덱스를 위한 변수 

        for (int j = 0; j < array.length; j++) {
            if (array[j] % divisor == 0) { // 배열의 i번째 값이 divisor로 나뉘면 
                ret[index++] = array[j]; // 배열에 추가 
            }
        }
        return ret; // 결과값을 담은 배열을 반환 
    }
    // 출력 
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5,9,7,10};
        System.out.println(Arrays.toString(div.divisible(array, 5)));
    }
}