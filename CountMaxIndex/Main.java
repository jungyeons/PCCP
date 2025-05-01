package CountMaxIndex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CountMaxIndex solver = new CountMaxIndex();
        int[] input = {1, 3, 5, 4, 5, 2, 1};
        int[] result = solver.getMaxIndexes(input);
        System.out.println(Arrays.toString(result)); // 출력: [2, 4]
    }
}
