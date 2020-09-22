package Part1JavaSyntax.visibilityOfVariables;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
升序数字
*/

public class Numbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int Num1 = Integer.parseInt(reader.readLine());
        int Num2 = Integer.parseInt(reader.readLine());
        int Num3 = Integer.parseInt(reader.readLine());
        int Num4 = Integer.parseInt(reader.readLine());
        int Num5 = Integer.parseInt(reader.readLine());

        int num[] = {Num1,Num2,Num3,Num4,Num5};
        Arrays.sort(num);

        for (int i = 0;i<num.length;i++){

            System.out.println(num[i]);

        }
    }
}
