package sep_1031;

public class MovieEx {
    public static void main(String[] args) {
        double rating =  9.1;

        if (rating <= 9){
            System.out.println("'어바웃 타임'을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("'토이스토리'를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("'인디아나존스'를 추천합니다.");
        }
    }
}
