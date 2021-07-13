package MoodAnalyzerTest;


public class MoodAnalyzer
{
	 private String message;

	public MoodAnalyzer(String message)
	{
	        this.message = message;
	}

	 // Check Sad mood  or Happy Mood
		public String analyseMood()
		{
			try
			{
				if (message.toLowerCase().contains("sad"))
					return "SAD";

				return "HAPPY";
			} 
			catch (NullPointerException e)
			{
				throw new NullPointerException("Invalid Name");

			}

		}
	}
	
	
