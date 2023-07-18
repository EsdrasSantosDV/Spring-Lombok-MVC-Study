package services;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import model.Guarana;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Slf4j
@Service
public class GuaranaServiceImpl implements GuaranaService {
    @Override
    public Guarana getGuaranaById(UUID id) {
        log.debug("Get Guarana...", id.toString());
        return Guarana.builder().id(id).beerName("Guarana").price(new BigDecimal(1.99)).build();
    }
}
