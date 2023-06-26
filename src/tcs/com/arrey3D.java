package tcs.com;

public class arrey3D {
// arrey 3d
	public static void main(String[] args) {
		int a[][][]=new int [3][3][3];
		a[0][0][0]=10;
		a[0][1][0]=20;
		a[0][2][0]=30;
				
				
		a[0][0][1]=40;
		a[0][1][1]=50;
		a[0][0][2]=60;
		
		
		a[1][0][0]=70;
		a[1][1][0]=80;
		a[1][2][0]=90;
		
		System.out.println(a[0][0][0]);
		System.out.println(a[0][0][1]);		
		System.out.println(a[1][2][0]);
		
		
		
		System.out.println("=====for loop====");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int j2 = 2; j2 < a.length; j2++) {
					System.out.println(a[i][j][j2]);
				}
				
				
				System.out.println("=======foreach========");
				
				for (int[][] is : a) {
					for (int[] x : is) {
						
					
					System.out.println(x);
				}
					
				
				}
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
