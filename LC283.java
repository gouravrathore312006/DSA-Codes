public class LC283{
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        int temp = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[temp] = nums[i];
                temp++;
            }
        }
        while(temp < nums.length){
            nums[temp] = 0;
            temp++;
        }
        System.out.println();
    }
}