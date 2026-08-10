class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int stone : stones){
            pq.offer(stone);
        }
        int x=0,y=0;
        while(!pq.isEmpty()){
            x = pq.poll();
            if(pq.isEmpty())
                y = 0;
            else
                y = pq.poll();
            if(y ==0)
                return x;
            if(x!=y)
                pq.offer(x-y);
            
        }

        return 0;
        
    }
}
