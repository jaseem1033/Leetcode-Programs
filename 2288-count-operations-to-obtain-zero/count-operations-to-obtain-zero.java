class Solution {
    public int countOperations(int num1, int num2) {
        if(num1 == 0 || num2 == 0) return 0;
        int count=0;

        while(num1 != 0 && num2 !=0)
        {
            if(num1>num2)
                num1=num1-num2;

            else if(num1<num2)
                num2=num2-num1;

            else
                num1-=num2;
            
            count++;
        }
        return count;
        
    }
}