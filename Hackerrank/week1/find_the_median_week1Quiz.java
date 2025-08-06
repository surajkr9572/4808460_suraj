public static int findMedian(List<Integer> arr) {
    Collections.sort(arr);
    return arr.get(arr.size() / 2);

}