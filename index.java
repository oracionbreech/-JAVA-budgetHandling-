 public static void main(String[] args) {
        // TODO code application logic here'
        
        Scanner s = new Scanner(System.in);
        
        int budget = 40000;
        int amount;
        while(budget > 0){
            System.out.print("Enter Amount: ");
            amount = s.nextInt();
            if(amount < budget){
                budget = budget - amount;
                System.out.println("Current Balance is "+ budget);
            }else{
                System.out.println("Amount Entered Exceeded Budget");
            }
        }
    }
