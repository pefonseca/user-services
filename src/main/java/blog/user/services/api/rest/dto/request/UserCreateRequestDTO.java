package blog.user.services.api.rest.dto.request;

import blog.user.services.domain.model.entity.Role;
import blog.user.services.domain.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateRequestDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String profilePicture;
    private String coverPicture;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private String bio;
    private String city;
    private String maritalStatus;
    private Role role;

    public User toEntity() {
        return User.builder()
                   .firstName(this.firstName)
                   .lastName(this.lastName)
                   .email(this.email)
                   .password(this.password)
                   .profilePicture(this.profilePicture)
                   .coverPicture(this.coverPicture)
                   .createDate(LocalDateTime.now())
                   .updateDate(LocalDateTime.now())
                   .bio(this.bio)
                   .city(this.city)
                   .maritalStatus(this.maritalStatus)
                   .role(this.role)
                   .build();
    }

}
