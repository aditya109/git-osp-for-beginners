public class RemoveDuplicatesFromArray {
	public int removeDuplicates(int[] nums) {		
		int i=1;
		if(nums.length==0) {
			i=0;
		}
		else {
		    for(int j=1;j<nums.length;j++){
			    if(nums[j]!=nums[j-1]){         
				    nums[i]=nums[j];
				    i++;
			     }
		     }
		}
	     return i;
	}
}
