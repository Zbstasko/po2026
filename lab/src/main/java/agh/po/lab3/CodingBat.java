package agh.po.lab3;

public class CodingBat {
    public boolean array123(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }
    public boolean lucky13(int[] nums) {
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i]==1 || nums[i]==3)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        CodingBat c = new CodingBat();
        System.out.println("wynik:"+ c.array123(new int[]{1,1,2,2,3,3,1,3,2}));
        System.out.println("wynik:"+ c.array123(new int[]{1,1,2,2,3,3,1,2,3}));
    }
}
