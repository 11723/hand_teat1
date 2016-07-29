package com.hand;

public class shushu {

	public static void main(String[] args) {
		jishuan(101,200);

	}
	public static void jishuan(int i,int j){
		for(;i<=j;i++)
		{
			for(int k=2;k<=i;k++)
			{
				if(i%k==0&&i!=k)
				{
					
					break;
					
				}
				else if(i%k==0&&i==k){
					System.out.println(i);
				}
			}
			
		}
		
	}

}
