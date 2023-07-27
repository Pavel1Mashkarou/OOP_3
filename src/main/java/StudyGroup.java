import java.util.ArrayList;
import java.util.List;

public class StudyGroup implements Iterable{
    public List<Student> studentList = new ArrayList<>();
    public void addStudent(Student student){
        studentList.add(student);
    }
    public List<Student> getStudentList(){
        return studentList;
    }


    public Iterator<Student> iterator(){
        return new StudyGroupIterator();
    }



    private class StudyGroupIterator implements Iterator<Student> {

        private int currentIndex = 0;

        @Override
        public Student next() {
            return studentList.get(currentIndex++);
        }

        @Override
        public boolean hasNext() {
            return currentIndex<studentList.size();
        }

        @Override
        public void remove() {
            studentList.remove(currentIndex-1);
            currentIndex--;
        }
    }
}