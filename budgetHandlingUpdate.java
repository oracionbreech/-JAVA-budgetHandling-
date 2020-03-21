package pezbok;


import java.util.Random;
import java.util.Scanner;

public class index {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		item[] itemMba;
		itemMba = new item[11];
		
		for(int m = 1;m<=10;m++) {
			itemMba[m] = new item();
		}
		 
	    itemMba[1].init("Diamond Necklace", 20000);
	    itemMba[2].init("Watch", 5000);
	    itemMba[3].init("Wine", 8000);
	    itemMba[4].init("Bag", 10000);
	    itemMba[5].init("Shoes", 9000);
	    itemMba[6].init("Ring", 15000);
	    itemMba[7].init("Clothes", 10000);
	    itemMba[8].init("5 Star Hotel Accommodation", 18000);
	    itemMba[9].init("Perfume", 11000);
	    itemMba[10].init("Make Up", 17000);
	    // mbb
	    
	    item[] itemMbb;
		itemMbb = new item[11];
		
		for(int o = 1 ;o<=10;o++) {
			itemMbb[o] = new item();
		}
		
	    itemMbb[1].init("Mobile Phone", 10000);
	    itemMbb[2].init("Gaming Credits", 9000);
	    itemMbb[3].init("Headset", 5000);
	    itemMbb[4].init("Microphone", 6000);
	    itemMbb[5].init("Speaker", 8000);
	    itemMbb[6].init("Keyboard & Mouse Set", 5500);
	    itemMbb[7].init("Graphic Tablet",9000);
	    itemMbb[8].init("Monitor", 6000);
	    itemMbb[9].init("Gaming Chair", 7000);
	    itemMbb[10].init("SSD Hard Disk", 9000);
	    
	        s = new Scanner(System.in);
	        int chos;
	        int budget = 0;
	        int amount = 0;
	        int quantity = 0;
	        // RANDOMIZER
	        int randomInteger = 0;
	        Random r = new Random();
	        while(randomInteger == 0){
	        randomInteger = r.nextInt(4);
	            if(randomInteger == 4){
	            randomInteger -= 1;
	            }
	        }
	        // RANDOMIZER
	        
	        if(randomInteger == 1){
	        budget = 50000;
	        	System.out.println("Congratulations! You have won a Gift Check worth P50,0000. Please choose an item from Mystery Box A");
	        	System.out.println("Mystery Box A");
				System.out.println(" ____________________________________________");
				System.out.println("|Item                           | Worth |");
				System.out.println("|_______________________________________|");
				System.out.println("|1. Diamond Necklace            |P20,000|");
				System.out.println("|2. Watch                       |P5,000 |");
				System.out.println("|3. Wine                        |P8,000 |");
				System.out.println("|4. Bag                         |P10,000|");
				System.out.println("|5. Shoes                       |P9,000 |");
				System.out.println("|6. Ring                        |P15,000|");
				System.out.println("|7. Clothes                     |P10,000|");
				System.out.println("|8. 5 Star Hotel Accomodation   |P18,000|");
				System.out.println("|9. Pefume                      |P11,000|");
				System.out.println("|10. Make Up                    |P17,000|");
				System.out.println("|_______________________________|_______|");
	        while(budget > 4999){
	            			System.out.println("");
							System.out.println("|-------------------------------------------------|");
							System.out.print("Enter the item you want: ");
	                        chos = s.nextInt();
	                        System.out.println(chos + " has been choosen.");
	                        System.out.print("Enter Quantity: ");
	                        quantity = s.nextInt();
	                        switch(chos){
                            case 1:
                                System.out.println("Diamond Necklace has been choosen");
                                
                                amount = itemMba[1].itemprice;
                                itemMba[1].addCount(quantity);
                                itemMba[1].isBought = true;
                                itemMba[1].itemTotal += itemMba[1].itemprice;
                                break;
                            case 2:
                                System.out.println("Watch has been choosen");
                                
                                amount = itemMba[2].itemprice;
                                itemMba[2].addCount(quantity);
                                itemMba[2].isBought = true;
                                itemMba[2].itemTotal += itemMba[2].itemprice;
                                break;
                            case 3:
                                System.out.println("Wine has been chosen");
                                
                                amount = itemMba[3].itemprice;
                                itemMba[3].addCount(quantity);
                                itemMba[3].isBought = true;
                                itemMba[3].itemTotal += itemMba[3].itemprice;
                                break;
                            case 4:
                                System.out.println("Bag has been chosen");
                                
                                amount = itemMba[4].itemprice;
                                itemMba[4].addCount(quantity);
                                itemMba[4].isBought = true;
                                itemMba[4].itemTotal += itemMba[4].itemprice;
                                break;
                            case 5:
                                System.out.println("Shoes has been chosen");
                                
                                amount = itemMba[5].itemprice;
                                itemMba[5].addCount(quantity);
                                itemMba[5].isBought = true;
                                itemMba[5].itemTotal += itemMba[5].itemprice;
                                break;
                            case 6:
                                System.out.println("Ring has been chosen");
                                
                                amount = itemMba[6].itemprice;
                                itemMba[6].addCount(quantity);
                                itemMba[6].isBought = true;
                                itemMba[1].itemTotal += itemMba[1].itemprice;
                                break;
                            case 7:
                                System.out.println("Clothes has been chosen");
                                
                                amount = itemMba[7].itemprice;
                                itemMba[7].addCount(quantity);
                                itemMba[7].isBought = true;
                                itemMba[7].itemTotal += itemMba[7].itemprice;
                                break;
                            case 8:
                                System.out.println("5 Star Hotel Accomodation has been chosen");
                                
                                amount = itemMba[8].itemprice;
                                itemMba[8].addCount(quantity);
                                itemMba[8].isBought = true;
                                itemMba[8].itemTotal += itemMba[8].itemprice;
                                break;
                            case 9:
                                System.out.println("Pefume  has been choosen");
                                
                                amount = itemMba[9].itemprice;
                                itemMba[9].addCount(quantity);
                                itemMba[9].isBought = true;
                                itemMba[9].itemTotal += itemMba[9].itemprice;
                                break;
                            case 10:
                                System.out.println("Make Up has been chosen");
                                
                                amount = itemMba[10].itemprice;
                                itemMba[10].addCount(quantity);
                                itemMba[10].isBought = true;
                                itemMba[10].itemTotal += itemMba[10].itemprice;
                                break;
                            default:
                                System.out.println("Invalid Choice. Please Try again!");
                                amount = 0;
                                break;
                        }
	                        amount *= quantity;
	                        if(amount > budget){
	                            System.out.println("Item price out of range! The current balance is " + budget);
	                            System.out.println("You are trying to buy an item worth " + amount);
	                            System.out.println("|-------------------------------------------------|");
	                            System.out.println("");
	                        }else{
	                            budget -= amount;
	                            System.out.println(amount + " has been deducted from your balance.");
	                            System.out.println("Your current balance is P"+ budget + ".");
	                            System.out.println("|-------------------------------------------------|");
	                            System.out.println("");
	                        }
	        }
	        
	        System.out.println("");
	        System.out.println("|-------------------------------------------------|");
	        System.out.println("Item's Purchased");
	        
	        for(int y = 1; y<=10; y++) {
	        	if(itemMba[y].isBought) {
	        		System.out.println("\t(" + itemMba[y].count + ") \t" + itemMba[y].itemname + " - " + itemMba[y].itemTotal);
	        	}
	        }
	        
	        System.out.println("");
	        System.out.print("|-------------------------------------------------|");
            
	        
	        // END OF MYSTER BOX A WITH 50K GIFT CHECK
	        }else{
	            if(randomInteger == 2){
	             budget = 30000;
	             
	            System.out.println("Congratulations! You have won a Gift Check worth P30,0000. Please choose an item from Mystery Box A");
	            System.out.println("Mystery Box B");
				System.out.println(" ____________________________________________");
				System.out.println("|Item                       | Worth |");
				System.out.println("|___________________________________|");
				System.out.println("|1. Mobile Phone            |P10,000|");
				System.out.println("|2. Gaming Credits          |P9,000 |");
				System.out.println("|3. Headset                 |P5,000 |");
				System.out.println("|4. Speaker                 |P8,000 |");
				System.out.println("|5. Keyboard & Mouse Set    |P5,500 |");
				System.out.println("|6. Microphone              |P6,000 |");
				System.out.println("|7. Graphic Tablet          |P9,000 |");
				System.out.println("|8. Monitor                 |P6,000 |");
				System.out.println("|9. Gaming Chair            |P7,000 |");
				System.out.println("|10. SSD Hard Disk          |P9,000 |");
				System.out.println("|___________________________|_______|");
				while(budget > 4999){
	                        System.out.println("");
				System.out.println("|--------------------------------------------|");
				System.out.print("Enter the item you want: ");
				
				
	                        chos = s.nextInt();
	                        System.out.println(chos + " has been choosen.");
	                        System.out.print("Enter Quantity: ");
	                        quantity = s.nextInt();
	        				
	                        switch(chos){
	                            case 1:
	                                System.out.println("Mobile Phone  has been choosen");
	                                amount = itemMbb[1].itemprice;
	                                itemMbb[1].addCount(quantity);
	                                itemMbb[1].isBought = true;
	                                itemMbb[1].itemTotal += itemMbb[1].itemprice;
	                                break;
	                            case 2:
	                                System.out.println("Gaming Credits has been choosen");
	                                amount = itemMbb[2].itemprice;
	                                itemMbb[2].addCount(quantity);
	                                itemMbb[2].isBought = true;
	                                itemMbb[2].itemTotal += itemMbb[2].itemprice;
	                                break;
	                            case 3:
	                                System.out.println("Headset has been chosen");
	                                amount = itemMbb[3].itemprice;
	                                itemMbb[3].addCount(quantity);
	                                itemMbb[3].isBought = true;
	                                itemMbb[3].itemTotal += itemMbb[3].itemprice;
	                                break;
	                            case 4:
	                                System.out.println("Speaker has been chosen");
	                                amount = itemMbb[4].itemprice;
	                                itemMbb[4].addCount(quantity);
	                                itemMbb[4].isBought = true;
	                                itemMbb[4].itemTotal += itemMbb[4].itemprice;
	                                break;
	                            case 5:
	                                System.out.println("Keyboard & Mouse Set has been chosen");
	                                amount = itemMbb[5].itemprice;
	                                itemMbb[5].addCount(quantity);
	                                itemMbb[5].isBought = true;
	                                itemMbb[5].itemTotal += itemMbb[5].itemprice;
	                                break;
	                            case 6:
	                                System.out.println("Microphone has been chosen");
	                                amount = itemMbb[6].itemprice;
	                                itemMbb[6].addCount(quantity);
	                                itemMbb[6].isBought = true;
	                                itemMbb[6].itemTotal += itemMbb[6].itemprice;
	                                break;
	                            case 7:
	                                System.out.println("Graphic Tablet has been chosen");
	                                amount = itemMbb[7].itemprice;
	                                itemMbb[7].addCount(quantity);
	                                itemMbb[7].isBought = true;
	                                itemMbb[7].itemTotal += itemMbb[7].itemprice;
	                                break;
	                            case 8:
	                                System.out.println("Monitor has been chosen");
	                                amount = itemMbb[1].itemprice;
	                                itemMbb[8].addCount(quantity);
	                                itemMbb[8].isBought = true;
	                                itemMbb[8].itemTotal += itemMbb[8].itemprice;
	                                break;
	                            case 9:
	                                System.out.println("Gaming Chair  has been choosen");
	                                amount = itemMbb[1].itemprice;
	                                itemMbb[9].addCount(quantity);
	                                itemMbb[9].isBought = true;
	                                itemMbb[9].itemTotal += itemMbb[9].itemprice;
	                                break;
	                            case 10:
	                                System.out.println("SSD Hard Disk has been chosen");
	                                amount = itemMbb[1].itemprice;
	                                itemMbb[10].addCount(quantity);
	                                itemMbb[10].isBought = true;
	                                itemMbb[10].itemTotal += itemMbb[10].itemprice;
	                                break;
	                                
	                            default:
	                                System.out.println("Invalid Choice. Please Try again!");
	                                amount = 0;
	                                break;
	                        }
	                        
	                        amount *= quantity;
	                        
	                        if(amount > budget){
	                            System.out.println("Item price out of range! The current balance is " + budget);
	                            System.out.println("You are trying to buy an item worth " + amount);
	                            System.out.println("|-------------------------------------------------|");
	                            System.out.println("");
	                        }else{
	                            budget -= amount;
	                            System.out.println(amount + " has been deducted from your balance.");
	                            System.out.println("Your current balance is P"+ budget + ".");
	                            System.out.print("|-------------------------------------------------|");
	                            System.out.println("");
	                        }
	                        System.out.println("");
	            	        System.out.println("|-------------------------------------------------|");
	            	        System.out.println("Item's Purchased");
	            	        
	            	        for(int h = 1; h<=10; h++) {
	            	        	if(itemMbb[h].isBought) {
	            	        		System.out.println("\t(" + itemMbb[h].count + ") \t" + itemMbb[h].itemname + " - " + itemMbb[h].itemTotal);
	            	        	}
	            	        }
	             
	             
	        }
	            }else{
	            budget = 80000;
	            System.out.println("A Jackpot worth 80,000. You can choose an item either of the two boxes");
	            
	        }
	        }
	        
		

	}

}
