import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int num = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
