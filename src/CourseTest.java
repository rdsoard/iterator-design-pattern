import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CourseTest {

  @Test
  public void courseIteratorConstructorTest() {
    Assignment[] test = new Assignment[1];
    CourseIterator iterator2 = new CourseIterator(test);
  }
  @Test
  public void nextMethodTest() {
    Course course = new Course("course","course");
    course.addAssignment("title1", "description1", "topic1", 1);
    course.addAssignment("title2", "description2", "topic2", 2);
    CourseIterator iterator = course.createIterator();
    Assignment testA = new Assignment("title2", "description2", "topic2", 2);
    assertEquals(testA, iterator.next());
  }
  @Test
  public void hasNextMethodTest() {
    Course course = new Course("course","course");
    course.addAssignment("title1", "description1", "topic1", 1);
    course.addAssignment("title2", "description2", "topic2", 2);
    CourseIterator iterator = course.createIterator();
    assertEquals(true, iterator.hasNext());
  }
  @Test
  public void CourseToStringMethodTest() {
    Course course = new Course("course","course");
    assertEquals("course: course", course.toString());
  }
  @Test
  public void AssignmentToStringMethodTest() {
    Assignment test = new Assignment("title", "description", "topic", 1);
    assertEquals("title: description, covers: topic", test.toString());
  }
  @Test
  public void growArrayMethodTest() {
    Course course = new Course("course","course");
    course.addAssignment("title1", "description1", "topic1", 1);
    course.addAssignment("title1", "description1", "topic1", 1);
    course.addAssignment("title1", "description1", "topic1", 1);
    course.addAssignment("title1", "description1", "topic1", 1);
    course.addAssignment("title1", "description1", "topic1", 1);
    course.addAssignment("title1", "description1", "topic1", 1);
  }
  @Test
  public void getAssignmentWeightsMethodTest() {
    Course course = new Course("course","course");
    course.addAssignment("title1", "description1", "topic1", 1);
    assertEquals(100, course.getAssignmentWeights());
  }
}
