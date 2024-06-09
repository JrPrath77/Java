import java.util.Scanner;

public class product_details{

Scanner sc=new Scanner(System.in);

void prod_details(){
    System.out.println("Enter product details");
    System.out.println("Enter name of the product");
    String prod_name=sc.nextLine();
    System.out.println("Enter Product Company");
    String prod_company=sc.nextLine();
    System.out.println("Enter Quantity:");
    int prod_quantity=sc.nextInt();
    // check is product available
    System.out.println("Enter payment type 1.Online 2.Offline");
    int payment_type=sc.nextInt();
}
// check weight,size , source, destination and pass to below function
 void checking_request(double weight,String size, String source_address, String destination_address){
    double delivery_charges;
    // calculate delivery charges
    //Show delivery charges
    // show root

}

}
public class main {
    
}
