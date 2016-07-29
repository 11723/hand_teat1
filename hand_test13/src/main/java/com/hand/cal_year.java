package com.hand;

import java.util.Scanner;

public class cal_year {

	public static void main(String[] args) {
		
		int dada;
		System.out.println("请输入今年年月日：按照格式为YYYY-MM-DD");
		Scanner a=new Scanner(System.in);
		String year=a.next();
		System.out.println("请输入今年年月日：按照格式为YYYY-MM-DD");
		int year1=Integer.parseInt(year.substring(0, 4));
	
	int month1=Integer.parseInt(year.substring(5, 7));
		int day1=Integer.parseInt(year.substring(8, 10));
		
		
			switch (month1){
			case  1:
			 dada=day1;
			 break;
			case 2:
				dada=31+day1;
				break;
			case 3:
				dada=31+29+day1;
				break;
			case 4:
				dada=31+29+31+day1;
				break;
			case 5:
				dada=31+29+31+30+day1;
				break;
			case 6:
				dada=31+29+31+30+31+day1;
				break;
			case 7:
				dada=31+29+31+30+31+30+day1;
				break;
			case 8:
				dada=31+29+31+30+31+30+31+day1;
				break;
			case 9:
				dada=31+29+31+30+31+30+31+31+day1;
				break;
			case 10:
				dada=31+29+31+30+31+30+31+31+30+day1;
				break;
			case 11:
				dada=31+29+31+30+31+30+31+31+30+31+day1;
				break;
			default:
				dada=31+29+31+30+31+30+31+31+30+31+30+day1;
				
			}
				if((year1%4==0&&year1%100!=0)||year1%400==0)
				{
					if(month1>2)
					dada=dada;
					
					
				}
				else{
					if(month1>2){
						dada=dada-1;
						
					}
				}
//				else if(((year1%4==0&&year1%100!=0)||year1%400==0)&&month1>2)
//				{
//					dada=dada+1;
//				}
//				else if(month1>3){
//					
//					dada=dada-1;
//				}
			
			System.out.println("这天是今年的第"+dada+"天");
		
		
	}

}
