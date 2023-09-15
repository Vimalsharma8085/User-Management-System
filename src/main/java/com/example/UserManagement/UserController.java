package com.example.UserManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    List<User> userlist;

    @PostMapping("usercom1")
    public String adduser(@RequestBody User myuser){
        userlist.add(myuser);
        return "user added";
    }
     @GetMapping("usercom2")
    public List<User> getallusers(){
        return userlist;
     }
     @DeleteMapping("usercom3/id/{id}")
    public String removeuserid(@PathVariable Integer id){

        for(User val:userlist){
            if(val.getUserId().equals(id)){
                userlist.remove((id));
                return "removed";
            }
        }

        return "removed invalid";
     }
     @PutMapping("usercom4/{id}")
     public String updateusers( @PathVariable Integer id,@RequestBody Integer updateuser){
        for(User val:userlist){
            if(val.getUserId().equals(id)){
                val.setUserId(updateuser);
                return "updated";
            }
        }
         return "invalid update";

     }

    @GetMapping("usercom5/id/{id}")
    public String getuserbyid(@PathVariable Integer id){
        for(User val:userlist){
            if(val.getUserId().equals(id)){
                 return "exisiting userid"+val;
            }
        }
        return "invalid update";

    }

}

