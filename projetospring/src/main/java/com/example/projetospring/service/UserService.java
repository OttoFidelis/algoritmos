package com.example.projetospring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.projetospring.model.entity.User;
import com.example.projetospring.model.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @Transactional
    public User create(User user){
        user.setId(null);
        return userRepository.save(user);
    }

    @Transactional
    public User findByName(String name){
        Optional<User> user = userRepository.findByName(name);
        if(user.isPresent()){
            User _user = user.get();
            return _user;
        }
        else throw new RuntimeException("Usuário não encontrado");
    }

    @Transactional
    public List<User> findAll(){
            return userRepository.findAll();
    }
}
