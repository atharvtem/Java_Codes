class demo {
    pulic int reverse(int x) {
        long newnum=0;
        if(x>0){
            while(x>0){
            int rem=x%10;
            newnum=newnum*10+rem;
            x/=10;
            }
        }
        else if(x<0){
            x*=(-1);
            while(x>0){
            int rem=x%10;
            newnum=newnum*10+rem;
            x/=10;
            }
            newnum*=(-1);
        }
        if(newnum>Integer.MAX_VALUE || newnum<Integer.MIN_VALUE){
            newnum=0;
        }
        return (int)newnum;
    }
}
