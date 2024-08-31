import java.util.*;
class hotel_data{
    int tokenno;
    String customer_name;
    float total;
    dish[] d;
}
class dish{
    int did,qty;
    String dishname;
    char dish_type;
    float price;
}
public class hotel{
    public static void main(String[] args){
        hotel_data h=new hotel_data();
        h.tokenno=1;
        h.customer_name="saamir";
        h.d=new dish[3];
        h.d[0].did=1;
        h.d[0].dishname="Briyani";
        h.d[0].dish_type='N';
        h.d[0].price=250; 
        h.d[0].qty=2;
        h.d[1].did=2;
        h.d[1].dishname="Juice";
        h.d[1].dish_type='C';
        h.d[1].price=200; 
        h.d[1].qty=1;
        h.d[2].did=3;
        h.d[2].dishname="Chicken Fry";
        h.d[2].dish_type='N';
        h.d[2].price=250; 
        h.d[2].qty=2;    
    }
}