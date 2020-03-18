 public static void main(String[] args) {
        // TODO code application logic here'
        
        Scanner s = new Scanner(System.in); // DECLARE NATIN YUNG SCANNER NA OBJECT PARA MAKA INPUT TAYO SA CONSOLE
        
        int budget = 40000; // INITIALIZE YUNG BUDGET, IN THIS CASE 40K DIBA?
        int amount; // LAGAYAN NG AMOUNT NATIN YUNG ETATYPE SA CONSOLE
  
  
        while(budget > 0){ // POINT A KUNG ANG BUDGET AY DI 0 OR MORE THAN 0 PATULOY LNG ANG PAG RUN NG WHILE LOOP DI ITO LALAGPAS NG POINT B BABAIK LANG ITO NG POINT C
            System.out.print("Enter Amount: "); // POINT C
            amount = s.nextInt(); // PASOK NATIN ANG ETATYPE NATIN SA CONSOLE SA AMOUNT NA INTEGER VARIABLE
            
         // FAIL SAFE ANG CODE NA ITO
         if(amount < budget){
                budget = budget - amount;
                System.out.println("Current Balance is "+ budget);
          
          // SAKA LNG TO MAG RURUN IF YUNG AMOUNT NA ETATYPE SA CONSOLE DI LAGPAS SA CURRENT BUDGET.
            }else{
                System.out.println("Amount Entered Exceeded Budget"); // MAG RURUN TO KUNG LAGPAS SA BUDGET ANG AMOUNT NA ETATYPE SA CONSOLE
            }
         //  KASI PAG WALA ANG FAIL SAFE NA TO PAG YUNG ETATYPE NATIN SA CONSOLE NA AMOUNT LAGPAS NA SA BUDGET MAGIGING NEGATIVE YUNG BUDGET NATIN KUNG SAKALI.
         
         
         
        } // POINT B
  
      // END NG LOOP DI PUPUNTA ANG PROGRAM DITO UNLESS ANG BUDGET AY 0 KASI NGA  while(budget > 0) SEE POINT A
    }
