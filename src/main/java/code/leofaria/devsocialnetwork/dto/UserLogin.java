package code.leofaria.devsocialnetwork.dto;

import jakarta.validation.constraints.NotBlank;

public record UserLogin(@NotBlank String login,
                        @NotBlank String senha) {}