public static String balancedSums(List<Integer> arr) {
    // Write your code here
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        int leftSum=0;
        for(int i=0;i<arr.size();i++){
            if(sum-arr.get(i)==leftSum){
                return "YES";
            }
                else{
                sum-=arr.get(i);
                leftSum+=arr.get(i);
            }
        }
        return "NO";

    }

}
