package uz.pdp.backend;

import java.util.Arrays;

public class ATodo implements TodoService{
    private int index=0;
    @Override
    public Todo create(Todo todo) {
        todo.setId(Utils.generateUniqueID());
        todos[index]=todo;
        index+=1;
        return null;
    }

    @Override
    public boolean delete(String todoID) {
        for(int i=0; i< todos.length; i++){
            Todo todo=todos[i];
            if(todo.getId().equals(todoID)){
                todos[i]=null;
                index--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean uptade(Todo todo) {
        return false;
    }

    @Override
    public Todo get(String todoId) {
        return null;
    }

    @Override
    public Todo[] getAll() {
        return Arrays.copyOf(todos,index);
    }
}
