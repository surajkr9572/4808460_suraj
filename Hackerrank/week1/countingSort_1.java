public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(mp.containsKey(arr.get(i))){
                mp.put(arr.get(i),mp.get(arr.get(i))+1);
            }
            else{
                mp.put(arr.get(i),1);
            }
        }
        List<Integer>li=new ArrayList();
        for (int i = 0; i < 100; i++) {
            if (mp.containsKey(i)) {
                li.add(mp.get(i));
            } else {
                li.add(0);
            }
        }
        return li;
    }