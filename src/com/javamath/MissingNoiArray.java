package com.javamath;

public class MissingNoiArray {

	public static void main(String[] args) {
		int a[]={1,2,3,5,6,7,8,9};
		int sum=0;
		/*int expt_no_elements=a.length+1;
		int sum_total_element=(expt_no_elements)*(expt_no_elements+1)/2;*/
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		//System.out.println("missing no :"+ (sum_total_element-sum));
		int sum1=0;
for (int j= 0; j <=a.length+1; j++) {
	sum1=sum1+j;
}
System.out.println("Missing no:"+ (sum1-sum));

}
}
	

