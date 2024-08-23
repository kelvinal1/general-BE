package com.example.demo.Controllers;

import com.example.demo.Models.ProductModel;
import com.example.demo.Models.UserModel;
import com.example.demo.Repositories.ProductsRepository;
import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    ;
    @GetMapping
    public List<UserModel> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> findByPk(@PathVariable int id) {
        return userRepository.findById((long) id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UserModel save(@RequestBody UserModel user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }


}
