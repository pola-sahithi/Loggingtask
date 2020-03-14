package simpleinterest;

public class SimpleInterest {
	public static float calculateSimpleInterest(float Principle_Amount,float Timeinyears,float RateOfInterestPerAnnum)
	{
		float SimpleInterest=(Principle_Amount*Timeinyears*RateOfInterestPerAnnum)/100;
		return SimpleInterest;
	}
}
