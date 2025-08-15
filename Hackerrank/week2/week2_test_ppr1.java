bool isPalindrome(const string &s, int left, int right) {
    while (left < right) {
        if (s[left] != s[right]) return false;
        left++;
        right--;
    }
    return true;
}
int palindromeIndex(string s) {
    int i=0;
    int j=s.length()-1;
    while(i<j){
        if(s[i]!=s[j]){
            if (isPalindrome(s, i + 1, j)) return i;
            if (isPalindrome(s, i, j - 1)) return j;
            return -1; 
        }
        i++;
        j--;
    }
    return -1;
}