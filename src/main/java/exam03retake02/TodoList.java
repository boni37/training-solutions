package exam03retake02;

import java.util.*;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public TodoList() {
    }

    public TodoList(List<Todo> todos) {
        this.todos = todos;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public int getNumberOfItemsLeft() {
        int sum = 0;
        for(Todo actual: todos){
            if(actual.getState()!= State.NON_COMPLETED){
                sum+=1;
            }
        }return sum;
    }

    public List<String> getMostImportantTodosText() {
        List<String> result = new ArrayList<>();
        Collections.sort(todos, new Comparator<Todo>() {
            @Override
            public int compare(Todo o1, Todo o2) {
                return Integer.compare(o1.getPriority(),o2.getPriority());
            }
        });
        if(todos.get(0).getPriority()==1){
            for(Todo actual:todos){
                if(actual.getPriority()==1){
                    result.add(actual.getText());
                }
            }
        }else if(todos.get(0).getPriority()==2){
            for(Todo actual:todos){
                if(actual.getPriority()==2){
                    result.add(actual.getText());
                }
            }
        }
        return result;
    }

    public void deleteCompleted() {
        for(int i=0; i< todos.size();i++){
            if(todos.get(i).getState() == State.COMPLETED){
                todos.remove(todos.get(i));
            }
        }
    }

    public void addTodo(Todo doing) {
        todos.add(doing);
    }




}
