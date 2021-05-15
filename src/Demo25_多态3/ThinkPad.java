package Demo25_多态3;

public class ThinkPad {
    public void powerOn() {
        System.out.println("开机功能");
    }

    public void powerOff() {
        System.out.println("关机功能");
    }

    //    使用usb设备方法，使用接口作为方法参数
    public void useDevice(UsbInterface usbInterface) {
        if (usbInterface instanceof Mouse) {
            Mouse mouse = (Mouse) usbInterface;//向下转型
            mouse.openDevice();
            mouse.clickFunction();
            mouse.closeDevice();
        } else if (usbInterface instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usbInterface;
            keyBoard.openDevice();
            keyBoard.beatFunction();
            keyBoard.closeDevice();
        }
    }
}
