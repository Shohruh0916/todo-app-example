package uz.pdp.backend;

public interface TodoService {

    Todo[] todos=new Todo[100];
    Todo create(Todo todo);
    boolean delete(String id);
    boolean uptade(TodoUpdateDTO dto);
    Todo get(String todoId);
    Todo [] getAll();
}
