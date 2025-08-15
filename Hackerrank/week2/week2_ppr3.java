public static int anagram(String s) {
    // Write your code here
        int len = s.length();
        if (len % 2 != 0) {
            return -1; 
        }
        int mid = len / 2;
        String s1 = s.substring(0, mid);
        String s2 = s.substring(mid);
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            freq2[c - 'a']++;
        }
        int changes = 0;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] > freq2[i]) {
                changes += freq1[i] - freq2[i];
            }
        }
        return changes;
    }
}