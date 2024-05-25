package main.data;

import main.domain.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUsername(String username);

    class MockUserRepository implements UserRepository {
        @Override
        public Optional<User> findByUsername(String username) {
            if ("art".equals(username)) {
                return Optional.of(
                        new User("art", "123"));
            } else {
                return Optional.empty();
            }
        }
    }
}