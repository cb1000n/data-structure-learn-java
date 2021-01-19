package a_array.a_array_basics;

/**
 * 最基础的数组
 */
public class Main {
    public static void main(String[] args) {
        // 声明一个数组
        int[] arr = new int[10];
        // 便利赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        // 声明一个数组，并赋值
        int[] scores = {100, 99, 66};
        // 便利输出
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        // 便利输出
        for (int score : scores) {
            System.out.println(score);
        }
        // 设置所以为 0 的值为 96
        scores[0] = 96;
        // 便利输出
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
