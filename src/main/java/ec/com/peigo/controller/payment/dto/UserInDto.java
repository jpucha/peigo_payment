package ec.com.peigo.controller.payment.dto;

import ec.com.peigo.model.AuthorityDto;
import lombok.Data;

import java.util.Set;

@Data
public class UserInDto {
    private String username;
    private String password;
    private Set<AuthorityDto> authorities;
}
