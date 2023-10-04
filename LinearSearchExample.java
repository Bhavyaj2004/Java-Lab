/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class LinearSearchExample
{
	public static int LinearSearch(int[]arr,int key){
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==key){
	            return i;
	        }
	    }
	    return -1;
	}
	public static void main(String[] args){
	    int []a1={10,20,30,50,70,90};
	    int key = 50;
	    System.out.println(key+"is found at index:"+LinearSearch(a1,key));
	}
}
