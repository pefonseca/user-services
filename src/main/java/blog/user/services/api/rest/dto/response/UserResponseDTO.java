package blog.user.services.api.rest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String profilePicture;
    private String coverPicture;
    private String bio;
    private String city;
    private String maritalStatus;
    private String createdUser;

}
