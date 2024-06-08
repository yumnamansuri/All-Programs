package throwKeyword;

public class Score {

		
		int score;

		public int getScore() {
			return score;
		}

		public void setScore(int score1) {
		
		try {
			if(score1%2==0)
			{
				throw new Exception();
				
			}
			
		else 
		{
			this.score = score;
			System.out.println("Score Entered is odd");
		}
		}
		catch(Exception e)
		{
			System.out.println("Score should not an even no");
		}
		
		
		}
		

}


