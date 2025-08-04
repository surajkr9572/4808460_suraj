public static void plusMinus(List<Integer> arr) {
        float negativeCount=0;
        float positiveCount=0;
        float zeroCount=0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                positiveCount++;
            } else if (arr.get(i) < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println(positiveCount / arr.size());
        System.out.println(negativeCount / arr.size());
        System.out.println(zeroCount / arr.size());
    }
