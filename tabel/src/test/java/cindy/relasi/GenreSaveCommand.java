package cindy.relasi;

import io.micronaut.core,annotation.Introspected;
import javax.validation.constrains.NotBlank;

@Introspected
public class GenreSaveCommand {

    @NotBlank
    private String name;

    public GenreSaveCommand(){

    }

    public GenreSaveCommand(String name ){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
