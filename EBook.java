class EBook extends Book {
    double fileSize; 

    EBook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSize + " MB");
    }

    public void downloadTime(double speed) {
        double time = fileSize / speed; 
        System.out.println("Download Time at " + speed + " MB/s: " + time + " seconds");
    }
}

