package beeradviser.hfad.com.beeradviser;
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
            if (color.equals("amber")){
                brands.add("Jack Amber");
                brands.add("Red Mose");
            }
            else {
                brands.add("Jail Pale Ale");
                brands.add("Gout Sout");
            }
            return brands;
    }
}
