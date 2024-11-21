package equal;

// javadoc 스타일 주석 (주석은 이렇게 달라고 정해놓은 규칙이 있음)
/*
* 제목
* 내용 ->>>>>>
*
* */
public class Book {
    // 속성
    private String title;
    private String author;

    // 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 기능
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}
