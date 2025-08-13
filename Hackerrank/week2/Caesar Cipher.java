public static String caesarCipher(String s, int k) {
        StringBuilder str=new StringBuilder();
        k=k%26;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z'){
                str.append((char)(('A')+(c-'A'+k)%26));
            }
            else if(c>='a' && c<='z'){
                str.append((char)(('a')+(c-'a'+k)%26));
            }
            else{
                str.append(c);
            }
            
        }
        return str.toString();
    }