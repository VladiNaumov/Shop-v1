package fi.example.shop.services;

import fi.example.shop.entities.Telephon;
import fi.example.shop.repositories.TelephonRepesitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelephonService {

    private TelephonRepesitory telephonRepesitory;

    @Autowired
    public void setTelephonRepesitory(TelephonRepesitory telephonRepesitory) {
        this.telephonRepesitory = telephonRepesitory;
    }

    public List<Telephon> getAllTetelphon(){
        return telephonRepesitory.getTelefons();
    }

}
