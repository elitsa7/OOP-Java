package OOPLab.WorkingWithAbstraction.StudentSystem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem()
    {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void parseCommand(String[]args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] args = scanner.nextLine().split(" ");
        if ("Create".equals(args[0])){
            this.create(Arrays.stream(args).skip(1).toArray(String[]::new));
        }
        else if ("Show".equals(args[0])) {
            this.show(args[1]);
        }
    }
    public void create(String[] args){
        var name = args[0];
        var age = Integer.parseInt(args[1]);
        var grade =Double.parseDouble(args[2]);
        if (!repo.containsKey(name)) {
            var student = new Student(name, age, grade);
            repo.put(name,student);
        }
    }
    public void show(String name) {
        if (repo.containsKey(name)) {
            var student = repo.get(name);
            System.out.println(student);
        }
    }
}
