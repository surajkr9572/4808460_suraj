public static int maxMin(int k, List<Integer> arr) {
    Collections.sort(arr);
    int unfairness = Integer.MAX_VALUE;
    for (int i = 0; i <= arr.size() - k; i++) {
        int compare = arr.get(i + k - 1) - arr.get(i);
        unfairness = Math.min(unfairness, compare);
    }
    return unfairness;
}