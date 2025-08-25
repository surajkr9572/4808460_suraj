public class New Year Chaos {
        int bribe = 0;
        for (int i = q.size() - 1; i > 0; i--) {
            if (q.get(i) != i + 1) {
                if (q.get(i - 1) == i + 1) {
                    int temp = q.get(i - 1);
                    q.set(i - 1, q.get(i));
                    q.set(i, temp);
                    bribe++;
                } else if (q.get(i - 2) == i + 1) {
                    int temp = q.get(i - 2);
                    q.set(i - 2, q.get(i - 1));
                    q.set(i - 1, q.get(i));
                    q.set(i, temp);
                    bribe += 2;
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(bribe);
}
