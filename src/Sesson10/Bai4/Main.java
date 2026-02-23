package Sesson10.Bai4;

public class Main {
    public static void main(String[] args) {
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn cảm ứng: Đèn đã bật (Đang quét chuyển động...)");
            }
        };

        System.out.println("--- Điều khiển Đèn Thông Minh ---");
        smartLight.powerOn();
        smartLight.checkBattery();
    }
}