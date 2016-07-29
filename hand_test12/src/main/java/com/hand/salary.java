package com.hand;

import java.util.Scanner;

public class salary {
	

	
	public static void main(String[] args) {
		double tax=0;
		System.out.print("请输入您要的工资");
		
		Scanner qq=new Scanner(System.in);
		
		int zxc=qq.nextInt();
		if(zxc<=1500){
			tax=zxc*0.03;
		}else if(zxc>1500&&zxc<4500)
		{
			tax=zxc*0.1;
		}
		else if(zxc>4500&&zxc<9000){
			tax=zxc*0.2;
		}
else if(zxc>9000&&zxc<35000){
	tax=zxc*0.25;
		}
else if(zxc>35000&&zxc<55000){
	tax=zxc*0.3;
}
else if(zxc>55000&&zxc<80000){
	tax=zxc*0.35;
}
else {
	tax=zxc*0.45;
}
		
		System.out.println(tax);
	}

}
