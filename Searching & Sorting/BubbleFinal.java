class demo{
	static void sort(int arr[]){
		int count=0;
		boolean flag;
		for(int i=0;i<arr.length;i++){
			flag=false;
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
				count++;
			}
			if(flag==false){
				break;
			}
		}
		System.out.println("Sorted array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("No. of iterations: " + count);
	}
	public static void main(String [] args){
		int arr[] = new int[] {5,3,7,8,1};
		sort(arr);
	}
}

