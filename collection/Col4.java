package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        // Queue : FIFO (먼저 들어간게 먼저 나오는 구조)
        // add, peek, poll
        // 생성자가 없는 인터페이스 (new 키워드로 만들 수 없음 => new 키워드로 만들 수 있는 것은 생성자가 있는 인터페이스)

        Queue<Integer> intQueue = new LinkedList<>();

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.poll());
        }

        // 다시 추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        // peek
        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());
    }
}
