public class linearSearch {

    public static int Lsearch(int[] numbers, int search) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search)
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] numbers = {4,2,3,5,1};
        int search = 5;

        int result = Lsearch(numbers, search);

        if (result == -1)
            System.out.println("찾지 못했습니다.");
        else
            System.out.println(result + "번째의 요소가 일치합니다.");
    }
}