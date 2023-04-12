package cursoweb.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor

public class Postres {
    @Getter @Setter
    private String id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String price;
    @Getter @Setter
    private String image;
    @Getter @Setter
    private String description;


    public Postres(){
      
    }

}

