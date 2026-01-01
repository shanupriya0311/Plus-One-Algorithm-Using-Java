class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int c=1;
        List<Integer>result=new ArrayList<>();
        if(n==1){
            int r=digits[0]+1;
            c=r/10;
            int i=0;
            int[] rs;
            if(c!=0){
            rs=new int[2];
            rs[i++]=c;
            rs[i]=r%10;
            }
            else{
                rs=new int[1];
                rs[i]=r;
            }
            return rs;
        }
        for(int i=n-1;i>=0;i--){
            int ans=digits[i]+c;
            c=0;
            if(ans/10!=0){
                c=ans/10;
            }
            result.add(ans%10);
        }
        if(c!=0){
            result.add(c);
        }
        int m=result.size()-1;
        int i=0;
        int[] arr=new int[m+1];
        while(m>=0){
          arr[i]=result.get(m);
          i++;
          m--;
        }
        return arr;

    }
}
