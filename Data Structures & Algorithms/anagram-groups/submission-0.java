class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str:strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String sorted = new String(ch);

            if(map.containsKey(sorted)){
                map.get(sorted).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted, list);
            }
        }
        ans.addAll(map.values());
        return ans;
    }
}
