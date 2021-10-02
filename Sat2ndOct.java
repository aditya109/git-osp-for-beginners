//code by arya
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>>result=new ArrayList<>();
            combsum(0,candidates,target,result,new ArrayList<>());
            return result;
    }
    private void combsum(int i,int[] arr,int target,List<List<Integer>>result,List<Integer>list)
    {
        if(i==arr.length)
        {
            if(target==0){
            result.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[i]<=target)
        {
            list.add(arr[i]);
            combsum(i,arr,target-arr[i],result,list);
            list.remove(list.size()-1);
        }
        combsum(i+1,arr,target,result,list);
    }
}
