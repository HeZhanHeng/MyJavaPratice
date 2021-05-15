package Demo25_多态3;

public class KeyBoard implements UsbInterface {
    @Override
    public void openDevice() {
        System.out.println("打开键盘功能");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘功能");
    }
    public void beatFunction(){
        System.out.println("键盘敲击功能");
    }
}
