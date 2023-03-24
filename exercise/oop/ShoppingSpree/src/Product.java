public class Product {
    private String name;
    private  double cost;

    Product(String name,double cost){
        super();
        this.setName(name);
        this.setCost(cost);
    }

    public String getName(){
        return  this.name;
    }

    private  void setName(String name){
        if(name==null || name.trim().isEmpty()){
            throw  new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    double getCost(){
        return  this.cost;
    }

    private  void setCost(double cost){
        if(cost < 0d){
            throw  new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }
}
