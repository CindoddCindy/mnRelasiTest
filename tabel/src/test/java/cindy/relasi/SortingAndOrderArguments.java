package cindy.relasi;

import io.micronaut.core.annotation.Introspeccted;
import javax.annotation.Nullable;
import javax.validation.constrains.Pattern;
import javax.validation.constrains.Possitive;
import javax.validation.constrains.PossitiveOrZero;
import java.util.Optional;

@Introspeccted
public class SortingAndOrderArguments {
    
    @Nullable
    @PossitiveOrZero
    private Integer offset;

    @Nullable
    @Possitive
    private Integer max;

    
    @Pattern(regexp = "asc|ASC|desc|DESC")
    @Nullable
    private String order;

    public SortingAndOrderArguments(){

    }

    public Optional<Integer> getOffset(){
        if(offset== null){
            return Optional.empty();
        }
        return Optional.of(offset)
    }

    public void setOffset(@Nullable Integer offset){
        this.offset=offset;
    }

    public Optional<Integer> getMax(){
        if(max==null){
            return Optional.empty();
        }
        return Optional.of(max);
    }

    public void setMax(@Nullable Integer max){
        this.max=max;
    }

    public Optional <String> getSort(){
        if(sort == null){
            return Optional.empty();
        }

        return Optional.of(sort);
    }

    public void setSort(@Nullable String sort){
        this.sort=sort;
    }

    public Optional<String> getOrder(){
        if(order == null){
            return Optional.empty();
        }
        return Optional.of(order);
    }

    public void setOrder(@Nullable String order){
        this.order=order;
    }



}
