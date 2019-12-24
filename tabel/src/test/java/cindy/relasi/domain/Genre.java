package cindy.relasi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constrains.notNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "genre")
public class Genre{

    public Genre(){}

    public Genre(@notNull String name){
        this.name=name;
    }

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name= "name", nullable=false, unique=true)
    private String name;

    @JsonIgnore
    @OneToMany (mappedBy = " genre")
    private Set<Book> books = new HashSet<>();

    public Long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String Name){
        this.name=name;
    }

    public Set<Book> getBooks(){
        return books;
    }

    public void setBoks(Set<Books> books){
        this.books=books;
    }

    @override
    public String toString(){
        return "Genre{"+
        "id="+ id+
        ",nname='" + name +'\''+
        '}';
    }


     

}
