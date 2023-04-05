package code.leofaria.devsocialnetwork.controller;

import code.leofaria.devsocialnetwork.domain.User;
import code.leofaria.devsocialnetwork.dto.UserSaveDTO;
import code.leofaria.devsocialnetwork.mapper.UserMapper;
import code.leofaria.devsocialnetwork.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("user")
@RestController
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;
    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> list() {
        return userService.list();
    }
    
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Optional<User> getById(@PathVariable Long id) {
        return userService.findById(id);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@Valid @RequestBody UserSaveDTO dto) {
        User user = userMapper.userSaveDTOtoUser(dto);
        return userService.save(user);
    }
    
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User update(@PathVariable Long id, @Valid @RequestBody UserSaveDTO dto) {
        User user = userMapper.userSaveDTOtoUser(dto);
        return userService.update(id, user);
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.GONE)
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
