public static int flippingMatrix(List<List<Integer>> matrix) {
    int n = matrix.size() / 2;
    int maxSum = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int val1 = matrix.get(i).get(j);
            int val2 = matrix.get(i).get(2 * n - j - 1);
            int val3 = matrix.get(2 * n - i - 1).get(j);
            int val4 = matrix.get(2 * n - i - 1).get(2 * n - j - 1);
            maxSum += Math.max(Math.max(val1, val2), Math.max(val3, val4));
        }
    }
    return maxSum;
}