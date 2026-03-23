public class LibrarySystem {
    public static void main(String[] args) {
        PrintedBook pb1 = new PrintedBook("Java Programming", "James Smith", 2022, 250);
        PrintedBook pb2 = new PrintedBook("Data Structures", "Robert Brown", 2021, 300);

        EBook eb1 = new EBook("AI Basics", "Sarah Lee", 2023, 40);
        EBook eb2 = new EBook("Cloud Computing", "Michael Green", 2020, 100);

        pb1.displayInfo();
        pb1.readingTime();
        System.out.println();

        pb2.displayInfo();
        pb2.readingTime();
        System.out.println();

       
        eb1.displayInfo();
        eb1.downloadTime(10); 
        System.out.println();

        eb2.displayInfo();
        eb2.downloadTime(20); 
    }
}
