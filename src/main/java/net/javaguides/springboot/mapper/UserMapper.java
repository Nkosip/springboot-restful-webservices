package net.javaguides.springboot.mapper;

import net.javaguides.springboot.dto.UserDto;
import net.javaguides.springboot.entity.User;

public class UserMapper {

    //convert a User JPA entity into UserDto
    public static UserDto mapToUserDto(User user) {

        return new UserDto(

                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()

        );

    }

    //convert UserDto into User JPA entity
    public static User mapToUser(UserDto userDto) {

        return new User(

                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()

        );

    }
}
