import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Test3 {
    public static void main(String[] args) throws IOException {
        String[] fieldname = {"座號   " , "國文" , "英文" , "數學" , "社會" , "自然"};
        double[][] scores = {{1,71.5,94,32,40,66},
                {2,100,98,90,92.5,88},
                {3,85,100,92,77.5,84},
                {4,95,96,86,87.5,82},
                {5,44.5,90,52,40,52},
                {6,91.5,96,96,92.5,92},
                {7,88,94,84,95,82},
                {8,73.5,90,54,57.5,72},
                {9,56.5,38,40,25,50},
                {10,78,82,78,62.5,72}};

        System.out.printf("%-4s", fieldname[0]);
        for (int i = 1; i < fieldname.length; i++) {
            System.out.printf("%-5s\t", fieldname[i]);
        }
        System.out.println(" 總和   平均");

        for (int i = 0; i < scores.length; i++) {
            double scoressum = 0;
            System.out.printf("%-4d", (int)scores[i][0]);
            for (int j = 1; j < scores[i].length; j++) {
                System.out.printf(" " + "%-5.1f", scores[i][j]);
                scoressum += scores[i][j];
            }

            double average = scoressum / (scores[i].length - 1);
            System.out.printf(" " + "%-5.1f% -5.1f\n", scoressum, average);
        }

        System.out.println("科目"+"\t"+"最小值"+"\t"+"最大值");

        for (int i = 1; i < fieldname.length; i++) {
            double min=scores[0][i];
            double max=scores[0][i];
            for (int j = 1; j < scores.length; j++) {
                if (scores[j][i] < min) {
                    min = scores[j][i];
                }

                if (scores[j][i] > max) {
                    max = scores[j][i];
                }
            }
            System.out.println(fieldname[i]+"\t"+min+"\t" + max);
        }
    }
}
