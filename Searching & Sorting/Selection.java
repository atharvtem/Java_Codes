class demo{
	static void sort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			int min_idx = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min_idx]){
					min_idx =j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
		}
		System.out.println("Sorted array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String [] args){
		int arr[] = new int[]{3,5,8,2,6};
		sort(arr);
	}
}
