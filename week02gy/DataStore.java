package week02gy;

// 핵시설 개발자
// data <- "a" 라는 문자열이 들어오면 핵폭발
public class DataStore {
    private String data;

    // 무분별한 Setter 막는 방법 (내부에서 방지 처리해놓기)
    public void setData(String data) {
        if (data.equals("a")){
            System.out.println("a 입력하면 인생 끝");
        } else {
            this.data = data;
        }
        this.data = data;
    }
}
