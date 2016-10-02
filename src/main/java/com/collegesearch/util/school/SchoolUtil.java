package com.collegesearch.util.school;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class SchoolUtil {

	public static String getValue(final LinkedHashMap<String, List<String>> queryParams, String searchKey) {	
	    Set<Map.Entry<String, List<String>>> set = queryParams.entrySet();
		Iterator<Entry<String, List<String>>> it = set.iterator(); 
		String key = null;
		String value = null;
		while(it.hasNext()) {
		   	Entry<String, List<String>> entry = (Entry<String, List<String>>)it.next();
		   	key = (String)entry.getKey();
		   	if(key.equalsIgnoreCase(searchKey)) {
	   		   try{
		   	       value = ((List<String>)entry.getValue()).get(0);
		   	   }
		   	   catch(ClassCastException cce) {
		   		   Object obj = entry.getValue();	
		   	       //if(obj instanceof String)
		   		   value = (String)obj;
		   	   }  
		   	}	
		} 
		if(value != null && value.length() <1)
		   value = null;	
		return value;
	}
	
	public static List<String> getListOfValues(final LinkedHashMap<String, List<String>> queryParams, String searchKey) {
		System.out.println("queryParams = " + queryParams);
		
	    Set<Map.Entry<String, List<String>>> set = queryParams.entrySet();
		Iterator<Entry<String, List<String>>> it = set.iterator(); 
		String key = null;
		List<String> values = null;
		while(it.hasNext()) {
		   	Entry<String, List<String>> entry = (Entry<String, List<String>>)it.next();
		   	key = (String)entry.getKey();
		   	if(key.equalsIgnoreCase(searchKey)) {
	   		   try{  System.out.println("entry.getValue() = " + entry.getValue());
		   	       values = (List<String>)entry.getValue();
		   	   }
		   	   catch(ClassCastException cce) {
		   		   Object obj = entry.getValue();
		   		   System.out.println("error: "+cce.getMessage());
		   	       //if(obj instanceof String)
		   		   //values = (List<String>)obj;
		   	   }  
		   	}	
		} 
		if(values != null && values.size() <1)
		   values = null;	
		return values;
	}

	public static int getMaxResults(final LinkedHashMap<String, List<String>> queryParams){
		int maxResults = 0;
		String data = getValue(queryParams, "maxResults");
		if(data != null && !data.isEmpty()){
			try {
			    maxResults = Integer.parseInt(data);
			}
			catch(NumberFormatException e){
				//e.printStackTrace();
			}
		}
		return maxResults;
	}
	
	public static boolean applicantDataExist(final LinkedHashMap<String, List<String>> queryParams){
		return getValue(queryParams, "randomApplicant.toeflScore") !=null? true : 
			   getValue(queryParams, "randomApplicant.ieltsScore") !=null? true :
			   getValue(queryParams, "randomApplicant.sat1ReadingScore") != null? true : 
			   getValue(queryParams, "randomApplicant.actReadingScore") !=null? true :	
			   getValue(queryParams, "randomApplicant.sat1MathScore") != null? true : 
			   getValue(queryParams, "randomApplicant.actMathScore") !=null? true :	
			   getValue(queryParams, "randomApplicant.sat1Score") != null? true : 
			   getValue(queryParams, "randomApplicant.actScore") !=null? true :	
			   getValue(queryParams, "randomApplicant.gpa") !=null? true :
		       getValue(queryParams, "randomApplicant.totalCost") !=null? true : false;
		
	}

	public static Integer adjustSchoolStandardforSatOrActScores(int percentile25, int percentile75, Float acceptRate) {
		if(acceptRate == null)
		   acceptRate = 50f;	
		if(percentile25 <= 0 || percentile75 <= 0) {
		   return 0;
		}	
		return adjustSchoolStandardScores(percentile25, percentile75, acceptRate);
	}
	
	public static Integer adjustSchoolStandardByConvertActToSatScores(int actPercentile25, int actPercentile75, float acceptRate) {
		
		if(actPercentile25 <= 0 || actPercentile75 <= 0) {
		   return 0;
		}	
		int percentile25 = SchoolUtil.convertActToSat(actPercentile25);
		int percentile75 = SchoolUtil.convertActToSat(actPercentile75);
		
		return adjustSchoolStandardScores(percentile25, percentile75, acceptRate);
	}
	
	private static Integer adjustSchoolStandardScores(int percentile25, int percentile75, Float acceptRate) {
		if(acceptRate == null)
		   acceptRate = 50f;	
		if(percentile25 <= 0 || percentile75 <= 0) {
		   return 0;
		}	
		float cap = 1500.0f;
		float percentile50 = (percentile25 + percentile75)/2.0f;
		float ajustedThreashold = 0.0f;
		if(acceptRate <= 10) 
			ajustedThreashold = ((percentile75) * 1.25f < cap? percentile75 * 1.25f : cap); //for top 10 return 120% of Percentile75;
		else if(acceptRate > 10 && acceptRate <= 20) 
			ajustedThreashold = ((percentile75) * 1.2f < cap? percentile75 * 1.2f : cap);//for top 10-25 return 115% of Percentile75
		else if(acceptRate > 20 && acceptRate <= 30) 
			ajustedThreashold = ((percentile75) * 1.15f < cap? percentile75 * 1.15f : cap); //for top 20-30 return 110% of Percentile75
		else if(acceptRate > 30 && acceptRate <= 40)
			ajustedThreashold = ((percentile75) * 1.1f < cap? percentile75 * 1.1f : cap); //for top 30-40 return 105% of Percentile75
		else if(acceptRate > 40 && acceptRate <= 50) 
			ajustedThreashold = percentile75 * 1.0f;  //for top 40-50 return 100% of Percentile75
		/*else if(acceptRate > 50 && acceptRate <= 60) 
			ajustedThreashold = ((percentile75 * 0.9f) > percentile50? (percentile75 * 0.9f) : percentile50);  
		else if(acceptRate > 60 && acceptRate <= 70) //for top 40-60 return (Percentile25 + Percentile75)/2
			ajustedThreashold = ((percentile75 * 0.8f) > percentile50? (percentile75 * 0.8f) : percentile50);    //for top 60-70 return 80% of Percentile75
			//adjustedActStandard = (percentile25 + percentile75)/2; //for top 50-60 return 90% of Percentile75
		else if(acceptRate > 70 && acceptRate <= 80)                     //for top > 60 Percentile25
			ajustedThreashold = ((percentile50 * 0.9f) > percentile25? (percentile50 * 0.9f) : percentile25);  
		else if(acceptRate > 80 && acceptRate <= 90)                     //for top > 60 Percentile25
			ajustedThreashold = ((percentile50 * 0.8f) > percentile25? (percentile50 * 0.8f) : percentile25);  
		else if(acceptRate > 90)*/
		else
			ajustedThreashold = percentile25;
		return Math.round(ajustedThreashold);
	}
	public static boolean isTestScoreSatisfied(int testScore, int percentile25, int percentile75, Float acceptRate){
		int standardValue = 0;
		standardValue = adjustSchoolStandardforSatOrActScores(percentile25, percentile75, acceptRate);
		if(standardValue  == 0 )
		   return false;	
		else
		   return (testScore >= standardValue);
	}
	
	public static int convertActToSat(int act){
		int sat = 0;
		switch(act){
		   case 36:
			   sat = 1600;
			   break;
		   case 35:
			   sat = 1560;
			   break;
		   case 34:
			   sat = 1510;
			   break;
		   case 33:
			   sat = 1460;
			   break;
		   case 32:
			   sat = 1420;
			   break;
		   case 31:
			   sat = 1380;
			   break;
		   case 30:
			   sat = 1380;
			   break;	   
		   case 29:
			   sat = 1300;
			   break;
		   case 28:
			   sat = 1260;
			   break;
		   case 27:
			   sat = 1220;
			   break;
		   case 26:
			   sat = 1190;
			   break;
		   case 25:
			   sat = 1150;
			   break;
		   case 24:
			   sat = 1110;
			   break;	
		   case 23:
			   sat = 1070;
			   break;
		   case 22:
			   sat = 1030;
			   break;
		   case 21:
			   sat = 990;
			   break;	   
		   case 20:
			   sat = 950;
			   break;
		   case 19:
			   sat = 910;
			   break;
		   case 18:
			   sat = 870;
			   break;
		   case 17:
			   sat = 830;
			   break;
		   case 16:
			   sat = 790;
			   break;
		   case 15:
			   sat = 740;
			   break;
		   case 14:
			   sat = 690;
			   break;
		   case 13:
			   sat = 640;
			   break;
		   case 12:
			   sat = 590;
			   break;
		   case 11:
			   sat = 530;
			   break;
		   default:
			   sat = 0;
			   break;
		}
		return sat;
	}
	
	public static int convertSatToAct(int num){
		int result = 0;		
		if(num == 1600) result = 36;	
		else if(num >= 1540 && num <= 1590) result = 35;	
		else if(num >= 1490 && num <= 1530) result = 34;		
		else if(num >= 1440 && num <= 1480) result = 33;
		else if(num >= 1400 && num <= 1430) result = 32;	
		else if(num >= 1360 && num <= 1390) result = 31;	
		else if(num >= 1330 && num <= 1350) result = 30;	
		else if(num >= 1290 && num <= 1320) result = 29;	
		else if(num >= 1250 && num <= 1280) result = 28;	
		else if(num >= 1210 && num <= 1240) result = 27;	
		else if(num >= 1170 && num <= 1200) result = 26;	
		else if(num >= 1130 && num <= 1160) result = 25;	
		else if(num >= 1090 && num <= 1120) result = 24;	
		else if(num >= 1050 && num <= 1080) result = 23;	
		else if(num >= 1020 && num <= 1040) result = 22;	
		else if(num >= 980 && num <= 1010) result = 21;	
		else if(num >= 940 && num <= 970) result = 20;
		else if(num >= 900 && num <= 930) result = 19;
		else if(num >= 860 && num <= 890) result = 18;
		else if(num >= 820 && num <= 850) result = 17;	
		else if(num >= 770 && num <= 810) result = 16;	
		else if(num >= 720 && num <= 760) result = 15;	
		else if(num >= 670 && num <= 710) result = 14;	
		else if(num >= 620 && num <= 660) result = 13;	
		else if(num >= 560 && num <= 610) result = 12;	
		else if(num >= 510 && num <= 550) result = 11;
	    return result;
	}
	
	public static int convertIeltsToToefl(String ielts){
		int toefl = 0;
		switch(ielts){
		   case "0":
			   toefl = 0;
			   break;
		   case "1": 
			   toefl = 8;
			   break;
		   case "2": 
			   toefl = 16;
			   break;   
		   case "3": 
			   toefl = 24;
			   break;	 
		   case "4": 
			   toefl = 31;
			   break;
		   case "4.5": 
			   toefl = 34;
			   break;
		   case "5": 
			   toefl = 45;
			   break;
		   case "5.5": 
			   toefl = 59;
			   break;
		   case "6": 
			   toefl = 78;
			   break;
		   case "6.5": 
			   toefl = 93;
			   break;
		   case "7": 
			   toefl = 101;
			   break;
		   case "7.5": 
			   toefl = 109;
			   break;
		   case "8": 
			   toefl = 114;
			   break;
		   case "8.5": 
			   toefl = 117;
			   break;
		   case "9": 
			   toefl = 120;
			   break;
		}
		return toefl;
	}
	/*		   0–31	0–4
			   32–34	4.5
			   35–45	5
			   46–59*	5.5
			   60–78*	6
			   79–93*	6.5
			   94–101*	7
			   102–109*	7.5
			   110–114	8
			   115–117	8.5
			   118–120	9	*/	
	
	public static float convertToeflToIelts(int num){
		float result = 0;
		if(num == 0) result = 0;	
		else if(num >= 1 && num <= 9) result = 1.0f;
		else if(num >= 10 && num <= 19) result = 2.0f;
		else if(num >= 20 && num <= 25) result = 3.0f;
		else if(num >= 26 && num <= 31) result = 4.0f;	
		else if(num >= 32 && num <= 34) result = 4.5f;		
		else if(num >= 35 && num <= 45) result = 5.0f;
		else if(num >= 46 && num <= 59) result = 5.5f;	
		else if(num >= 60 && num <= 78) result = 6.0f;	
		else if(num >= 79 && num <= 93) result = 6.5f;	
		else if(num >= 94 && num <= 101) result = 7.0f;	
		else if(num >= 102 && num <= 109) result = 7.5f;	
		else if(num >= 110 && num <= 114) result = 8.0f;	
		else if(num >= 115 && num <= 117) result = 8.5f;	
		else if(num >= 118 && num <= 120) result = 9.0f;	
		
	    return result;
	}
	
}
