class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;

        double nn = n;

        if(nn < 0){
            nn = -nn;
            x = 1/x;
        }

        if(nn%2 ==0){
            return myPow(x * x, (int) nn/2); 
        }else{
            return x * myPow(x, (int)nn-1);
        }


        // double ans = 1.0;
        // double nn = n;
        // if(nn<0) nn = -1 * nn;

        // while(nn>0){
        //     if(nn%2==1){
        //         ans = ans * x;
        //         nn = nn-1;
        //     }else{
        //         x = x * x;
        //         nn = nn/2;
        //     }
        // }

        // if(n<0) ans = (double)1 / ans;
        // return ans;
    }   
}
