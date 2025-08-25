package first_example.identity_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import first_example.identity_service.dto.request.UserCreationRequest;
import first_example.identity_service.entity.User;
import first_example.identity_service.repository.UserRepository;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User createUser(UserCreationRequest request){
        User user = new User();

        user.setUsername(request.getUsername());
        user.setPasssword(request.getPassword());
        user.setFirstname(request.getFirstname());
        user.setLastname(request.getLastname());
        user.setDob(request.getDob());
        


        return userRepository.save(user);
    }
    
}