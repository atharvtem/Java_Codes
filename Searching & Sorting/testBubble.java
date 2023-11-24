class demo{
	static void sort(int arr[]){
		boolean flag;
		for(int i=0;i<arr.length;i++){
			flag=false;
			for(int j=0;j<arr.length-i-1;i++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false){
				break;
			}
		}
		System.out.println("Sorted array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String [] args){
		int arr[] = new int[]{4,2,7,6,1};
		sort(arr);
	}
}
