import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Stream {
    private List<StudyGroup> groups;
    public Stream(){
        groups = new ArrayList<>();
    }
    public void addGroup(StudyGroup group){
        groups.add(group);
    }
    public Iterator<StudyGroup> iterator(){
        return groups.iterator();
    }
    public int getSize(){
        return groups.size();
    }


    static class StreamComparator implements Comparator<Stream> {
        public int compare(Stream s1, Stream s2){
            return s1.groups.size() - s2.groups.size();
        }
    }
}
