package blog.user.services.domain.service.impl;

import blog.user.services.api.rest.dto.request.UserCreateRequestDTO;
import blog.user.services.api.rest.dto.request.UserUpdateRequestDTO;
import blog.user.services.api.rest.dto.response.UserResponseDTO;
import blog.user.services.domain.repository.UserRepository;
import blog.user.services.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    /**
     * @param userCreateRequestDTO
     * @return
     */
    @Override
    public UserResponseDTO create(UserCreateRequestDTO userCreateRequestDTO) {
        UserResponseDTO userDB;
        userDB = repository.save(userCreateRequestDTO.toEntity()).toDTO();
        userDB.setCreatedUser("Usuário criado com sucesso.");
        return userDB;
    }

    /**
     * @param token
     * @return
     */
    @Override
    public UserResponseDTO findById(String token) {
        return null;
    }

    /**
     * @param userUpdateRequestDTO
     * @param token
     * @return
     */
    @Override
    public UserResponseDTO update(UserUpdateRequestDTO userUpdateRequestDTO, String token) {
        return null;
    }
}
