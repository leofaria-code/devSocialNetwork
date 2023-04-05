package code.leofaria.devsocialnetwork.service;

import code.leofaria.devsocialnetwork.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> list();
    
    Optional<User> findById(Long id);
    
    User save(User user);
    
    User update(Long id, User user);
    
    void delete(Long id);
}
