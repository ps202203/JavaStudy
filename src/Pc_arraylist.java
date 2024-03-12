import java.util.ArrayList;
import java.util.Arrays;

public class Pc_arraylist {

    public static void main(String args[]) {

        // 타입설정 Integer 객체만 적재가능
        ArrayList<Integer> members = new ArrayList<>();

        // 초기 용량(capacity)지정
        ArrayList<String> num3 = new ArrayList<>(10);

        // 배열을 넣어 생성
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        // 다른 컬렉션으로부터 그대로 요소를 받아와 생성
        // (ArrayList를 인자로 받는 API를 사용하기 위해서 Collection 타입 변환이 필요할 때 많이 사용)
        ArrayList<Integer> list3 = new ArrayList<>(list2);

    }
}
