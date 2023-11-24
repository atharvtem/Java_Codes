class demo{
	static void sort(int arr[]){
		for(int i=1;i<arr.length;i++){
			int element = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>element){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
		System.out.println("Sorted array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String [] args){
		int arr[] = new int []{7,5,9,2,4,1,10};
		sort(arr);
	}
}
