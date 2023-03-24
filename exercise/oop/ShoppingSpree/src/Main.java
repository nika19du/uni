import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import  java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String, Person> persons=new LinkedHashMap<>();
        Map<String,Product> products = new LinkedHashMap<>();

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String[] people=reader.readLine().split("[=;]");
            for(int i=0;i<people.length;i+=2){
                persons.put(people[i],new Person(people[i],Double.parseDouble(people[i+1])));
            }

            String[] prod = reader.readLine().split("[=;]");
            for(int i=0; i < prod.length; i+= 2){
                products.put(prod[i],new Product(prod[i],Double.parseDouble(prod[i+1])));
            }

            String purchase;
            while (!"END".equalsIgnoreCase(purchase=reader.readLine().trim())){
                String[] tokens=purchase.split("\\s+");
                String personName = tokens[0];
                String productName = tokens[1];

                if(persons.get(personName).buyProduct(products.get(productName))){
                    System.out.printf("%s bought %s%n",personName,productName);
                }else{
                    System.out.printf("%s can't afford %s$n",personName,productName);
                }
            }

            for(Person person : persons.values()){
                System.out.println(getPersonInfo(person));
            }
        }catch(IOException e){
            e.printStackTrace();
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }

    private  static  String getPersonInfo(Person person){
        StringBuilder info = new StringBuilder();
        info.append(person.getName()).append(" - ");
        if(person.getShoppingCart().isEmpty()){
            info.append("Nothing bought");
        } else {
            for (Product product : person.getShoppingCart()){
                info.append(product.getName()).append(", ");
            }
            info.delete(info.lastIndexOf(", "),info.length());
        }
        return  info.toString();
    }

}