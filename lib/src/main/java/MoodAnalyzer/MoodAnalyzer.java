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
        if (message.contains("sad"))
        {
            return ("Sad");
        } else if (message.contains("Any"))
        {
            return ("Happy");
        }
        return (mood);
    }

    // Parameterized constructor
    public MoodAnalyzer(String message)
    {
        this.message=message;
    }
}
