StringBuilder str = new StringBuilder();

for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);

    // Check if character is a lowercase letter
    if (c >= 'a' && c <= 'z') {
        char ans = (char) (c + k);
        if (ans > 'z') {
            ans = (char) ('a' + (ans - 'z' - 1));
        }
        str.append(ans);
    }
    // Check if character is an uppercase letter
    else if (c >= 'A' && c <= 'Z') {
        char ans = (char) (c + k);
        if (ans > 'Z') {
            ans = (char) ('A' + (ans - 'Z' - 1));
        }
        str.append(ans);
    }
    // Special characters: keep as is
    else {
        str.append(c);
    }
}

return str.toString();
