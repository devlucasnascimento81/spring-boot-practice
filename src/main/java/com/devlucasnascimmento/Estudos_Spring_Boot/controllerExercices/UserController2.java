package com.devlucasnascimmento.Estudos_Spring_Boot.controllerExercices;

import com.devlucasnascimmento.Estudos_Spring_Boot.modelExercises.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController2 {

    @GetMapping("users/{id}")
    public ResponseEntity<String> getUsersById(@PathVariable Long id){
        if (id == 99L){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("searching for user id: "+ id);
    }

    @GetMapping("/userss")
    public ResponseEntity<List<UserModel>>getAllUsers(){
        List<UserModel> users = new ArrayList<>();

        users.add(new UserModel(118398L,"Patolino","patolinofodao123@gmail.com",true));
        users.add(new UserModel(233874L,"Pernalonga","perninha2010@gmail.com",true));
        users.add(new UserModel(494753L,"Gaguinho","dinosssaurogigante@gmail.com",false));

        return ResponseEntity.ok(users);
    }

}
