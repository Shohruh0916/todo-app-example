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
        int deletingIndex = getTodoIndexByTodoID(todoID);
        if(deletingIndex!=-1){
            for(int i=deletingIndex; i<index; i++){
                todos[i]=todos[i+1];
                index--;
            }
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean uptade(TodoUpdateDTO dto) {
        String totdoId= dto.id();
        int todoIndex=getTodoIndexByTodoID(totdoId);
        if(todoIndex!=-1){
            Todo todo=todos[todoIndex];
            todo.setTitle(dto.title());
            todos[todoIndex]=todo;
            return true;
        }
        return false;
    }

    @Override
    public Todo get(String todoId) {
        return null;
    }

    @Override
    public Todo[] getAll() {
        return Arrays.copyOf(todos,index+1);
    }


    private int getTodoIndexByTodoID(String todoID) {
        for(int i=0; i<index; i++){
            Todo todo=todos[i];
            if(todo.getId().equals(todoID)){
               return i;
            }
        }
        return -1;
    }
}
