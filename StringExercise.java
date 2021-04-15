public class StringExercise {

    String getMiddle(String word) {
        // 글자의 개수로 홀/짝 파악 
        int num = word.length() / 2;
        if (word.length() % 2 == 0) { // 길이가 짝수 개 이면 
            return word.substring(num-1,num+1); // 4자리이면 인덱스 1 ~ 3미만까지 출력 
        } else { // 홀수 개 이면 
            return word.substring(num,num+1); // 5자리이면 인덱스 2 ~ 3미만까지 출력
        }
    }

    public static void main(String[] args) {
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
        System.out.println(se.getMiddle("test"));
    }
}
