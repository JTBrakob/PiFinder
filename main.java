package pi;
import java.util.Scanner; 
public class main
{		
	public static void main(String[] args) 
	{
		//get darts and runs
		Scanner scan = new Scanner(System.in);
		System.out.print("Number of darts: ");
		int numDarts = scan.nextInt();
		System.out.print("Number of games: ");
		int numGames = scan.nextInt();
		scan.close();
		
		double piAvg = 0;
		double[] piArray = new double[numGames];
		
		//throw the darts
		for(int ii = 0; ii < numGames; ii++)
		{
			int counter = 0;
			for (int i = 0; i < numDarts ; i++)
			{
				Point p = new Point(-.5, .5);
				if (dist(p) < .5)
				{
					counter++;
				}
			}
			double pi = ( 4.0 * ((double) counter / (double) numDarts));
			piAvg += pi;
			piArray[ii] = pi;
		}
		//Standard deviation
		piAvg = piAvg / (double) numGames;
		System.out.println("Average: " + piAvg);
		System.out.println("Standard Deviation: " + standardDev(piArray, (double) numGames, piAvg));
	}
	
	//Get distance from zero
	private static double dist (Point p)
	{
		return Math.sqrt(p.getY() * p.getY() + p.getX() * p.getX());
	}
	
	//standard dev of array
	public static double standardDev(double piArray[], double numGames, double piAvg)
    {
        double standDev = 0;
        for(double num: piArray)
        {
            standDev += Math.pow(num - piAvg, 2);
        }
        
        return Math.sqrt(standDev/numGames);
    }
}
