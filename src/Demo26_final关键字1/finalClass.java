package Demo26_final关键字1;
/**
 *【含义】当前这个类不能有任何的子类（太监类）,不能被继承
 * 【注意】一个类如果是final，那么其中的成员方法是不能被覆盖重写的。因为没儿子
 */
public final class finalClass /*extends ObjectClass*/{
       public void method(){
           System.out.println("方法执行！");
       }
}
