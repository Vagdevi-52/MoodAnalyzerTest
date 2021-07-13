package MoodAnalyzerTest;

public class MoodAnalyzer
{
	 private String message;
	    public String analyseMood()
	    {
	        if (message.contains("Sad"))
	            return "SAD";
	        else
	            return "HAPPY";
	    }

	    
	    public MoodAnalyzer(String message)
	    {
	        this.message = message;
	    }

	}

	

