package MoodAnalyzerTest;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest
{

	// Test-Case for the  given message should be sad.
	@Test
	public void givenMessage_whenSad_ShouldReturnSad() 
	{
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Sad");
			String actual = moodAnalyzer.analyseMood();
			String expected = "SAD";
			Assert.assertEquals(expected, actual);

	}

	// Test-Case for the given message should be HappyMood
	@Test
	public void givenMessage_whenHappy_ShouldReturnHappy() 
	{
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Happy");
			String actual = moodAnalyzer.analyseMood();
			String expected = "HAPPY";
			Assert.assertEquals(expected, actual);

	}
	// Test case for Null
    @Test
			public void givenMessage_whenNull_ShouldReturnNull()
            {
				String excepted = "Invalid message";
				try
				{
					MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Null");
					moodAnalyzer.analyseMood();
				}
				catch (NullPointerException e) 
				{
					Assert.assertEquals(excepted, e.getMessage());
				}

			}

		}

