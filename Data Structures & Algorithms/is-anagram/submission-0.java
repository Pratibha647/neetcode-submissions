class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] st=s.toCharArray();
        char[] xy=t.toCharArray();
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<st.length; i++){
            int freq=map.getOrDefault(st[i],0);
            map.put(st[i], freq+1);
        }
        for(int i=0; i<xy.length; i++){
            int freq=map.getOrDefault(xy[i],0);
            if(freq==0) return false;
            freq--;
            if(freq==0) map.remove(xy[i]);
            else map.put(xy[i], freq);
        }

        return map.isEmpty();

    }
}
