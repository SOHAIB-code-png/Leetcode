class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
       Map<Integer,Integer> map = new HashMap<>();

       for(int num : nums1){
        map.put(num,map.getOrDefault(num,0)+m);
       }
       for(int num : nums2){
        map.put(num,map.getOrDefault(num,0)+n);
       }
       int result=0;
       for(int num : map.keySet()){
          if(map.get(num) % 2 != 0){
            result^=num;
          }
       }
       return result;
    }
}
