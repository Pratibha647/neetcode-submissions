class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        TreeMap<Integer, Double> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0; i<position.length; i++){
            map.put(position[i], (double)(target-position[i])/speed[i]);
        }

        int count=0;
        double lastTime=0;
        for(double time : map.values()){
            if(time>lastTime){
                count++;
                lastTime=time;
            }
        }
        return count;
    }
}