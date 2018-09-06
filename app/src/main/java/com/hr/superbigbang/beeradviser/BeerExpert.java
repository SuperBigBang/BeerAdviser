package com.hr.superbigbang.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String colorofbeer) {
        List<String> brandslist = new ArrayList<>();
if (colorofbeer.equals("amber")){
    brandslist.add("Special RED beer");
    brandslist.add("Amber red beer Tul.");
    }
    else {
brandslist.add("White Ale");
brandslist.add("Белый медведь, крепкое");
    }
    return brandslist;
    }

}
