package tcs.com;

public class Arrey2D {
public static void main(String[] args) {
	//2d arrey
	
	int a[][]=new int [2][2];
	
	a[0][0]=10;
	a[0][1]=20;
	
	a[1][0]=30;
	a[1][1]=40;
	
	System.out.println(a[0][0]);
	System.out.println(a[1][0]);
	
	System.out.println("=====for loop=======");
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			
	System.out.println(a[i][j]);		
			
			
	System.out.println("====for each====" );
			for (int[] js : a) {
				for (int k : js) {
					System.out.println(k);
				}
			}
			
			
			
			
		}
	}
	
}
}
