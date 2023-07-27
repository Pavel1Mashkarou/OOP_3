import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Stream stream1 = new Stream();
        StudyGroup studyGroup1 = new StudyGroup();
        StudyGroup studyGroup2 = new StudyGroup();
        StudyGroup studyGroup3 = new StudyGroup();
        stream1.addGroup(studyGroup1); stream1.addGroup(studyGroup2); stream1.addGroup(studyGroup3);

        Stream stream2 = new Stream();
        StudyGroup studyGroup4 = new StudyGroup();
        StudyGroup studyGroup5 = new StudyGroup();

        stream2.addGroup(studyGroup5); stream2.addGroup(studyGroup4);

        Stream stream3 = new Stream();
        StudyGroup studyGroup6 = new StudyGroup();
        StudyGroup studyGroup7 = new StudyGroup();
        StudyGroup studyGroup8 = new StudyGroup();
        StudyGroup studyGroup9 = new StudyGroup();

        stream3.addGroup(studyGroup6); stream3.addGroup(studyGroup7);stream3.addGroup(studyGroup8);stream3.addGroup(studyGroup9);

        Controller controller = new Controller();

        List<Stream> streamList = new ArrayList<>();
        streamList.add(stream1); streamList.add(stream2);streamList.add(stream3);
        for (Stream stream:streamList){
            System.out.printf("%s : размер %s\n",stream, stream.getSize());
        }
        System.out.println();
        controller.sortStreams(streamList);
        for (Stream stream:streamList){
            System.out.printf("%s : размер %s\n",stream, stream.getSize());
        }













    }
}



