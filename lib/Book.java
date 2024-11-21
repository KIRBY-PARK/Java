package lib;

// 정의하는 공간
public class Book {
    // 속성(변수)
    private String title;
    private String author;

    // 생성자(조립설명서)
    // String title, String author: 매개변수 -> 객체생성란에 인풋을 만들어줌
    public Book(String title, String author) {
        // 클래스의 멤버변수 2개, 생성자의 지역변수 2개로 총 4개가 접근할 수 있음
        //this.title; 이게 한 개 (클래스의 멤버변수)
        // title; (생성자의 지역변수)
        // 한 줄당 2개, 멤버변수 = 지역변수;
        this.title = title;
        this.author = author;
    }

    // 기능(메서드, 함수)
    // String author; 변수 : 데이터 저장 공간
    // String getTitle(){...}
    public String getTitle() {
        return title; // getTitle 님에게 돌려드려야 함 (오렌지를 즙착기에 넣어 짰는데 오렌지주스를 줘야하지 않겠나)
    }
}
