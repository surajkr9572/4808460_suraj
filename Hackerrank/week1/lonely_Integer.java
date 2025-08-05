public static int lonelyinteger(List<Integer> a) {
        Map<Integer,Integer>mp=new HashMap();
        for(int i=0;i<a.size();i++){
            if(mp.containsKey(a.get(i))){
                mp.put(a.get(i),mp.get(a.get(i))+1);
            }else{
                mp.put(a.get(i),1);
            }
        }
        int cnt = 0;
        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            if (e.getValue() == 1) {
                cnt = e.getKey();
            }
        }
        return cnt;

    }