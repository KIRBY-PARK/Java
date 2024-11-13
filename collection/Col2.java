package collection;

import java.util.LinkedList;

public class Col2 {
    // Linked List
    // 메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담아놓음
    // 실제 값이 있는 주소 값으로 목록을 구성하고 저장하는 자료구조

    // 기본적 기능은 -> Array List와 동일함
    // LinkedList는 값 -> 여기 저기 나누어서 : 조회하는 속도가 느림
    // 값을 추가하거나, 삭제할 때는 빠르다

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(5);
        list.add(100);
        list.add(9);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // 조회할 때는 ArrayList보다 속도가 현저히 느리다
        System.out.println(list.toString());

        // add(추가)
        list.add(200);
        System.out.println(list.toString());

        list.add(2,4);
        System.out.println(list.toString());

        // set(수정)
        list.set(1, 30);
        System.out.println(list.toString());

        // Remove(삭제)
        list.remove(1);
        System.out.println(list.toString());

        // clear(전체 삭제)
        list.clear();
        System.out.println(list.toString());
    }
}
