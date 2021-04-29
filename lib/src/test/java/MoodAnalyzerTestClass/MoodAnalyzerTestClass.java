package MoodAnalyzerTestClass;

import org.junit.Assert;
import org.junit.Test;

import MoodAnalyzer.MoodAnalyzer;

public class MoodAnalyzerTestClass {

	/* TC1.1:Given I am in sad mood message should return sad */
    @Test
    public void givenMeassage_WhenSad_ThenReturnMood()
    {
        MoodAnalyzer mood=new MoodAnalyzer("I am in sad mood");
        String reaction=mood.moodAnalyzer("");
        Assert.assertEquals("sad", reaction);
    }
    /* TC1.2:Given I am in Any mood message should return happy */
    @Test
    public void givenMeassage_WhenHappy_ThenReturnMood()
    {
        MoodAnalyzer mood=new MoodAnalyzer("I am in happy mood");
        String reaction=mood.moodAnalyzer("");
        Assert.assertEquals("happy",reaction);
    }
    /*TC2.1:Given NULL should return happy */
    @Test
    public void givenNull_WhenNull_ThenReturnHappy()
    {
        MoodAnalyzer mood=new MoodAnalyzer(null);
        String reaction=mood.moodAnalyzer("");
        Assert.assertEquals("happy",reaction);
    }
}
