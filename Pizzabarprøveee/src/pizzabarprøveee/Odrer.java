package pizzabarprøveee;

import java.util.ArrayList;

public class Odrer {
    String navn;
ArrayList<Pizzaer> odrer= new ArrayList<Pizzaer>();

    public Odrer(String navn) {
        this.navn = navn;
    }

    public void addPizza(Pizzaer pizzaer){
        odrer.add(pizzaer);
        
                
        }

@Override
    public String toString() {
        String result="";
        for (Pizzaer b:odrer){ 
            result+=b.toString();
            result+="\n";
        }
        return navn + "\n"+result;
    }
 public double samletAfgift(){ 
        
     double prisodrer=0;     
        for(Pizzaer p:odrer){
            prisodrer+=p.getPris();
            
        }
       
        return prisodrer;
}
}

