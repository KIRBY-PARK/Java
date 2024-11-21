package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // 속 생 기
    private List<Book> books;

    // 생성자 : 책 목록 초기화 필요
    public Library() {
        books = new ArrayList<>();
    }

    // 책 추가 (세터 형식)
    public void addBook(Book book) { // books에 저장해야함
        books.add(book);
    }

    // 책 제거
    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
//            if (book.getTitle().equals(title)) {
//                System.out.println("Found Book: " + book.getTitle());
//            }

            String foundBookTitle = book.getTitle();
            if (foundBookTitle.equals(title)) {
                return book;
            }
        }
        return null;
    }
}
