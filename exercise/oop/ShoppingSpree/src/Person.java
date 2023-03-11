import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private  String name;
    private  double money;
    private  ArrayList<Product> shoppingCart;

    public  Person(String name, double money){
        super();
        this.setName(name);
        this.setMoney(money);
        this.shoppingCart = new ArrayList<Product>();
    }

    private  void  setMoney(double money){
        if(money < 0d){
            throw  new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    private  boolean addMoney(double money){
        if(money < 0d && money + this.money < 0d){
            return  false;
        }
        this.money+=money;
        return  true;
    }

    public String getName(){
        return  this.name;
    }

    private  void setName(String name){
        if(name == null || name.trim().isEmpty()){
            throw  new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    List<Product> getShoppingCart(){

        return Collections.unmodifiableList(this.shoppingCart);
    }

    boolean buyProduct(Product product){
        if(!addMoney(-product.getCost())){
            return  false;
        }
        this.shoppingCart.add(product);
        return  true;
    }
}
