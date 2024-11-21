package lib;

public class Main {
    // 이렇게 표기도 가능함
    String name = "채식주의자";
    String author = "한강";

    // 알맞은 주머니에 알맞은 것을 넣어주기 위해
    // (책) 주머니 = 책
    // Heap 메모리공간에 들어감
    Book book = new Book("채식주의자", "한강");

    // 기능을 받는 방법
    String getTitle = book.getTitle();

//    Doll doll = new Doll();
//    String = doll.makeOrange();
}
