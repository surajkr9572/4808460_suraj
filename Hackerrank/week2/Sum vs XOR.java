public static long sumXor(long n) {
    // Write your code here
    long count = 1;
    while (n != 0) {
        if (n % 2 == 0) {
            count *= 2;
        }
        n >>= 1;
    }
    return count;
}