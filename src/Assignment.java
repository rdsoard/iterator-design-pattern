/**
 * 
 * @author Rebekah Soard
 * This class represents an assignment for a course
 */
public class Assignment {
    private String title;
    private String description;
    private String topic;
    private int points;

    /**
     * This method is a constructor that sets initial values
     * @param title the assignment title
     * @param description the assignment description
     * @param topic the assignment topic
     * @param points the assignment points
     */
    public Assignment(String title, String description, String topic, int points) {
        this.title = title;
        this.description = description;
        this.topic = topic;
        this.points = points;
   }

    /**
     * This method returns a string of the assignment title, description, and topic
     * @return the string of the title, description, and topic
     */
    public String toString() {
       return this.title + ": " + this.description + ", covers: " + this.topic;
    }
}
