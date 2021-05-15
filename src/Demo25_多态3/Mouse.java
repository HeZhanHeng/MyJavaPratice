package Demo25_多态3;

public class Mouse implements UsbInterface {
    @Override
    public void openDevice() {
        System.out.println("打开鼠标设备");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标设备");
    }
    public void clickFunction(){
        System.out.println("鼠标点击功能");
    }
}
