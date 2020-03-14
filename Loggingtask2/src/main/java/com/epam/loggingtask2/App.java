package com.epam.loggingtask2;

import java.util.Scanner;

import costofhouseconstruction.HouseConstructionCost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class App 
{
	private static final Logger logger=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	logger.info("Choose the standard of material for the house construction from the below options:\n");
        logger.info("1)Standard Material-1200INR per squarefeet\n2)Above Standard Material-1500INR per squarefeet\n3)High Standard Material-1800INR per squarefeet\n4)High Standard Material and Fully Automated Home-2500INR per squarefeet\n");
        Scanner sc=new Scanner(System.in);
        int choosedOption=sc.nextInt();
        float Total_Area=0;
        if(choosedOption<=4 && choosedOption>0)
        {
        	logger.info("Enter the Total Area of house in squarefeet:\n");
        Total_Area=sc.nextFloat();
        }
        float Total_Construction_Cost=0;
        boolean flag=false;
        switch(choosedOption)
        {
        case 1:Total_Construction_Cost=HouseConstructionCost.getConstructionCost(Total_Area,1200);
               break;
        case 2:Total_Construction_Cost=HouseConstructionCost.getConstructionCost(Total_Area,1500);
               break;    
        case 3:Total_Construction_Cost=HouseConstructionCost.getConstructionCost(Total_Area,1800);
               break;
        case 4:Total_Construction_Cost=HouseConstructionCost.getConstructionCost(Total_Area,2500);
               break;
        default:logger.info("Enter a valid Option");
                flag=true;
                break;
        }
        if(flag==false)
        {
        	logger.info("The Cost of House Construction is:"+Total_Construction_Cost);
        }
        sc.close();
    }
}
