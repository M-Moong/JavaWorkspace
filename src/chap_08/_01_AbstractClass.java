package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스에서만 사용 가능 한 껍데기만 있는 메소드)

        // Camera camera = new Camera(); 추상클래스이기 때문에 객체 생성 불가능
        FactoryCam factoryCam = new FactoryCam(); // 자식 클래스에서는 생성 가능
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam(); // 자식 클래스에서는 생성 가능
        speedCam.showMainFeature();
    }
}
