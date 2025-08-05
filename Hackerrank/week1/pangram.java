public static String pangrams(String s) {
    Set<Character> st = new HashSet<>();
    s = s.toLowerCase();
    for (char ch : s.toCharArray()) {
        if (ch >= 'a' && ch <= 'z') {
            st.add(ch);
        }
    }
    if (st.size() == 26) {
        return "pangram";
    } else {
        return "not pangram";
    }

}