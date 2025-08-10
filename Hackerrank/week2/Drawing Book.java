public static int pageCount(int n, int p) {
        int cnt=0;
        for(int i=1;i<p;i+=2){
            cnt++;
        }
        int cnt1=0;
        int start=(n%2==0)?n:n-1;
        for(int i=start;i>p;i-=2){
            cnt1++;
        }
        return Math.min(cnt,cnt1);
}
