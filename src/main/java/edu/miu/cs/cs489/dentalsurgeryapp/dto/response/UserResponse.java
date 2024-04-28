package edu.miu.cs.cs489.dentalsurgeryapp.dto.response;

public record UserResponse(
        Integer userId,
        String username,
        String firstName,
        String lastName,
        String email,
        boolean enabled,
        boolean accountNonExpired,
        boolean accountNonLocked,
        boolean credentialsNonExpired
) {
}
