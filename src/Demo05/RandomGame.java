package Demo05;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        int answerNum = random.nextInt(100) + 1;//[1,100]
        System.out.println("请输入你的数字：");
        Scanner scanner = new Scanner(System.in);
        while (true){//循环次数不确定（死循环）
            int guessNum = scanner.nextInt();
            if (guessNum == answerNum) {
                System.out.println("恭喜您答对了");
                break;//结束死循环
            }else if (guessNum>answerNum){
                System.out.println("太大了");
            }else {
                System.out.println("太小了");
            }
        }
    }


}
