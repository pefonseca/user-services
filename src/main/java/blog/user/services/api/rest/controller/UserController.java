package blog.user.services.api.rest.controller;

import blog.user.services.api.rest.dto.request.UserCreateRequestDTO;
import blog.user.services.api.rest.dto.request.UserUpdateRequestDTO;
import blog.user.services.api.rest.dto.response.UserCreateResponseDTO;
import blog.user.services.api.rest.dto.response.UserResponseDTO;
import blog.user.services.domain.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("FUNCIONANDO");
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> create(@Valid @RequestBody UserCreateRequestDTO requestDTO) {
        var userCreated = service.create(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }

}
