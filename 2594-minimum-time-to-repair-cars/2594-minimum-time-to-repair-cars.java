class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low = 1;
        long min = ranks[0];
        for(int i=0;i<ranks.length;i++){
            min = Math.min(min , ranks[i]);
        }

        long high = min * (long) cars * cars;
        while(low < high){
            long mid = low + (high - low) / 2;
            long carsDone = 0;
            for(int i=0;i<ranks.length;i++){
                long canDo = (long)Math.sqrt(mid/ranks[i]);
                carsDone += canDo;

                if(carsDone >= cars){
                    break;
                }

            }

            if(carsDone >= cars){
                high = mid ;
            }else{
                low = mid + 1;
            }
        }

        return low;
    }
}