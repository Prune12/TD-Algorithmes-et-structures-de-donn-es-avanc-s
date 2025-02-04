package Exercice5;

public class KadaneAlgorithm {

    // Renvoie un tableau contenant {maxSum, startIndex, endIndex}
    public static int[] kadane(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0, tempStart = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            // Si currentSum est meilleur que maxSum, mettre à jour maxSum et les indices
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
            // Si currentSum devient négatif, on réinitialise
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }
        return new int[]{maxSum, start, end};
    }

}

