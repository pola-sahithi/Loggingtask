package com.epam.loggingtask;

import java.util.Scanner;

import compoundinterest.CompoundInterest;
import simpleinterest.SimpleInterest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger logger=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        logger.info("Press 1)SimpleInterest 2)CompoundInterest\n");
        int chooseoption=sc.nextInt();
        logger.info("Enter the PrincipleAmount");
        float PrincipleAmount=sc.nextFloat();
        logger.info("Enter the RateOfInterestPerAnnum");
        float RateOfInterestPerAnnum=sc.nextFloat();
        logger.info("Enter the TimePeriod in years");
        float TimePeriodInYears=sc.nextFloat();
        switch(chooseoption)
        {
        case 1:float simpleinterest=SimpleInterest.calculateSimpleInterest(PrincipleAmount,TimePeriodInYears,RateOfInterestPerAnnum);
               logger.info("The simpleinterest is:"+simpleinterest);
             
               break;
        case 2:float compoundinterest=CompoundInterest.calculateCompoundInterest(PrincipleAmount,TimePeriodInYears,RateOfInterestPerAnnum);
               logger.info("The compoundinterest is:"+compoundinterest);
               
               break;
        default:logger.info("Enter a valid option\n");
         	   break;
        }
        sc.close();
    }
}
