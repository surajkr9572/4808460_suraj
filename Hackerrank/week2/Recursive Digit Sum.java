public static int fun(long num) {
    if (num < 10) {
        return (int) num;
    }
    long sum = 0;
    while (num > 0) {
        sum += num % 10;
        num = num / 10;
    }
    return fun(sum);
}

public static int superDigit(String n, int k) {
    long sum = 0;
    for (char ch : n.toCharArray()) {
        sum += ch - '0';
    }
    sum = sum * k;
    return fun(sum);
}