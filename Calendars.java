import java.awt.Font; 
import java.awt.Graphics;
import java.util.Scanner;

public class Calendars {
	// This codes is written by Mozhgan Mirarabshahi,
	//who is one your student at CS 210 on October 22nd
			public static void main(String[] args) {
			
				printMonth(31, 7);
				
				
			}
			
			public static void printMonth(int days, int firstSunday){
							
				if(days>31){
					days=31;
					System.out.println("the day of the month cannot greater than 31, so we consider the days = 31");	
				}
				if (firstSunday ==1){
					firstSunday = 8; 
				 }
				 if(firstSunday<4){
					 firstSunday = 4;
					 System.out.println("We assume Our calender should be in 5 weeks, so we consider first sunday = 4th");
				 }
				
				DrawingPanel p = new DrawingPanel(500,300);
				Graphics g = p.getGraphics();
				g.setFont(new Font("Monospaced", Font.BOLD, 14));

				String s1 = " ";
				String s2 = "+------+------+------+------+------+------+------+";
				String s3 = "|";
				String s4 = "|";
				String s5 = "|";
				String s6 = "|";
				String s7 = "|";
				String s8 = "+------+------+------+------+------+------+------+";
				
				for(int i =1; i<=8; i++){
					for (int j=1; j<=1; j++){
						if(i==1){
							System.out.print("");
						} else if(i==2 || i==8){
							System.out.print("+");
						} else{
							System.out.print("|");
						}
						
					}//end of j
					for(int k=1; k<=1; k++){ // this loop make the Sunday column

						switch(i){
						case 1:
							System.out.print("  Sun  ");
							s1=s1+"  Sun  ";
							break;
							
						case 2:
						case 8:
							System.out.print("------+"); break;
						case 3:
							if (8-firstSunday>=1){
								System.out.print("      |");
								s3 = s3 + "      |";
							} else{
								System.out.print("   1  |");
								s3 = s3 + "   1  |";
							}break;
						case 4:
							System.out.print("   "+firstSunday+"  |");
							s4 = s4 + "   "+firstSunday+"  |";
							break;
						case 5:
							System.out.print("  "+(firstSunday+7)+"  |");
							s5 = s5 + "  "+(firstSunday+7)+"  |";
							break;
						case 6:
							System.out.print("  "+(firstSunday+14)+"  |");
							s6 = s6 + "  "+(firstSunday+14)+"  |";
							break;
						case 7:
							System.out.print("  "+(firstSunday+21)+"  |");
							s7 = s7 + "  "+(firstSunday+21)+"  |";
							break;
							
						}
					}// end of k
					
					for(int l=1; l<=1; l++){ // this loop make the Monday column

						
						switch(i){
						case 1:
							System.out.print("  Mon  ");
							s1+= "  Mon  ";
							break;
						case 2:
						case 8:
							System.out.print("------+");break;
						case 3:
							if (8-firstSunday>=2){
								System.out.print("      |");
								s3+= "      |";
							} else{
								System.out.print("   "+(firstSunday-6)+"  |");
								s3+="   "+(firstSunday-6)+"  |";
							}break;
						case 4:
							System.out.print("   "+(firstSunday+1)+"  |");
							s4+= "   "+(firstSunday+1)+"  |";
							break;
						case 5:
							System.out.print("  "+(firstSunday+8)+"  |");
							s5+= "  "+(firstSunday+8)+"  |";
							break;
						case 6:
							System.out.print("  "+(firstSunday+15)+"  |");
							s6+= "  "+(firstSunday+15)+"  |";
							break;
						case 7:
							if (firstSunday+23 > days){
								System.out.print("      |");
								s7+="      |";	
							}else{
							System.out.print("  "+(firstSunday+22)+"  |");
							s7+= "  "+(firstSunday+22)+"  |";
							}
							break;
							
						}
					}// end of l
					
					for(int m=1; m<=1; m++){ // this loop make the Tuesday column

						switch(i){
						case 1:
							System.out.print("  Tus  ");
							s1+= "  Tus  ";
							break;
						case 2:
						case 8:
							System.out.print("------+");break;
						case 3:
							if (8-firstSunday>=3){
								System.out.print("      |");
								s3+="      |";
							} else{
								System.out.print("   "+(firstSunday-5)+"  |");
								s3+= "   "+(firstSunday-5)+"  |";
							}break;
						case 4:
							if(firstSunday==8){
								System.out.print("   "+(firstSunday+2)+" |");
								s4+= "   "+(firstSunday+2)+" |";
								break;
							} else{
								System.out.print("   "+(firstSunday+2)+"  |");
								s4+= "   "+(firstSunday+2)+"  |";
								break;
							}
						case 5:
							System.out.print("  "+(firstSunday+9)+"  |");
							s5+= "  "+(firstSunday+9)+"  |";
							break;
						case 6:
							System.out.print("  "+(firstSunday+16)+"  |");
							s6+= "  "+(firstSunday+16)+"  |";
							break;
						case 7:
							if (firstSunday+23 > days){
								System.out.print("      |");
								s7+="      |";	
							}else{
							System.out.print("  "+(firstSunday+23)+"  |");
							s7+= "  "+(firstSunday+23)+"  |";
							}
							break;
							
							}
						
					}// end of m
					
					for(int n=1; n<=1; n++){ // this loop make the Wednesday column
						
						switch(i){
						case 1:
							System.out.print("  Wed  ");
							s1+= "  Wed  ";
							break;
						case 2:
						case 8:
							System.out.print("------+");break;
						case 3:
							if (8-firstSunday>=4){
								System.out.print("      |");
								s3+= "      |";
							} else{
								System.out.print("   "+(firstSunday-4)+"  |");
								s3+= "   "+(firstSunday-4)+"  |";
							}break;
						case 4:
							if(firstSunday<=6){
								System.out.print("  "+(firstSunday+3)+"   |");
								s4+= "  "+(firstSunday+3)+"   |";
								break;
							}else{
								System.out.print("  "+(firstSunday+3)+"  |");
								s4+= "  "+(firstSunday+3)+"  |";
								break;	
							}
							
						case 5:
							System.out.print("  "+(firstSunday+10)+"  |");
							s5+= "  "+(firstSunday+10)+"  |";
							break;
						case 6:
							System.out.print("  "+(firstSunday+17)+"  |");
							s6+= "  "+(firstSunday+17)+"  |";
							break;
						case 7:
							if (firstSunday+24 > days){
								System.out.print("      |");
								s7+="      |";	
							}else{
							if (firstSunday+24 > 31){
								System.out.print("      |");
								s7+= "      |";	
							}else{
							System.out.print("  "+(firstSunday+24)+"  |");
							s7+= "  "+(firstSunday+24)+"  |";
							}
							}
							break;
							
						}
					}// end of n
					
					for(int o=1; o<=1; o++){ // this loop make the Thursday column
						
						switch(i){
						case 1:
							System.out.print("  Thu  ");
							s1+= "  Thu  ";
							break;
						case 2:
						case 8:
							System.out.print("------+");break;
						case 3:
							if (8-firstSunday>=5){
								System.out.print("      |");
								s3+= "      |";
							} else{
								System.out.print("   "+(firstSunday-3)+"  |");
								s3+= "   "+(firstSunday-3)+"  |";
							}break;
						case 4:
							if(firstSunday==4 || firstSunday==5){
								System.out.print("  "+(firstSunday+4)+"   |");
								s4+= "  "+(firstSunday+4)+"   |";
								break;
							} else{
								System.out.print("  "+(firstSunday+4)+"  |");
								s4+= "  "+(firstSunday+4)+"  |";
								break;
							}
						case 5:
							System.out.print("  "+(firstSunday+7)+"  |");
							s5+= "  "+(firstSunday+7)+"  |";
							break;
						case 6:
							System.out.print("  "+(firstSunday+18)+"  |");
							s6+= "  "+(firstSunday+18)+"  |";
							break;
						case 7:
							if (firstSunday+25 > days){
							System.out.print("      |");
							s7+="      |";	
						}else{
							if (firstSunday+24 > 30){
								System.out.print("      |");
								s7+= "      |";	
							}else{
							System.out.print("  "+(firstSunday+24)+"  |");
							s7+= "  "+(firstSunday+24)+"  |";
							}
							}
							break;
							
						}
						
					}// end of o
					
					for(int q=1; q<=1; q++){// this loop make the Friday column
						switch(i){
						case 1:
							System.out.print("  Fri  ");
							s1+= "  Fri  ";
							break;
						case 2:
						case 8:
							System.out.print("------+");break;
						case 3:
							if (8-firstSunday>=6){
								System.out.print("      |");
								s3+= "      |";
							} else{
								System.out.print("   "+(firstSunday-2)+"  |");
								s3+= "   "+(firstSunday-2)+"  |";
							}break;
						case 4:
							if(firstSunday==4){
								System.out.print("  "+(firstSunday+5)+"   |");
								s4+= "  "+(firstSunday+5)+"   |";
								break;
							}else{
								System.out.print("  "+(firstSunday+5)+"  |");
								s4+= "  "+(firstSunday+5)+"  |";
								break;
							}
						case 5:
							System.out.print("  "+(firstSunday+12)+"  |");
							s5+= "  "+(firstSunday+12)+"  |";
							break;
						case 6:
							System.out.print("  "+(firstSunday+19)+"  |");
							s6+= "  "+(firstSunday+19)+"  |";
							break;
						case 7:
							if (firstSunday+26 > days){
								System.out.print("      |");
								s7+="      |";	
							}else{
							if (firstSunday+24 > 29){
								System.out.print("      |");
								s7+= "      |";	
							}else{
							System.out.print("  "+(firstSunday+26)+"  |");
							s7+= "  "+(firstSunday+26)+"  |";
							}
							}
							break;
							
						}
						
					}// end of q
					
					for(int r=1; r<=1; r++){ // this loop make the Saturday column
						switch(i){
						case 1:
							System.out.print("  Sat  ");
							s1+= "  Sat  ";
							break;
						case 2:
						case 8:
							System.out.print("------+");break;
						case 3:
							if (8-firstSunday>=7){
								System.out.print("      |");
								s3+= "      |";
							} else{
								System.out.print("   "+(firstSunday-1)+"  |");
								s3+= "   "+(firstSunday-1)+"  |";
							}break;
						case 4:
							System.out.print("  "+(firstSunday+6)+"  |");
							s4+= "  "+(firstSunday+6)+"  |";
							break;
						case 5:
							System.out.print("  "+(firstSunday+13)+"  |");
							s5+= "  "+(firstSunday+13)+"  |";
							break;
						case 6:
							System.out.print("  "+(firstSunday+20)+"  |");
							s6+= "  "+(firstSunday+20)+"  |";
							break;
						case 7:
							if (firstSunday+27 > days){
								System.out.print("      |");
								s7+="      |";	
							}else{
							if (firstSunday+24 > 28){
								System.out.print("      |");
								s7+= "      |";	
							}else{
							System.out.print("  "+(firstSunday+27)+"  |");
							s7+= "  "+(firstSunday+27)+"  |";
							}
							}
							break;
							
						}
						
					}// end of r
					
					
					
					System.out.println();
				}//end of i
				
				g.drawString(s1, 20, 20);
				g.drawString(s2, 20, 50);
				g.drawString(s3, 20, 80);
				g.drawString(s4, 20, 110);
				g.drawString(s5, 20, 140);
				g.drawString(s6, 20, 170);
				g.drawString(s7, 20, 200);
				g.drawString(s8, 20, 230);
				//g.draw
			}// end of method

}
