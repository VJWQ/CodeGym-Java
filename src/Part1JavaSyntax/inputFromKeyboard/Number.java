package Part1JavaSyntax.inputFromKeyboard;
import java.io.*;
//1. 从控制台读取数字 N（必须大于 0）
//2. 从控制台读取 N 个数字
//3.显示 N 个输入数字中的最大值。
public class Number {
    public static void main(String[] args) throws Exception {
        int maximum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN = reader.readLine();
        int N = Integer.parseInt(sN);
        if(N > 0) {
            for(int i = 0; i < N; i++) {
                String sNum = reader.readLine();
                int num = Integer.parseInt(sNum);
                if(maximum == 0) {
                    maximum = num;
                }
                else {
                    maximum = maximum < num ? num : maximum;
                }
            }
            System.out.println(maximum);
        }
    }
}