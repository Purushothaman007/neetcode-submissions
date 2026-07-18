class Solution {
    public boolean isHappy(int num) {
        while(num>=1)
        {
            int temp=num;
            int sum=0;
            while(temp!=0)
            {
                sum+=Math.pow(temp%10,2);
                temp/=10;
            }
            num=sum;
            if(num==1) return true;
            if(num==4) return false;
        }

        return false;
    }
}
