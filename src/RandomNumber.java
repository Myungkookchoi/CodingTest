import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
//        System.out.print("ID \t");
//        System.out.print("Score");
//        System.out.println();
//        for (int i = 1; i < 151; i++) {
//            Random random = new Random();
//            int rdNum = random.nextInt(100);
//            if (rdNum < 10) {
//                rdNum = rdNum * 10;
//            }
//            if (rdNum == 0) {
//                rdNum = rdNum + 58;
//            }
//            System.out.print(i + " \t");
//            System.out.print(rdNum + ", ");
//            System.out.println();
//        }
        System.out.println("===Start===");
        int[] data = {70, 50, 62, 25, 75, 86, 90, 88, 40, 60, 12, 56, 48, 98, 62, 36, 97, 60, 93, 40, 63, 17, 26, 93, 52, 62, 33, 61, 74, 28, 10, 85, 15, 98, 29, 90, 87, 79, 81, 46, 80, 41, 91, 56, 88, 20, 70, 91, 86, 83, 67, 58, 27, 92, 54, 61, 55, 30, 31, 86, 58, 30, 17, 33, 10, 50, 19, 98, 96, 81, 91, 54, 96, 31, 35, 21, 84, 62, 32, 85, 10, 74, 25, 67, 94, 56, 62, 67, 96, 98, 90, 67, 45, 21, 90, 78, 74, 83, 90, 48, 68, 91, 91, 35, 10, 78, 23, 79, 60, 35, 66, 85, 59, 54, 32, 20, 54, 54, 55, 49, 45, 28, 37, 52, 93, 61, 31, 30, 89, 83, 27, 85, 24, 48, 47, 43, 20, 92, 55, 17, 54, 39, 55, 31, 84, 68, 41, 52, 63, 79};
        Arrays.sort(data);
        float all = 0;

        for(int i = 0; i < data.length; i++){
            all += data[i];
        }
        float mean = all / data.length;
        System.out.println(mean);
        float var = 0;
        for(int i = 0; i < data.length; i++){
            if(data[i] > mean){
                float want = data[i] - mean;
                var += want * want;
            } else {
                float want = mean - data[i];
                var += want * want;
            }
        }
        System.out.println(var);
        System.out.println(var/149);
//
//        for (int i = 0; i < making.length; i++) {
//            if (i % 10 == 0) {
//                System.out.println();
//                System.out.print((i + 1) + " ~ " + ((i + 1) + 9) + " - ");
//            }
//            if (i == 149) {
//                System.out.print(making[i]);
//            } else {
//                System.out.print(making[i] + ", ");
//            }
//        }
    }
}
