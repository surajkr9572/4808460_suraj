public static String counterGame(long n) {
    // Write your code here
        if(n==1) return "Richard";
        boolean flag=true;
        while(n!=1){
            if((n&(n-1))==0){
                n=n/2;
            }
            else{
                n=n-Long.highestOneBit(n);   
            }
            flag = !flag;
        }
        if (flag == true) {
            return "Richard";
        } else {
            return "Louise";
        }
    }