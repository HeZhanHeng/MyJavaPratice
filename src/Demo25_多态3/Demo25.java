package Demo25_多态3;

public class Demo25 {
    public static void main(String[] args) {
//        首先创建一个电脑
        ThinkPad thinkPad =new ThinkPad();
//        开机
        thinkPad.powerOn();
//        准备一个鼠标
        Mouse mouse=new Mouse();
//        准备向上转型
        UsbInterface usbInterface =mouse;
//        参数是usb接口
        thinkPad.useDevice(usbInterface);
        //没有使用多态
        KeyBoard keyBoard =new KeyBoard();
//        传递进去的是实现类，自动向上转型
        thinkPad.useDevice(keyBoard);
        thinkPad.powerOff();

    }
}
