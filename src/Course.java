/**
 * 
 * @author Rebekah Soard
 * This class represents a course with a name and title and holds an array of assignments
 */
public class Course {
    private static final int MAX = 5;
    private Assignment[] assignments;
    private int count;
    private String name;
    private String title;

    /**
     * This method is a constructor that sets the initial values and creates the assignment array 
     * @param name the name of the course
     * @param title the title of the course
     */
    public Course(String name, String title) {
        this.assignments = new Assignment[MAX];
        this.count = 0;
        this.name = name;
        this.title = title;
    }

    /**
     * This method adds assignments to the array, calling on growArray if it is too small, and increases count
     * @param title the assignment's title
     * @param description the assignment's description
     * @param topic the assignment's topic
     * @param points the assignment's points
     */
    public void addAssignment(String title, String description, String topic, int points) {
        if (this.count == MAX) {
            Assignment[] first = new Assignment[2 * this.assignments.length];
            this.assignments = growArray(first);
        }
        this.assignments[count] = new Assignment(title, description, topic, points);
        count++;
    }   

    /**
     * This method creates a CourseIterator for the course and returns it
     * @return the CourseIterator
     */
    public CourseIterator createIterator() {
        return new CourseIterator(assignments);
    }

    /**
     * This method calculates the assignment weights
     * @return the assignment weights
     */
    public double getAssignmentWeights() {
        return 100 / count;
    }

    /**
     * This method returns the string of the name and title of the course
     * @return the string of the name and title
     */
    public String toString() {
        return this.name + ": " + this.title;
    }

    /**
     * This method puts the information of this.assignment into a new, larger array
     * @param first the new Assignment array
     * @return the new assignment array with the info of this.assignment
     */
    private Assignment[] growArray(Assignment[] first) {
        for (int i = 0; i < this.assignments.length; i++)
            first[i] = this.assignments[i];
        return first;

    }
}
