package uz.pdp.fronted;

import uz.pdp.backend.*;

import java.util.Scanner;

public class Web {
    static TodoService todoService=new ATodo();
    public static void main(String[] args) {
        testCreateTodoMethod();
        testGetAllTodoMethod();
        testDeleteTodoMethod();
        testUptadeTodoMethod();
        testGetAllTodoMethod();
    }

    static void testCreateTodoMethod(){
        Todo todo1=Todo.builder()
                .title("read a book 1")
                .priority(Priority.high)
                .category(Category.study)
                .build();
        Todo todo2=Todo.builder()
                .title("read a book 2")
                .build();
        Todo todo3=Todo.builder()
                .title("read a book 3")
                .build();
        todoService.create(todo1);
        todoService.create(todo2);
        todoService.create(todo3);
        todoService.create(todo1);
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

    static  void testUptadeTodoMethod(){
        final Scanner scanner=new Scanner(System.in);
        System.out.print("id:");
        String id=scanner.nextLine();
        todoService.delete(id);
        System.out.println("title:");
        String title=scanner.nextLine();
        TodoUpdateDTO dto=new TodoUpdateDTO(id,title);
        todoService.uptade(dto);

    }
}
