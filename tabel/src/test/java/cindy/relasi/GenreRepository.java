package cindy.relasi;

import cindy.relasi.domain.Genre;

import javax.validation.constarains.NotBlank;
import javax.validation.constrains.NotNull;
import java.util.List;
import java.util.Optional;

pub;ic interface GenreRepository {


    Optional<Genre> findById(@NotNull Long Id);
    Genre save (@NotBlank String name);

    void deletedById(@NotNull Long id);

    List<Genre> findAll(@NotNull SortingAndOrderArguments args);

    int update (@NotNull Long id, @NotBlank String name);


}