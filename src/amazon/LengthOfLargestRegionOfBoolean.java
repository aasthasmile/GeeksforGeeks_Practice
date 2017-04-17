package amazon;

import java.util.Scanner;

/**
 * Consider a matrix with rows and columns (n,m), where each cell contains
 * either a ‘0’ or a ‘1’ and any cell containing a 1 is called a filled cell.
 * Two cells are said to be connected if they are adjacent to each other
 * horizontally, vertically, or diagonally .If one or more filled cells
 * are connected, they form a region. Your task is to  find the length of the
 * largest region. Examples: Input : M[][5] = { 0 0 1 1 0 1 0 1 1 0 0 1 0 0 0 0
 * 0 0 0 1 } Output : 6 Ex: in the following example, there are 2 regions one
 * with length 1 and the other as 6. so largest region : 6
 * 
 * @author Aastha Jain
 *
 */
public class LengthOfLargestRegionOfBoolean {

	
	private static void DFSTraversal(int[][] adjmatrix, boolean[] visited, int i) {
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());
		for (int ii = 0; ii < T; ii++) {
			String rowCol = sc.nextLine();
			String matrix = sc.nextLine();

			String[] rowCols = rowCol.split(" ");
			String[] matrixs = matrix.split(" ");
			
			int row=Integer.parseInt(rowCols[0]);
			int col=Integer.parseInt(rowCols[1]);
			
			int adjmatrix[][]=new int[row][col];
			int k=0;
			
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					adjmatrix[i][j]=Integer.parseInt(matrixs[k++]);
					//System.out.print(adjmatrix[i][j]);	
				}
			//System.out.println();
			}
			
			boolean[] visited=new boolean[row];
			
	        DFSTraversal(adjmatrix,visited,0);
			
		}

	}

	
}
