package library;

public class Book {

    // 속성(변수) | 생성자(조립 설명서) | 기능(메서드, 함수)
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available){ // 생성자 == 클래스 이름
        this.title = title;
        this.author = author;
        this.available = available;
    }

    // 제목 조회
    public String getTitle() {
        return this.title;
    }

    // 대여여부 조회
    public boolean getAvailable(){
        return this.getAvailable();
    }

    // 대여여부 설정
    // 가져오는 건 게터, 새로운 값을 받아오는 건 세터
    public void setAvailable(boolean flag) {
        this.available = flag;
    }

    // 상세 정보 출력
    public void printBookInfo(){
        System.out.println("책 이름은" + this.title + "입니다.");
        System.out.println("대여 여부는" + this.available + "입니다.");
    }

}
