/*
									nested loop, if blocks
							
Created by:		Mani Majd
Date:			August 3rd 2017
Purpose:		Training

*/
public class Calendar {

	public static void main(String[] args) {
//		daysName();
//		borderLine();	
//		endline();
//		borderLine();
////		daysName();
////		calanderBody(4);
		calander(8, 31);
		
	}// end of main
	

	public static void printChar(int size, char ch){
		for (int i=1; i<= size; i++){
				System.out.print(ch);
		}
	}//end of printChar Method
	
	
	public static void borderLine(){
		for(int j=1; j<=8;j++){
			if(j==8){
				printChar(1, '+');
			}else{
				printChar(1, '+');
				printChar(6, '-');
			}
		}
	}//end of borderLine Method

		public static void daysName(){
			String days = "  Sun    Mon    Tus    Wed    Thu    Fri    Sat";
			System.out.println(days);
		}//end of daysName Method

		public static void endline(){
			System.out.println();
		}//end of endline Method

		public static void calanderBody(int firstDay, int dayOfmonth){
		
			int theFirstSunday = firstDay;
			int firstDayinCalander = 1;
			if(theFirstSunday==1){
				theFirstSunday =8;
			}
			int statCalander= 8-theFirstSunday;
			
			for (int i=1; i<=5;i++){// number of week
				for (int j=1; j<=7; j++){//number of column (day per week)
					if (i==1 && j<=statCalander){// white space before the first day in calendar
						System.out.print("|      ");
					}else{
						if(firstDayinCalander<=dayOfmonth){
							if(firstDayinCalander<10){
								System.out.print("|  "+firstDayinCalander+"   ");
							}else{
								System.out.print("|  "+firstDayinCalander+"  ");
							}
							firstDayinCalander++;
						}
					}
					
					
				}
				System.out.println("|");
			}
		}


		public static void calander(int day, int dayOfmonth){
			daysName();
			borderLine();
			endline();
			calanderBody(day, dayOfmonth);
			borderLine();
			
		}
}
