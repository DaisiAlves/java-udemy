package entities;

import java.util.Date;
import java.text.SimpleDateFormat;


public class UsedProduct extends Product {

/**
 *
 */
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

private Date manufatureDate;

public UsedProduct (String name, Double price, Date manufatureDate) {
    super (name, price);
     this.manufatureDate = manufatureDate;
}


public Date getManufatureDate() {
    return manufatureDate;
}

public void setManufatureDate(Date manufatureDate) {
    this.manufatureDate = manufatureDate;
}

@Override
public String priceTag() {
    return getName() 
        + " (used) $ " 
        + String.format("%.2f", getPrice()) 
        + " (Manufacture date: " 
        + sdf.format(manufatureDate) // O segredo está aqui!
        + ")";
}

}
