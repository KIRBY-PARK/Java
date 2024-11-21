package week02gy;

public class Cup {

    // 속성
    private String name;
    private String color;

    // 생성자
    // 외부에서 생성해야하니까 public (때에 따라 다름)
    // 아무것도 입력 안하면 디폴트
    public Cup(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // 메서드
    private void method(){}

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}
