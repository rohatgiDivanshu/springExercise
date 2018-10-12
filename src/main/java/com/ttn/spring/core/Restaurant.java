package com.ttn.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class Restaurant{

//    @Autowired
//    @Qualifier("tea")
    private HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

//    @Required
//    @Autowired
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }


//    @Autowired
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
        
    }
}
