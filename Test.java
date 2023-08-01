public class Test {
    public static void main(String[] args) {
        int arr[]={2,3,4,2,-1,1,3,4,5,0,2};
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            if (arr[i]==Integer.MAX_VALUE) {
                    continue;
                }
            for (int j = i+1; j < arr.length; j++) {
                
                if (arr[i]==arr[j]) {
                    arr[j]=Integer.MAX_VALUE;
                    count++;
                    continue;
                }
            }
            if(count==0){
                System.out.println("Non-Repeated :- "+arr[i]);
            }else{
                count=0;
            }
        }
    }
}
