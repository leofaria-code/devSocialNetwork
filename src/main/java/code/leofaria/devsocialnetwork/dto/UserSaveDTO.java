package code.leofaria.devsocialnetwork.dto;

import jakarta.validation.constraints.NotBlank;

public record UserSaveDTO(@NotBlank(message = "USERNAME é um campo obrigatório") String username,
                          @NotBlank(message = "PASSWORD é um campo obrigatório") String password)
{

}