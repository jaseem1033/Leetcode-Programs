bool isSameAfterReversals(int num) {
    int temp=num;
    int rem;
    int rev=0;
    int rev2=0;

    if(num<10)
    return true;
    else
    {
        while(temp>0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;

        }  
        temp=rev;
        while(temp>0)
        {
            rem=temp%10;
            rev2=rev2*10+rem;
            temp=temp/10;
        }  
        return(num==rev2);
    }
     

}