package MoodAnalyzer;

public class MoodAnalyzer {

	private String message;

    //main method
    public static void main(String[] args)
    {
        System.out.println("Welcome to Mood Analyzer");
    }

    // Method that return the mood
    public String moodAnalyzer(String mood)
    {
        try
        {
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
            return ("happy");
        }
        return (mood);
    }

    // Parameterized constructor
    public MoodAnalyzer(String message)
    {
        this.message=message;
    }
}
