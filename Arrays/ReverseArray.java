class Solution{
  public static void main(String[] arg){
    int[] arr = {2,5,3,2,5,1};

    for(int i=0,j=arr.length-1; i<j; i++,j--){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }

    
  }
}
