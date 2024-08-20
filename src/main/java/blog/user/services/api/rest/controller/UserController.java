package blog.user.services.api.rest.controller;

import blog.user.services.api.rest.dto.request.UserCreateRequestDTO;
import blog.user.services.api.rest.dto.request.UserUpdateRequestDTO;
import blog.user.services.api.rest.dto.response.UserResponseDTO;
import blog.user.services.domain.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/{token}")
    public ResponseEntity<UserResponseDTO> findById(@PathVariable(value = "token") String token) {
        return ResponseEntity.ok(service.findById(token));
    }

    @GetMapping("/find_by_email")
    public ResponseEntity<UserResponseDTO> findByEmail(@RequestParam(value = "email") String email) {
        return ResponseEntity.ok(service.findByEmail(email));
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> create(@Valid @RequestBody UserCreateRequestDTO requestDTO) {
        var userCreated = service.create(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }

    @PutMapping("/{token}")
    public ResponseEntity<UserResponseDTO> update(@Valid @RequestBody UserUpdateRequestDTO userUpdateRequestDTO,
                                                  @PathVariable(value = "token") String token) {
        var userUpdated = service.update(userUpdateRequestDTO, token);
        return ResponseEntity.ok(userUpdated);
    }

}
