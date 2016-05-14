package ComcaveProgramme;

public class myArray2D {

	public static void main(String[] args) {
		// 2-dimensionale Arrays
		
		int[][] myArray = new int[3][4];
		
//		myArray[0][0] = 1;
		
		for(int x=0;x<myArray.length;x++){
			for(int y=0;y<myArray[x].length;y++){
				myArray[x][y]=x+y;
			}
		}
//		System.out.println(myArray[1][1]);
		for(int x=0;x<myArray.length;x++){
			for(int y=0;y<myArray[x].length;y++){
				System.out.println(myArray[x][y]);
			}
			System.out.println();
		}


	}

}
