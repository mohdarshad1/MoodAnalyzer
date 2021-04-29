package MoodAnalyzerTestClass;

import org.junit.Assert;
import org.junit.Test;

import MoodAnalyzer.MoodAnalyzer;

public class MoodAnalyzerTestClass {

	/* TC1.1:Given I am in sad mood message should return sad */
    @Test
    public void givenMeassage_WhenValid_ThenReturnMood()
    {
        MoodAnalyzer mood=new MoodAnalyzer("I am in sad mood");
        String reaction=mood.moodAnalyzer("");
        Assert.assertEquals("sad", reaction);
    }
    /* TC1.2:Given I am in Any mood message should return happy */
    @Test
    public void givenMeassage_WhenInvalid_ThenReturnMood()
    {
        MoodAnalyzer mood=new MoodAnalyzer("I am in Any mood");
        String reaction=mood.moodAnalyzer("");
        Assert.assertEquals("happy",reaction);
    }
}
