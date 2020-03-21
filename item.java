package pezbok;

public class item {

	public int count = 0;
    public String itemname = "";
    public int itemprice = 0;
    boolean isBought = false;
    public int itemTotal = 0;
    public item() {
    	
    	
    }
    
  
    public void init(String iname,int iprice){
        this.itemname = iname;
        this.itemprice = iprice;
    }
    
    public String getName(){
        return this.itemname;
    }
    public int getPrice(){
        return this.itemprice;
    }
    public int getCount(){
        return this.count;
    }
    public boolean isBought() {
    	return isBought;
    }
    
    public void addCount(int q){
        count += q;
    }
    
    public void buyItem() {
    	isBought = true;
    }
}
