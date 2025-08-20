package com.rookies4.myspringboot.service;

import com.rookies4.myspringboot.controller.dto.UserDTO;
import com.rookies4.myspringboot.entity.UserEntity;
import com.rookies4.myspringboot.exception.BusinessException;
import com.rookies4.myspringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {
    private final UserRepository userRepository;

    //User 등록
    @Transactional
    public UserDTO.UserResponse createUser(UserDTO.UserCreateRequest request) {
        //Email이 중복되면 BizException 발생 시키고 종료
        userRepository.findByEmail(request.getEmail()) //Optional<UserEntity>
                .ifPresent(entity -> {
                    throw new BusinessException("User with this Email already Exist", HttpStatus.CONFLICT);
                });
        //DTO => Entity 로 변환
        UserEntity entity = request.toEntity();
        UserEntity savedEntity = userRepository.save(entity);
        //Entity => DTO로 변환 후 리턴됨
        return new UserDTO.UserResponse(savedEntity);
    }
}
