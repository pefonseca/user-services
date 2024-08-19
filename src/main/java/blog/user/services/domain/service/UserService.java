package blog.user.services.domain.service;

import blog.user.services.api.rest.dto.request.UserCreateRequestDTO;
import blog.user.services.api.rest.dto.response.UserCreateResponseDTO;
import blog.user.services.api.rest.dto.response.UserResponseDTO;
import blog.user.services.api.rest.dto.request.UserUpdateRequestDTO;

public interface UserService {

    UserResponseDTO create(UserCreateRequestDTO userCreateRequestDTO);
    UserResponseDTO findById(String token);
    UserResponseDTO update(UserUpdateRequestDTO userUpdateRequestDTO, String token);

}
