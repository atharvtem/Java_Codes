class demo{
	static int binarySearch(int arr[],int target,int low,int high){
		while(low<high){
			int mid = (low+(high-1/2));
			if(target==arr[mid]){
				return mid;
			}
			else if(target<arr[mid]){
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		return -1;
	}

	public static void main(String [] args){
		int arr [] = new int[]{2,4,5,6,8,9};
		int mid = binarySearch(arr,8,0,arr.length-1);
		System.out.println("Element is present at array location: "+mid);
	}
}
