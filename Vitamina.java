public class Vitamina extends MenuComponent
{
    public Vitamina(){        
    }
    
    public String getName(){
        return "Vitamina";
    }
    
    public String getDescription(){
        return "Vitamina de açai";
    }
    
    public double getPrice(){
        return 12;
    }
        
    public String toString(){
        return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        
        System.out.print(", "+getPrice());
        System.out.print("     --  "+getDescription());
    }

}