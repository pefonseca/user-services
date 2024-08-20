package blog.user.services.domain.service;

import blog.user.services.api.rest.dto.request.UserCreateRequestDTO;
import blog.user.services.api.rest.dto.request.UserUpdateRequestDTO;
import blog.user.services.api.rest.dto.response.UserResponseDTO;

public interface UserService {

    UserResponseDTO create(UserCreateRequestDTO userCreateRequestDTO);
    UserResponseDTO findById(String token);
    UserResponseDTO update(UserUpdateRequestDTO userUpdateRequestDTO, String token);
    UserResponseDTO findByEmail(String email);

}
