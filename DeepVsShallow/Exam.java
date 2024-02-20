package DeepVsShallow;

public class Exam {
    int exam_id;
    ReattemptExam reattemptExam;
    Exam(){
        this.exam_id = 770;
        this.reattemptExam = new ReattemptExam();
    }

    Exam(Exam other)
    {
        this.reattemptExam = other.reattemptExam; //this will shallow copy.
        exam_id = other.exam_id;
    }
    
}
