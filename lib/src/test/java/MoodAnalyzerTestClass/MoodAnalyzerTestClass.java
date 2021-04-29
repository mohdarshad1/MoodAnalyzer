package MoodAnalyzerTestClass;

import org.junit.Assert;
import org.junit.Test;

import MoodAnalyzer.MoodAnalysisException;
import MoodAnalyzer.MoodAnalyzer;

public class MoodAnalyzerTestClass {

	/* TC1.1:Given I am in sad mood message should return sad */
    @Test
    public void givenMeassage_WhenSad_ThenReturnMood() throws MoodAnalysisException
    {
        MoodAnalyzer mood=new MoodAnalyzer("I am in sad mood");
        String reaction=mood.moodAnalyzer("");
        Assert.assertEquals("sad", reaction);
    }

    /* TC1.2:Given I am in Any mood message should return happy */
    @Test
    public void givenMeassage_WhenHappy_ThenReturnMood() throws MoodAnalysisException
    {
        MoodAnalyzer mood=new MoodAnalyzer("I am in happy mood");
        String reaction=mood.moodAnalyzer("");
        Assert.assertEquals("happy",reaction);
    }
    
    /*TC3.1:Given NULL should throw MoodAnalysis Exception */
    @Test
    public void givenNull_WhenNull_ThenThrowException() throws MoodAnalysisException
    {
        MoodAnalyzer mood=new MoodAnalyzer(null);
        try
        {
            String reaction = mood.moodAnalyzer("");
            Assert.assertEquals("happy", reaction);
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.MyException_Type.NULL,e.type);
        }
    }

    /*TC3.2:Given Empty should throw MoodAnalysis Exception */
    @Test
    public void givenEmpty_WhenEmpty_ThenThrowException() throws MoodAnalysisException
    {
        MoodAnalyzer mood=new MoodAnalyzer("");
        try
        {
            String reaction = mood.moodAnalyzer("");
            Assert.assertEquals("happy", reaction);
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.MyException_Type.EMPTY,e.type);
        }
    }
}
