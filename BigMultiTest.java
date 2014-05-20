package BigMulitiTest;

import java.util.Scanner;

public class BigMultiTest {

	public static void main(String args[]){
		Scanner reader=new Scanner(System.in);
		System.out.println("Please input the first num:");
		String reader1=reader.next();
		System.out.println("Please input the second num:");
		String reader2=reader.next();
		int[] num1=CharToArray(reader1);
		int[] num2=CharToArray(reader2);
		MultiTest(num1,num2);
	}


public static int[] CharToArray(String str1){
	int length=str1.length();
	int [] intarray=new  int[length];
	for(int i=0;i<length;i++)
	{
		intarray[length-i-1]=Integer.parseInt(String.valueOf(str1.charAt(i)));
	}
	return intarray;
	
	} 
public static int[] MultiTest(int[] num1,int[] num2){
	int length=num1.length+num2.length;
	int[] result=new int[length];
	for(int i=0;i<num1.length;i++)
		for(int j=0;j<num2.length;j++)
		{   int temp=result[i+j]+num1[i]*num2[j];
		   // System.out.println(temp);
			result[i+j]=temp%10;
			result[i+j+1]+=temp/10;
			/*if(result[i+j+1]>=10)
			{
				result[i+j+1]%=10;
				result[i+j+2]++;
			}*/
		}
		StringBuffer bf=new StringBuffer();
		for(int k=result.length-1;k>=0;k--)
			{
			bf.append(result[k]);
			}
			
	System.out.println("The two big num Multi=="+bf.toString());
	
	return result;
}
}

