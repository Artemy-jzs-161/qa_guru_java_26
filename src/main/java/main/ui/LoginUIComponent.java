package main.ui;

import main.data.UserRepository;
import main.domain.User;
import main.service.PasswordEncoder;
import main.service.Session;
import main.service.UserSession;

import javax.swing.*;
import java.util.Optional;

public class LoginUIComponent implements UIComponent {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public LoginUIComponent(UserRepository userRepository,
                            PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public Session render(Session session) {
        final String username = JOptionPane.showInputDialog(
                "username: "
        );
        final String password = JOptionPane.showInputDialog(
                "password: "
        );

        Optional<User> optionalUser = userRepository.findByUsername(username);
        if (optionalUser.isEmpty()) {
            showError();
            return render(session);
        }
        User fromRepository = optionalUser.get();
        if (!fromRepository.isPasswordEquals(
                passwordEncoder.encode(password))) {
            showError();
            return render(session);
        }

        return new UserSession(
                fromRepository
        );
    }

    private void showError() {
        JOptionPane.showMessageDialog(
                null,
                "bad credentials!",
                "error",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
