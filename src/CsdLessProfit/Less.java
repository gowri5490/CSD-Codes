package CsdLessProfit;
import java.util.*;

class Product implements Comparable<Product>
{
    private final String name;
    private final double price;
    private final double discount;
    
    public Product(String name,double price,double discount)
    {
        this.name=name;
        this.price=price;
        this.discount=discount;
    }
    
    public Double getDiscountPrice()
    {
        return price*discount/100;
    }
    @Override
    public int compareTo(Product other)
    {
        return this.getDiscountPrice().compareTo(other.getDiscountPrice());
    }
    
    @Override
    public String toString()
    {
      return name;   
    }
}

public class Less 
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        
        List<Product> products=new ArrayList<>();
        int limit=input.nextInt();
        
        for(int i=0;i<limit;i++)
        {
            String[] inputs=input.next().split(",");
            
            String name=inputs[0];
            double price=Double.parseDouble(inputs[1]);
            double discount=Double.parseDouble(inputs[2]);
            
            Product things=new Product(name,price,discount);
            
            products.add(things);
        }
        
        products.stream()
        .filter(things-> things.getDiscountPrice().equals(Collections.min(products).getDiscountPrice())).
        forEach(System.out::println);
        
    }
}