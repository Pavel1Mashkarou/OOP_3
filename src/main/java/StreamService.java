import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamService {
    public void sortStreams(List<Stream> streams){
        Collections.sort(streams, new Stream.StreamComparator());
    }
}
