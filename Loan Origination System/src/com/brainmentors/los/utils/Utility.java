package com.brainmentors.los.utils;

import java.util.Scanner;

public class Utility implements StageContants {

	public static int serialCounter=1;
	 private Utility() {}
	public static Scanner scanner =new Scanner(System.in);
	public static String getStageName(int stageId)
	{
		switch(stageId)
		{
		case SOURCING:
			return "Sourcing Stage";
		
		case QDE :
			return "Quick data entry stage";
			
		case DEDUPE:
			return "Dedupe stage";
		case SCORING:
			return "scoring stage";
		case APPROVAL:
			return "Approval stage";
		case REJECT:
			return "Reject stage";
			default:
				return "Invalid Stage";
		}
	}
	
}
