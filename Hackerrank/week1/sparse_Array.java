public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
Map<String,Integer>mp=new HashMap<>();
        for(int i=0;i<queries.size();i++){
            mp.put(queries.get(i),0);
        }
        for(int i=0;i<strings.size();i++){
            String str=strings.get(i);
            if(mp.containsKey(str)){
                int cnt=mp.get(str);
                mp.put(str,cnt+1);
            }
        }
                for(int i=0;i<queries.size();i++){
            AnswerList.add(mp.get(queries.get(i)));
        }
        return AnswerList;

    }
}