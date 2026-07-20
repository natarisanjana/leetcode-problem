class Solution {
    public int[] minOperations(String boxes) {
        int arr[]=new int[boxes.length()];
        int n=boxes.length();
        int one=0;
        for(int i=0;i<boxes.length();i++)
        {
            arr[i]=boxes.charAt(i)-'0';
            if(arr[i]==1)
            one++;
        }
        int sum=0;
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            sum+=Math.abs(i-0);
        }
        x[0]=sum;
        int last =arr[0];
        one=one-arr[0];
        int pachadone=arr[0];
        for(int i=1;i<n;i++)
        {
            
                x[i]=x[i-1]-one+pachadone;
                if(arr[i]==1)
                {pachadone++;
                one--;
                 }
           
        }      
        return x;
    }
}
