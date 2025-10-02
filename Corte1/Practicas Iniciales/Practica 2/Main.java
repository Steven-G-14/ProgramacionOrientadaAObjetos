
package Carros;

public class Main {
 public static void main(String[] args) {
   
     Car2 car = new Car2();
     Car2 car2 = new Car2();
     Car2 car3 = new Car2();
     
     
     
     car.setCompany_name("Chevrolet");
     car.setModel_name("Aveo Tunning ");
     car.setYear(2019);
     car.setMileage(100000);
     
     car2.setCompany_name("Nissan");
     car2.setModel_name("Skiline R34");
     car2.setYear(2007);
     car2.setMileage(50000);
     
     car3.setCompany_name("Toyota");
     car3.setModel_name("Supra Mk3");
     car3.setYear(2008);
     car3.setMileage(10000);
     
     
      
        
    System.out.println("Company Name: " + car.getCompany_name());
    System.out.println("Model Name: " + car.getModel_name());
    System.out.println("Year: " + car.getYear());
    System.out.println("Mileage: " + car.getMileage());  
    
     System.out.println("              " );
    
    System.out.println("Company Name: " + car2.getCompany_name());
    System.out.println("Model Name: " + car2.getModel_name());
    System.out.println("Year: " + car2.getYear());
    System.out.println("Mileage: " + car2.getMileage());  
    
     System.out.println("              " );
    
    System.out.println("Company Name: " + car3.getCompany_name());
    System.out.println("Model Name: " + car3.getModel_name());
    System.out.println("Year: " + car3.getYear());
    System.out.println("Mileage: " + car3.getMileage());  
  
        
        
    }
    
}
