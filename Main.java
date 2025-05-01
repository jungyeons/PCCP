import java.util.Arrays;
import java.util.LinkedList;



public class Main {
    public static void main(String[] args) {
        // [Array]미리 크기를 만들어놓음
        int [] arr = new int[5];
        //배열의 참조 주소
        System.out.println(arr);
        //배열을 문자열로 변환하여 출력
        System.out.println(Arrays.toString(arr));

        // [list]크기가 유연함
        // 다음요소로 링크로 연결됨.
        //  LinkedList -> 데이터를 추가하려면 링크 하나 늘리면 그만!!
        //양쪽으로 연결되어있으면 DoubleLinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        //자동으로 toString 내장되어있어서 toString안해줘도 잘 출력됨.
        System.out.println(linkedList);


        //1. 데이터 추가하기
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        //List는 선형적 자료구조라 순서가 중요함. 순서를 지켜서 데이터를 집어 넣기 !
        // 넣을때 인덱스를 지정하고 넣는 방법
        linkedList.add(1,4);
        System.out.println(linkedList);


        //2. 데이터 삭제하기
        // 데이터를 삭제하기 -> 링크를 없애면 그만 !!
        //지울 때는 값이 아니라 인덱스로 지운다 !!
        linkedList.remove(1);
        System.out.println(linkedList);

        //3. 데이터 꺼내오기
        //꺼내올 때는 값이 아니라 인덱스로 !!
        System.out.println(linkedList.get(2));
        // 두 번째 LinkedList 생성

        //4.데이터 전부 추가하기
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        list1.addAll(list2);
        System.out.println(list1);
        // list2의 모든 요소를 list1의 두 번째 위치(인덱스 1)에 추가
        list1.addAll(1, list2);
        System.out.println(list1);

        //맨앞에 추가
        list1.addFirst("Mango");
        //맨뒤에 추가
        list1.addLast("Orange");
        System.out.println(list1);
        //싹지우기
//        list1.clear();
        System.out.println(list1);
        //찾고자 하는게 있는지
        System.out.println( list1.contains( "Orange" ));

        //앞에서 부터 세기
        System.out.println(list1.indexOf("Orange"));
        //뒤에서 부터 세기
        System.out.println(list1.lastIndexOf("Orange"));



    }
}
