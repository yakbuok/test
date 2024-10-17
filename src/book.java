import java.util.ArrayList;
import java.util.List;

public abstract class Book implements LibraryResource {
    protected String title;
    protected String author;
    protected double rentalFee;
    protected List<Member> borrowedBy;

    public Book(String title, String author, double rentalFee) {
        this.title = title;
        this.author = author;
        this.rentalFee = rentalFee;
        this.borrowedBy = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public double getRentalFee() {
        return rentalFee;
    }

    @Override
    public void printResourceDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Rental Fee: $" + rentalFee);
    }

    @Override
    public void borrowResource(Member member) {
        borrowedBy.add(member);
        System.out.println(member.getName() + " borrowed " + title);
    }

    @Override
    public void returnResource(Member member) {
        borrowedBy.remove(member);
        System.out.println(member.getName() + " returned " + title);
    }

    @Override
    public void printBorrowedBy() {
        System.out.print("Borrowed by: ");
        for (Member member : borrowedBy) {
            System.out.print(member.getName() + " ");
        }
        System.out.println();
    }
}
