package com.br.study.graphql;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.study.model.User;
import com.br.study.service.UserService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class UserGraphQL implements GraphQLMutationResolver, GraphQLQueryResolver {

	@Autowired
    private UserService userService;

    public Optional<User> findUser(String email) {
        return this.userService.findUserByEmail(email);
    }

    public User createUser(User user) {
        return this.userService.create(user);
    }
}
