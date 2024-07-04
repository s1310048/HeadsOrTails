import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("あなたは誰ですか？");
        String userName = scanner.nextLine();
        System.out.println("こんにちは、" + userName);

        String[] outcomes = {"表", "裏"};
        int headsCount = 0;
        int tailsCount = 0;

        System.out.println("コインを投げる");

        for (int i = 0; i < 3; i++) {
            String result = outcomes[new Random().nextInt(2)];
            System.out.println("ラウンド " + (i + 1) + ": " + result);
            if (result.equals("表")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        System.out.println("表 " + headsCount + "、裏 " + tailsCount);
    }
}