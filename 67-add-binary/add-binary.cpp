class Solution {
public:
    string addBinary(string a, string b) {
        int k,x,y,i,j;
        k=0;
        i=a.length();
        j=b.length();
        int carry=0;
        string ans="";
        while(carry!=0||k<i||k<j)
        {
            (k<i && a[i-k-1]=='1')?x=1:x=0;

            (k<j && b[j-k-1]=='1')?y=1:y=0;

            ans=to_string((x+y+carry)%2)+ans;
            carry=(x+y+carry)/2;
            k++;
        }
        return ans;
    }
};
