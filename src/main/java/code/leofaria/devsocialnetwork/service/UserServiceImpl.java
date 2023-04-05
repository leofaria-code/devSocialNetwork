package code.leofaria.devsocialnetwork.service;

import code.leofaria.devsocialnetwork.domain.User;
import code.leofaria.devsocialnetwork.repository.UserRepo;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepo userRepository;
    @Override
    public List<User> list() {
        return (List<User>) userRepository.findAll();
    }
    
    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
//        .orElseThrow(AerogeradorNotFoundException::new);
    }
    
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
    
    @Override
    public User update(Long id, @NonNull User user) {
        user.setId(id);
        return userRepository.save(user);
    }
    
    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
