class demo{
	static int binarySearch(int arr[],int target,int low,int high){
		int mid=0;
		while(low<high){
			mid= (low+(high-1/2));
			if(target==arr[mid]){
				return mid;
			}
			else if(target<arr[mid]){
				return binarySearch(arr,target,low,mid-1);
			}
			else if(target>arr[mid]){
				return binarySearch(arr,target,mid+1,high);
			}
		}
		return -1;
	}
	public static void main(String [] args){
		int arr[] = new int[] {2,4,6,7,9};
		int mid=binarySearch(arr,7,0,arr.length-1);
		System.out.println("Element is present at : " + (mid+1));
	}
}
