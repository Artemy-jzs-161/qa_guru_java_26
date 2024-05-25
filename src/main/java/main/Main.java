package main;

import main.data.FileUserRepository;
import main.data.NoteRepository;
import main.data.UserRepository;
import main.service.Base64PasswordEncoder;
import main.service.PasswordEncoder;
import main.service.Session;
import main.ui.LoginUIComponent;
import main.ui.MainUIComponent;
import main.ui.UIContainer;

import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new UIContainer(
                new LoginUIComponent(new FileUserRepository(
                        Path.of("users.csv")
                ),
                                     new Base64PasswordEncoder()
                ),
                new MainUIComponent(new NoteRepository.MockNoteRepository())
        ).render(
                new Session.EmptySession()
        );
    }
}
