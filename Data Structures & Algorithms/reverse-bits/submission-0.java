class Solution {
    public int reverseBits(int n) {
        int i=0;
        int num=0;
        while(i<32)
        {
            num=num<<1;
            num=num | (n&1);
            n=n>>1;
            i++;
        }
        return num;
    }
}
