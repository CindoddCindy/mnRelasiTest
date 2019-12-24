package cindy.relasi.domain;

import javax.persitence.Column;
import javax.persitence.Entity;
import javax.persitence.GeneratedValue;
import javax.persitence.GenerationType;
import javax.persitence.Id;
import javax.persitence.ManyToOne;
import javax.persitence.Table;
import javax.validation.constrains.NotNull;


@Entity
@Table(name = "book")

public class Book {
    public Book() {

    }

    public Book(@NotNull String isbn, @NotNull String name, Genre genre){
        this.isbn=isbn;
        this.name=name;
        this.genre=genre;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name= "isbn", nullable=false)
    private String isbn;

    @ManyToOne
    private Genre genre;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name ){
        this.name=name;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }

    public Genre getGenre(){
        return genre;
    }

    public void setGenre(Genre genre){
        this.genre=genre;
    }

    @Override
    public String toString(){
        return "Book{" +
    "id=" + id + ", name= '" + name + '\'' +
    ", isbn=' " + + isbn + '\''+
    ", genre=" + genre +
    '}';
    
    }


    }


}
