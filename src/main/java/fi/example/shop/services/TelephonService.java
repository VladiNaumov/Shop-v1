package fi.example.shop.services;


import fi.example.shop.entities.Telephon;
import fi.example.shop.repositories.TelephonRepesitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Этот класс получает задание от класса контроллер (MainController) и передаёт задание классу Repository

@Service
public class TelephonService {

    private TelephonRepesitory telephonRepesitory;

    @Autowired
    public TelephonService(TelephonRepesitory telephonRepesitory) {
        this.telephonRepesitory = telephonRepesitory;
    }


    public List<Telephon> getAllTetelphon(){
        return telephonRepesitory.getTelefons();
    }


    public Telephon getTelefonById(Long id){
        return telephonRepesitory.getTelefons().get(id.intValue() -1);
    }

    public void getById(Long id){
        telephonRepesitory.getById(id);
    }



}
