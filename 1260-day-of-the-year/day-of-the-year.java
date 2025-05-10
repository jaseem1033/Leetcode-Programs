class Solution {
    public int dayOfYear(String date) {
        int arr[]=new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] Date=date.split("-");

        int year=Integer.valueOf(Date[0]);
        int month=Integer.valueOf(Date[1]);
        int day=Integer.valueOf(Date[2]);
        
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        arr[2]=29;

        int sum=0;
        for(int i=1;i<month;i++)
        sum+=arr[i];

        return sum + day;
    }
}