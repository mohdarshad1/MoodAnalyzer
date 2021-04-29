package MoodAnalyzer;

public class MoodAnalysisException extends Exception {

	enum MyException_Type
    {
        EMPTY,NULL;
    }
    MyException_Type type;
    MyException_Type exceptionMessage;
    MoodAnalysisException(MyException_Type type,String message)
    {
        super(message);
        this.type=type;
        System.out.println(message);
    }
}
