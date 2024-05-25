package main.data;

import main.domain.Note;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface NoteRepository {
    List<Note> findAllByUsername(String username);

    void save(Note note);

    class MockNoteRepository implements NoteRepository {
        private List<Note> store = new ArrayList<>(
                List.of(
                        new Note("art", "выучи авто!"),
                        new Note("art", "больше работай!")
                )
        );


        @Override
        public List<Note> findAllByUsername(String username) {
            if ("art".equals(username)) {
                return store;
            }
            return Collections.emptyList();
        }

        @Override
        public void save(Note note) {
            if ("art".equals(note.username())) {
                store.add(note);
            }
        }
    }

}
