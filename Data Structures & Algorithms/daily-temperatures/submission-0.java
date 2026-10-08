class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<n; i++){
            if(st.empty() || temp[st.peek()]>=temp[i]){
                st.push(i);
            }else {
                while(!st.empty() && temp[i]>temp[st.peek()]){
                    ans[st.peek()]=i-st.peek();
                    st.pop();
                }
                st.push(i);
            }
        }
        return ans;
    }
}