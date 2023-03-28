package app;

class ProxyImage implements Image {
    private final String filename;
    private RealImage image;
    
    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        }
        image.displayImage();
    }

	@Override
	public void showData() {
		if(image != null) {
			image.showData();
		}
		else {
			System.out.println("Proxy of file: " + filename);
		}
	}
}