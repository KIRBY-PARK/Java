package week03;


public class Car {
    // < 필드영역 >

    // 1) 고유 데이터 영역
    // 자동차 회사
    String company;

    // 자동차 모델
    String model = "Gv80";

    // 자동차 색상
    String color;

    // 자동차 가격
    double price;

    // 2) 상태 데이터 영역
    // 자동차 속도, km/h
    double speed;

    // 기어 상태 (P, R, N, D)
    char gear;

    // 자동차 라이트 (true : 불 켜짐, false : 불 꺼짐)
    boolean lights = true;

    // 3) 객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    // < 생성자 영역 >
    // 생성자 : 처음 객체가 생성될 때(instance화)
    // : 어떤 로직을 수행해야하며, 어떤 값이 필수로 들어와야 하는지 정의!
    public Car (){
        // logic / 기본 생성자(아무것도 없는 형태) : 생략이 가능

        // 생성자 호출 및 객체 생성 여부 확인
        // System.out.println("생성자 호출, 객체 생성");
    }


    // < 메서드 영역 >

    // gasPedal
    // input : kmh
    // output : speed
    double gasPedal(double kmh, char type){
        // 가속도 페달을 밟으면 자동으로 기어가 변한다
        changeGear(type);
        speed = kmh;
        return speed;
    }


    // brakePedal
    // input : X
    // output : speed
    double brakePedal(){
        speed = 0;
        return speed;
    }

    // changeGear
    // input : gear(char type)
    // output : gear
    char changeGear(char type){
        gear = type;
        return gear;
    }

    // onOffLight
    // input : X
    // output : Lights(boolean)
    boolean onOffLights(){
        lights = !lights;
        return lights;
    }

    // horn
    // input : X
    // output : X
    void horn(){
        System.out.println("빵빵!");
    }

    // 자동차의 속도.. 가변길이 메서드
    void carSpeeds(double ... speeds){
        for(double v : speeds){
            System.out.println("v = " + v);
        }
    }
}
