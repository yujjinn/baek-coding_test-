class Solution {
    public int[] solution(int n) {
        int [] answer = new int[(int)Math.pow(2,n)-1];
        fold(answer,0, (int)Math.pow(2,n)-1, 1, n);
        return answer;
    }
    public static void fold(int arr[], int start, int end, int cnt, int n ){

        if(cnt == n){
            return;
        }
        int mid = (start+end)/2;
        int left = (start+mid)/2;
        int right = (mid+end)/2;
        arr[left]=0;
        arr[right]=1;

        fold(arr, start, mid, cnt+1, n);
        fold(arr, mid, end, cnt+1, n);
    }
}
