package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private String carName;
    private int distance;
    //얼마나 이동했는지 표시하기 위한 문자열 변수
    private String view;

    public Car(String carName){
        this.carName = carName;
        distance = 0;
        view = "";
    }

    //테스트를 위한 생성자
    public Car(String carName, int distance){
        this.carName = carName;
        this.distance = distance;
    }

    public void playCar(){
        if(Randoms.pickNumberInRange(0,9) >= 4){
            distance++;
            view += "-";
        }
        printDistance();
    }

    private void printDistance(){
        System.out.println(carName + " : " + view);
    }

    public int getInstance(){
        return distance;
    }

    public String getCarName(){
        return carName;
    }
}