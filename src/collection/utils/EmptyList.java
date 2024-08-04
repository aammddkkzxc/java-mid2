package collection.utils;

import java.util.*;

public class EmptyList {
    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); //자바5
        List<Integer> list4 = List.of(); //자바9 이거 권장
        System.out.println(list3.getClass());
        System.out.println(list4.getClass());
    }
}