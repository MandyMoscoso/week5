import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] listNum = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        MissingNum missingNum = new MissingNum();
        System.out.println(missingNum.getMissing(listNum,maxNum));

    }
}