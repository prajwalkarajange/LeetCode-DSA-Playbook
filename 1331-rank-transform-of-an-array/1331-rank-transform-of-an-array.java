class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] copy=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }

        Arrays.sort(copy);

        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i:copy){
            if(!map.containsKey(i)){
                map.put(i,rank);
                rank++;
            }
        }

        int [] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;

    }
}