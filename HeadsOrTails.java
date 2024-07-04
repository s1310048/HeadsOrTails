import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
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