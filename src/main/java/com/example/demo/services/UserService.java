package com.example.demo.services;

import com.example.demo.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
    UserDto getUser(String email);
    UserDto getUserByUserId(String userId);
    UserDto updateUser(String userId, UserDto user);
    void deleteUser(String userId);

//    List<UserDto> getUsers(int page, int limit);
//    boolean verifyEmailToken(String token);
//    boolean requestPasswordReset(String email);
//    boolean resetPassword(String token, String password);

}
