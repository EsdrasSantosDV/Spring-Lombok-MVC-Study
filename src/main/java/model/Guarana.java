package model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


//COM O LOMBOK CONSEGUIMOS REDUZIR O CÓDIGO EM 80% A 90%
//DADO QUE USAMOS ANNOTATIONS PARA CRIAR OS GETTERS E SETTERS
//COLOCAR O CONSTRUTOR, REDUZIMOS TODO O CODIGO, DEIXANDO
//DE FORMA MUITO MAIS LEGIVEL
//PODEMOS ATE CONSTRUIR UM BUILDER, SEM IMPLEMENTAR NA MÃO
//TUDO EM TEMPO DE EXECUÇÃO
//E ISSO NÃO PIORA A PERFORMANCE

//USEI UMA EXTENSÃO QUE CRIA, MOSTRANDO O QUE ELE FAZ  NA MÃO
//ELE CRIA O CONSTRUTOR, GETTERS E SETTERS, EQUALS, HASHCODE

@Builder
@Data
public class Guarana {
    private UUID id;
    private Integer version;
    private String beerName;
    private String upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;


}
