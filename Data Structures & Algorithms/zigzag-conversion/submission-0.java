class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        if(n==1 || numRows==1 || numRows>n) return s;
        StringBuilder str=new StringBuilder();
        for(int i=0; i<numRows; i++){
            int below=numRows-i-1;
            int above=i;
            int skipBelow=below+(below-1);
            int skipAbove=above+(above-1);

            int curr=i;
            str.append(s.charAt(curr));
            boolean down=true;
            while(curr<n){
                if(down){
                    if(skipBelow>0){
                        curr+=skipBelow+1;
                        if(curr<n) str.append(s.charAt(curr));
                    }
                    down=false;
                }else{
                    if(skipAbove>0){
                        curr+=skipAbove+1;
                        if(curr<n) str.append(s.charAt(curr));
                    }
                    down=true;
                }
            }
        }
        return str.toString();
    }
}