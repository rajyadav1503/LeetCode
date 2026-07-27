class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr = new ArrayList<>();
        
        arr.add(1);
        
        for(int i = 1; i<=rowIndex ; i++){
            List<Integer> next = new ArrayList<>();
            next.add(1);

            for(int j=1;j<arr.size() ;j++){
                next.add(arr.get(j-1) + arr.get(j));
            }

            next.add(1);
            arr = next;
        }

        return arr;

    }
}