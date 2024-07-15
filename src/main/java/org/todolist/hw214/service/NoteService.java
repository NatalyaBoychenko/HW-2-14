package org.todolist.hw214.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.todolist.hw214.dao.NoteDao;
import org.todolist.hw214.model.Note;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteDao noteDao;

    public List<Note> listAll(){
        return noteDao.listAllNotes();
    }

    public Note add(Note note){
        return noteDao.addNote(note);
    }

    public void deleteById(long id){
        noteDao.deleteNoteById(id);
    }

    public void update(Note note){
        noteDao.updateNote(note);
    }

    public Note getById(long id){
        return noteDao.getNoteById(id);
    }
}
