package _04_exception;

public class Exam1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        try{
            for (int i =0; i<nums.length+1; i++){
                System.out.println(nums[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스가 범위가 벗어났습니다."+e.toString());
        }

    }
}
