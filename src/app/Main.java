package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");
        Image image4 = new ProxyImage("HiRes_10MB_Photo4");
        
        ArrayList<Image> images = new ArrayList<>();
        images.add(image1);
        images.add(image2);
        images.add(image3);
        images.add(image4);
        
        System.out.println("Files in images-folder:");
        for(Image img : images) {
        	 img.showData();;
        }
        
        Scanner scanner = new Scanner(System.in);  
		boolean browsing = true;
		int currentImage = 0;
		while(browsing) {
			 System.out.print("Currently selected file: ");
			 images.get(currentImage).showData();
			 System.out.println("Show current file by typing show");
			 System.out.println("Select next file by typing next");
			 System.out.println("Select previous file by typing previous");
			 System.out.println("Stop by typing stop");
			 String input = scanner.nextLine();
			 if(input.equals("show")) {
				 images.get(currentImage).displayImage();
			 }
			 else if(input.equals("next")) {
				 if(currentImage == images.size() - 1) {
					 currentImage = 0;
				 }
				 else {
					 currentImage++;
				 }
			 }
			 else if(input.equals("previous")) {
				 if(currentImage == 0) {
					 currentImage = images.size() - 1;
				 }
				 else {
					 currentImage--;
				 }
			 }
			 else if(input.equals("stop")) {
				 browsing = false;
			 }
		}
        
	}

}
