package uz.pdp.fronted;

import uz.pdp.backend.*;

import java.util.Scanner;

public class Web {
    static TodoService todoService=new TodoServiceIMPL();
    public static void main(String[] args) {
        testCreateTodoMethod();
        testGetAllTodoMethod();
        testDeleteTodoMethod();
        testGetAllTodoMethod();
    }

    static void testCreateTodoMethod(){
        Todo todo1=Todo.builder()
                .title("read a book")
                .priority(Priority.high)
                .category(Category.study)
                .build();
        Todo todo2=Todo.builder()
                .title("read a book")
                .build();
        todoService.create(todo1);
        todoService.create(todo2);
    }

    static  void testGetAllTodoMethod(){
        System.out.println("-----------------");
        for (Todo todo : todoService.getAll()) {
            System.out.println(todo);
        }
    }

    static  void testDeleteTodoMethod(){
        final Scanner scanner=new Scanner(System.in);
        System.out.print("Delete id:");
        String id=scanner.nextLine();
        todoService.delete(id);
    }
}
