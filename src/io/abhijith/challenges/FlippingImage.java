package io.abhijith.challenges;

/**
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0,1,1] results in [1,0,0]
 * 
 * @author abhijith-ks
 */

public class FlippingImage {
	
	int[][] image = new int[][] {{1,1,0},
								{1,0,1},
								{0,0,0}};
	
	public void findSolution() {
		
		for(int i = 0; i < image.length; i++) {
			int k = image[i].length - 1;
			for(int j = 0; j < image[i].length / 2; j++) {
				int x = image[i][j];
				image[i][j] = image[i][k];
				image[i][k] = x;
				k--;
			}
			for(int j = 0; j < image[i].length; j++) {
				image[i][j] = (image[i][j] == 0) ? 1 : 0;
			}
		}
		
		for(int i = 0; i < image.length; i++) {
			System.out.println();
			for(int j = 0; j < image[i].length; j++) {
				System.out.print(image[i][j] + " ");
			}
		}
	}

}
