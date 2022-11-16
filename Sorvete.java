
/**
 * Escreva uma descrição da classe Pudim aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Sorvete extends MenuComponent
{
    public Sorvete(){        
    }
    
    public String getName(){
        return "Sorvete";
    }
    
    public String getDescription(){
        return "Sorvete de chocolate";
    }
    
    public double getPrice(){
        return 8;
    }
        
    public String toString(){
        return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
    }
}