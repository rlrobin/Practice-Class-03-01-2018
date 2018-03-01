
public class Movie {
private String name;
private String ratingMPAA;

private int numRated1, numRated2, numRated3, numRated4, numRated5;
public Movie()
{
	name = "Unknown";
	ratingMPAA = "Unknown";
	numRated1=0;
	numRated2=0;
	numRated3=0;
	numRated4=0;
	numRated5=0;
}
public Movie(String theName, String theRating)
{
	name= theName;
	ratingMPAA = theRating;
	numRated1=0;
	numRated2=0;
	numRated3=0;
	numRated4=0;
	numRated5=0;
	
}
public void setName(String newName)
{
	name = newName;
}
public String getName()
{
	return name;
	
}
public void setRating(String newRating)
{
	ratingMPAA = newRating;
	
}
public String getRating()
{
	return ratingMPAA;
	
}
public void addRating(int num)
{
	if ((num < 1) || (num > 5))
		return;
	switch (num)
	{
	case 1:
		numRated1++;
		break;
	case 2:
		numRated2++;
		break;
	case 3:
		numRated3++;
		break;
	case 4:
		numRated4++;
		break;
	case 5:
		numRated5++;
		break;
		
	}
	
}
public double getAverage()
{
	return (numRated1 + 2*numRated2 + 3*numRated3 + 4*numRated4 + 5*numRated5)/ 5.0;
}
}
