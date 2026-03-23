class PrintedBook extends Book {
    int pages;

    PrintedBook(String title, String author, int year, int pages) {
        super(title, author, year);
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pages: " + pages);
    }

    public void readingTime() {
        int time = pages * 2; 
        System.out.println("Reading Time: " + time + " minutes");
    }
}

