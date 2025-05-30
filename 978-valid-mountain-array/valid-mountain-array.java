class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int idx = -1;
        if(n < 3) return false;
        if(arr[0] > arr[1] || arr[n-1] > arr[n-2]) return false;
        for(int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) return false;
            if(arr[i] > arr[i+1]) {
                idx = i;
                break;
            }
        }
        if(idx == -1) return false;

        for(int i = idx; i < n-1; i++) {
            if(arr[i] == arr[i+1]) return false;
            if(arr[i] < arr[i+1]) return false;
        }
            return true;
        }
    }
