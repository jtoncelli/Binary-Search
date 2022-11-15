class Main {
	public static int findIndex(int [] arr, int startIndex, int endIndex, int n){
		if(arr[(int)(startIndex + endIndex)/2] == n){
			return (startIndex + endIndex)/2;
		}
		else if(arr[(int)(startIndex + endIndex)/2] > n){
			return findIndex(arr, startIndex, (int)(startIndex + endIndex)/2, n);
		}
		return findIndex(arr, (int)(startIndex + endIndex)/2, endIndex, n);
	}
  public static void main(String[] args) {
		int []arr = {1,2,3,4,5,6,7,8};
    System.out.println(findIndex(arr, 0, 7, 1));
		//findIndex(arr, 0, 7, 1) should return 0
  }
}
