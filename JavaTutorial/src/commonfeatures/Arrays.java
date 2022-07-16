package commonfeatures;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays obj = new Arrays();
         obj.union();
			
		}
		public void union(){
			int Array1[][]=new int[2][3];
			int Array2[][]=new int[2][3];
			@SuppressWarnings("resource")
			Scanner scan= new Scanner(System.in);
			for(int i=0; i<2;i++) {
				for(int j=0;j<3;j++) {
					System.out.println("Enter the element of Array1["+i+"]["+j+"]");
				    Array1[i][j]=scan.nextInt();
					
				}
			
			}
			for(int i=0; i<2;i++) {
				for(int j=0;j<3;j++) {
					System.out.println("Enter the element of Array2["+i+"]["+j+"]");
				    Array2[i][j]=scan.nextInt();
					
				}
			
			}
			System.out.println("Entered Array1 is");
			for (int i=0;i<2;i++) {
				for (int j=0;j<3;j++) {
					System.out.print(Array1[i][j]+"	");
					if (j==2)
						System.out.println("");
				}
			}
			System.out.println("Enetred Array2 is");
			for (int i=0;i<2;i++) {
				for (int j=0;j<3;j++) {
					System.out.print(Array2[i][j]+"  ");
					if (j==2)
						System.out.println("");
				}
			}
			
			
			
	}

}
