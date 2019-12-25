package cindy.relasi;

import javax.validation.constrains.NotNull;

public interface ApplicationConfiguration{
    @NotNull Integer getMax();
}