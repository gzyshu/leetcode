
public class day0518 {
    public int countTriplets(int[] arr) {
        if(arr.length<2) return 0;
        int ans=0;
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                int sum1=0;
                for(int k=i;k<=j;k++) sum1^=arr[k];
                if(sum1==0) ans+=j-i;
            }
        }
        return ans;
        //解释
    }
    public static void main(String[] args) {

    }
}

