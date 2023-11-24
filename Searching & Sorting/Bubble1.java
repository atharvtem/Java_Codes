class demo{
	void sort(int arr []){
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				count++;
			}
		}
		System.out.println("Sorted array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		System.out.println("Number of iterations: " + count);
	}

	public static void main(String [] args){
		int arr [] = new int[]{1,2,3,4,5,6};
		demo obj = new demo();
		obj.sort(arr);
	}
}
