import java.lang.Math;

public class test{
    public static void main(String[] args) {
        int [] arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));

    }
    public static int Area(int i,int j,int[] height){

        return i;
    }


        public static int maxArea(int[] height) {
            int area=0; 
            for(int i=0;i<height.length;i++){
                int temp=0;
                for(int j=height.length-1;j>0;j--){
                    int diff=Math.abs(i-j);
                    if(height[i]<=height[j]){
                        temp=diff*height[i];
                        if(area<temp){
                            area=temp;
                        }
                    }
                    else{
                        temp=diff*height[j];
                        if(area<temp){
                            area=temp;
                        }
                    }
                }
            }
            return area;
        }
    }
