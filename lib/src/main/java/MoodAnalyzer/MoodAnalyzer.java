package MoodAnalyzer;

public class MoodAnalyzer {

	private String message;

    //main method
    public static void main(String[] args)
    {
        System.out.println("Welcome to Mood Analyzer");
    }

    // Method that return the mood
    public String moodAnalyzer(String mood) throws MoodAnalysisException
    {
        try
        {
            if(message.length()==0)
            {
                throw new MoodAnalysisException(MoodAnalysisException.MyException_Type.EMPTY,"You entered empty mood,please enter valid mood");
            }
            if (message.contains("sad"))
            {
                return ("sad");
            }
            else if (message.contains("happy"))
            {
                return ("happy");
            }
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.MyException_Type.NULL,"You entered null mood,please enter valid mood");
        }
        return (mood);
    }

    // Parameterized constructor
    public MoodAnalyzer(String message)
    {
        this.message=message;
    }
}
