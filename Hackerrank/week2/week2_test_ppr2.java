static int lcm(int a, int b) {
    return a * b / gcd(a, b);
}

static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        int lcmA = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            lcmA = lcm(lcmA, a.get(i));
        }
        int gcdB = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            gcdB = gcd(gcdB, b.get(i));
        }
        int count = 0;
        for (int x = lcmA; x <= gcdB; x += lcmA) {
            if (gcdB % x == 0) {
                count++;
            }
        }
        return count;

    }
}