public static int sockMerchant(int n, List<Integer> ar) {
    Map<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i < n; i++) {
        if (mp.containsKey(ar.get(i))) {
            mp.put(ar.get(i), mp.get(ar.get(i)) + 1);
        } else {
            mp.put(ar.get(i), 1);
        }
    }
    int cnt = 0;
    for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
        cnt += e.getValue() / 2;
    }
    return cnt;
}
