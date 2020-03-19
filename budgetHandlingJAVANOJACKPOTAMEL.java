private int amount,budget;
    
    public static void main(String q[]){
       
        Scanner s = new Scanner(System.in);
        int chos;
        int budget = 0;
        int amount = 0;
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
        while(budget!=0){
                        System.out.println("");
			System.out.println("|-------------------------------------------------|");
			System.out.print("Enter the item you want: ");
                        chos = s.nextInt();
                        System.out.println(chos + " has been choosen.");
                        
                        switch(chos){
                            case 1:
                                System.out.println("Diamond Necklace has been choosen");
                                amount = 20000;
                                break;
                            case 2:
                                System.out.println("Watch has been choosen");
                                amount = 5000;
                                break;
                            case 3:
                                System.out.println("Wine has been chosen");
                                amount = 8000;
                                break;
                            case 4:
                                System.out.println("Bag has been chosen");
                                amount = 10000;
                                break;
                            case 5:
                                System.out.println("Shoes has been chosen");
                                amount = 9000;
                                break;
                            case 6:
                                System.out.println("Ring has been chosen");
                                amount = 15000;
                                break;
                            case 7:
                                System.out.println("Clothes has been chosen");
                                amount = 10000;
                                break;
                            case 8:
                                System.out.println("5 Star Hotel Accomodation has been chosen");
                                amount = 18000;
                                break;
                            case 9:
                                System.out.println("Pefume  has been choosen");
                                amount = 11000;
                                break;
                            case 10:
                                System.out.println("Make Up has been chosen");
                                amount = 17000;
                                break;
                                
                            default:
                                System.out.println("Invalid Choice. Please Try again!");
                                amount = 0;
                                break;
                        }
                        
                        
                        if(amount > budget){
                            System.out.println("Item price out of range! The current balance is " + budget);
                            System.out.println("You are trying to buy an item worth " + amount);
                            System.out.print("|-------------------------------------------------|");
                            System.out.println("");
                        }else{
                            budget -= amount;
                            System.out.println(amount + " has been deducted from your balance.");
                            System.out.println("Your current balance is P"+ budget + ".");
                            System.out.print("|-------------------------------------------------|");
                            System.out.println("");
                        }
        }
        // END OF MYSTER BOX A WITH 50K GIFT CHECK
        }else{
            if(randomInteger == 2){
             budget = 30000;
             System.out.println("A Gift Check worth 30,000. Please choose an item from Mystery Box B.");
             
             
             budget = 50000;
        System.out.println("Congratulations! You have won a Gift Check worth P50,0000. Please choose an item from Mystery Box A");
        System.out.println("Mystery Box A");
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
        while(budget!=0){
                        System.out.println("");
			System.out.println("|--------------------------------------------|");
			System.out.print("Enter the item you want: ");
                        chos = s.nextInt();
                        System.out.println(chos + " has been choosen.");
                        
                        switch(chos){
                            case 1:
                                System.out.println("Mobile Phone  has been choosen");
                                amount = 10000;
                                break;
                            case 2:
                                System.out.println("Gaming Credits has been choosen");
                                amount = 9000;
                                break;
                            case 3:
                                System.out.println("Headset has been chosen");
                                amount = 5000;
                                break;
                            case 4:
                                System.out.println("Speaker has been chosen");
                                amount = 8000;
                                break;
                            case 5:
                                System.out.println("Keyboard & Mouse Set has been chosen");
                                amount = 5500;
                                break;
                            case 6:
                                System.out.println("Microphone has been chosen");
                                amount = 6000;
                                break;
                            case 7:
                                System.out.println("Graphic Tablet has been chosen");
                                amount = 9000;
                                break;
                            case 8:
                                System.out.println("Monitor has been chosen");
                                amount = 6000;
                                break;
                            case 9:
                                System.out.println("Gaming Chair  has been choosen");
                                amount = 7000;
                                break;
                            case 10:
                                System.out.println("SSD Hard Disk has been chosen");
                                amount = 9000;
                                break;
                                
                            default:
                                System.out.println("Invalid Choice. Please Try again!");
                                amount = 0;
                                break;
                        }
                        
                        
                        if(amount > budget){
                            System.out.println("Item price out of range! The current balance is " + budget);
                            System.out.println("You are trying to buy an item worth " + amount);
                            System.out.print("|-------------------------------------------------|");
                            System.out.println("");
                        }else{
                            budget -= amount;
                            System.out.println(amount + " has been deducted from your balance.");
                            System.out.println("Your current balance is P"+ budget + ".");
                            System.out.print("|-------------------------------------------------|");
                            System.out.println("");
                        }
             
             
        }
            }else{
            budget = 80000;
            System.out.println("A Jackpot worth 80,000. You can choose an item either of the two boxes");
            
            
            
        }
        }
        
        
        
        
    
    
    }
