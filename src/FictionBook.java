import java.lang.reflect.Member;

public class FictionBook implements LibraryResource {
    @Override
    public String getTitle() {
        return getTitle();
    }

    @Override
    public String getAuthor() {
        return getAuthor();
    }

    @Override
    public double getRentalFee() {
        return getRentalFee();
    }

    @Override
    public void printResourceDetails() {

    }

    @Override
    public void printBorrowedBy() {

    }

    @Override
    public void borrowResource(Member member) {

    }

    @Override
    public void returnResource(Member member) {

    }
}
