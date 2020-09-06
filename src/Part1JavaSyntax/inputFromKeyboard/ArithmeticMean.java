package Part1JavaSyntax.inputFromKeyboard;
import java.io.*;

public class ArithmeticMean {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double res = 0;
        int count = 0;
        while(true){
            String s = reader.readLine();
            double n = Double.parseDouble(s);
            if(n==-1){
                res = (res*count)/count;
                System.out.println(res);
                break;
            }else{
                res = (res*count+n)/(count+1);
                count++;
            }
        }
    }
}
