package Fenyuk_2;

import java.lang.reflect.Array;
import java.util.*;

public class Application {
	
	static void menu() {
		System.out.println("Натисніть 1, щоб перевірити чи є такий місяць");
		System.out.println("Натисніть 2, щоб вивести всі місяці з такою ж порою року");
		System.out.println("Натисніть 3, щоб вивести всі місяці які мають таку саму кількість днів");
		System.out.println("Натисніть 4, щоб вивести на екран всі місяці які мають меншу кількість днів");
		System.out.println("Натисніть 5, щоб вивести на екран всі місяці які мають більшу кількість днів");
		System.out.println("Натисніть 6, щоб вивести на екран наступну пору року");
		System.out.println("Натисніть 7, щоб вивести на екран попередню пору року");
		System.out.println("Натисніть 8, щоб вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натисніть 9, щоб вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натисніть 0, щоб вивести на екран чи введений з консолі місяць має парну кількість днів");
	}

	public static void main(String[] args) {
		
		List<Month> monthArray = Arrays.asList(Month.values());
		
		List<Season> seasonArray = Arrays.asList(Season.values());
		
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		menu();
    		System.out.println("Enter number from 0 to 9!");
    		
    		switch(sc.next()) {
    		case "1" : {
    			System.out.println("Enter Month ");
    			sc = new Scanner(System.in);
    			String month = sc.next().toUpperCase();
    			
                boolean flag = false;
    			
                for (Month m : monthArray) {
					if (m.name().equalsIgnoreCase(month)) {
						System.out.println("Month exists : "+ m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Mounth doesn`t exist");
				}
				break;
    		}
    		
    		case "2" : {
    			System.out.println("Enter Season ");
      			sc = new Scanner(System.in);
      			String seasonSc = sc.next().toUpperCase();
      			
      			boolean flag = false;
      			
      			for(Month m : monthArray) {
      				
      				if(m.getSeason().name().equalsIgnoreCase(seasonSc)) {
      					System.out.println(m);
      					flag = true;	
      				}
      			}
      			
      			if(!flag) {
      				System.out.println("Mounth doesn`t exist");
      			}
      			break;
    		}
    		
    		case "3" : {
    			System.out.println("Enter number from 28 to 31  ");
    			sc = new Scanner(System.in);
    			int mon = sc.nextInt(); 
    			
    			boolean flag = false;
    			
    			for(Month m : monthArray) {
    				
    				if(m.getDays() == mon) {
    					System.out.println(m);
    					flag = true;	
    				}
    			}
    			
    			if(!flag) {
    				System.out.println("Mounth doesn`t exist");
    			}
    			break;
    		}
    		
    		case "4" : {
    			System.out.println("Enter number : 29 - 31");
    			sc = new Scanner(System.in);
    			int mn = sc.nextInt(); 
    			
    			boolean flag = false;
    			
    			for(Month m : monthArray) {
    				
    				if(m.getDays() < mn) {
    					System.out.println(m);
    					flag = true;	
    				}
    			}
    			
    			if(!flag) {
    				System.out.println("Mounth doesn`t exist");
    			}
    			break;
    		}
    		
    		case "5" : {
    			System.out.println("Enter number : 28 - 30");
    			sc = new Scanner(System.in);
    			int mmn = sc.nextInt(); 
    			
    			boolean flag = false;
    			
    			for(Month m : monthArray) {
    				
    				if(m.getDays() > mmn) {
    					System.out.println(m);
    					flag = true;	
    				}
    			}
    			
    			if(!flag) {
    				System.out.println("Mounth doesn`t exist");
    			}
    			break;
    		}
    		
    		case "6" : {
    			System.out.println("Enter Season");
    			sc = new Scanner(System.in);
    			String nextSeason = sc.next().toUpperCase(); 
    			
    			boolean flag = false;
    			
    			for(Season sean : seasonArray) {
    				
    				if(sean.name().equals(nextSeason)) {
    					System.out.println("Next season is : " );
    					flag = true;	
    				}
    			}
    			
    			if(flag) {
    				Season season2 = Season.valueOf(nextSeason);
    				int ordinal = season2.ordinal();
    				
    				if(ordinal == seasonArray.size() -1) {
    					ordinal = 0;
    					System.out.println(seasonArray.get(ordinal));
    				}else {
    					System.out.println(seasonArray.get(ordinal+1));
    				}
    			}
    			
    			if(!flag) {
    				System.out.println("Mounth doesn`t exist");
    			}
    			break;
    		}
    		
    		case "7" : {
    			System.out.println("Enter Season");
    			sc = new Scanner(System.in);
    			String previousSeason = sc.next().toUpperCase(); 
    			
    			boolean flag = false;
    			
    			for(Season sean : seasonArray) {
    				
    				if(sean.name().equals(previousSeason)) {
    					System.out.println("Previous season is : " );
    					flag = true;	
    				}
    			}
    			
    			if(flag) {
    				Season season3 = Season.valueOf(previousSeason);
    				int ordinal = season3.ordinal();
    				
    				if(ordinal == seasonArray.size() -1) {
    					ordinal = 0;
    					System.out.println(seasonArray.get(ordinal));
    				}else {
    					System.out.println(seasonArray.get(ordinal-1));
    				}
    			}
    			
    			if(!flag) {
    				System.out.println("Mounth doesn`t exist");
    			}
    			break;
    		}
    		
    		case "8" : {
    			System.out.println("Enter number 28 or 30 : ");
    			sc = new Scanner(System.in);
    			int even = sc.nextInt(); 
    			
    			boolean flag = false;
    			
    			for(Month m : monthArray) {
    				
    				if(m.getDays() % 2 == 0) {
    					System.out.println(m);
    					flag = true;	
    				}
    			}
    			
    			if(!flag) {
    				System.out.println("Mounth doesn`t exist");
    			}
    			break;
    		}
    		
    		case "9" : {
    			System.out.println("Enter number 29 or 31 : ");
    			sc = new Scanner(System.in);
    			int odd = sc.nextInt(); 
    			
    			boolean flag = false;
    			
    			for(Month m : monthArray) {
    				
    				if(m.getDays() % 2 == 1) {
    					System.out.println(m);
    					flag = true;	
    				}
    			}
    			
    			if(!flag) {
    				System.out.println("Mounth doesn`t exist");
    			}
    			break;
    		}
    		
    		case "0" : {
    			System.out.println("Enter Month ");
    			sc = new Scanner(System.in);
    			String mnt = sc.next().toUpperCase();
    			
    			boolean flag = false;
    			
    			for(Month m : monthArray) {
    				
    				if(m.name().equalsIgnoreCase(mnt)) {
    					if(m.getDays() % 2 == 0) {
    						System.out.println("Month exists and has an even number of days " );					
    					flag = true;
    				}
    					else {
    					System.out.println("Month exists and has no even number of days " );
    					flag = true;
    					}	
    				}
    			}
    			
    			if(!flag) {
    				System.out.println("Mounth doesn`t exist");
    			}
    			break;
    		}
    		
    		}
    	}

	}

	private static boolean isMonthPresent(Month[] monthArray, String month) {
		boolean flag = false;
		
		for(Month m : monthArray) {
			
			if(m.name().equals(month)) {
				System.out.println("Month exists");
				flag = true;	
			}
		}
		return flag;	

		}
}
