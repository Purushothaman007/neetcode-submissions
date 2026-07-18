class Solution {
    public double myPow(double x, int n) {
        boolean flag=false;
        if(n<0)
        {
            n=Math.abs(n);
            flag=true;
        }
        double ans=1;

        while(n!=0)
        {
            if(n%2==0)
            {
                x=x*x;
                n=n/2;
            }
            else
            {
                ans*=x;
                n=n-1;
            }
        }

        if(flag)
        {
            ans=1/ans;
        }

        return ans;
    }

}
