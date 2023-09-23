package Day2;

import java.util.List;

public class DiagnolDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagnol = 0;
        int rightDiagnol = 0;

        int n = arr.size();

        for (int i = 0; i < n; i++) {
            leftDiagnol += arr.get(i).get(i);
            rightDiagnol += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(leftDiagnol - rightDiagnol);

    }
}
