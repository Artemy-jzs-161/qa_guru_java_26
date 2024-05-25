package main.service;

import main.domain.User;

public interface Session {
    User unwrap();

    class EmptySession implements Session {
        @Override
        public User unwrap() {
            return null;
        }
    }
}
