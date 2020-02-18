/**
 * 
 * @author Rebekah Soard
 * This class functions as an iterator for the assignments in a course
 */
public class CourseIterator implements java.util.Iterator<Assignment> {
    private Assignment[] assignments;
    private int position;

    /**
     *  This method is a constructor that sets initial values
     * @param assignments the Assignment array
     */
    public CourseIterator(Assignment[] assignments) {
        this.assignments = assignments;
        this.position = 0;
    }

    /**
     *  This method checks if there is anything next in the array and returns true if there is and false if not
     *  @return either true of false depending on if there is a next value
     */
    public boolean hasNext() {
        if (this.assignments[this.position + 1] == null)
            return false;
        else
            return true;
    }

    /**
     * This method increments the position and returns the assignment at that position
     * @return the next assignment
     */
    public Assignment next() {
        position++;
        return this.assignments[this.position];
    }
}
