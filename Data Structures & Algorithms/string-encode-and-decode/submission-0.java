class Solution {
    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            String s = strs.get(i);
            int n = s.length();

            ans.append(n);
            ans.append('#');
            ans.append(s);
        }
        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            String len="";
            while(str.charAt(i)!='#'){
                len+=str.charAt(i);
                i++;
            }
            int length=Integer.parseInt(len);
            
            i++; //skipm '#'
            
            String word=str.substring(i, i+length);
            ans.add(word);

            i+=length;
        }
        return ans;
    }
}
