package fi.example.shop.repositories;

import fi.example.shop.entities.Car;
import fi.example.shop.entities.Telephon;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

// замена БД (где хранятся товары)

@Component
public class TelephonRepesitory {

    private List<Telephon> telefons;

    public List<Telephon> getTelefons() {
        return telefons;
    }

    @PostConstruct
    public void TelefonAll(){

        telefons = new ArrayList<>();

        telefons.add(new Telephon(1, "IPHONE", 1100));
        telefons.add(new Telephon(2, "NOKIA", 600));
        telefons.add(new Telephon(3, "SAMSUNG", 800));
        telefons.add(new Telephon(4, "SONY", 650));
        telefons.add(new Telephon(5, "LG", 300));



    }


}
