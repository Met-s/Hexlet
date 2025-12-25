package hexlet.code.reflection;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Commands {

    private final Map<String, String> availableCommands;

    public Commands() {
        this.availableCommands = new HashMap<>();
        var methods = this.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Cmd.class)) {
                Cmd cmdInfo = method.getAnnotation(Cmd.class);
                availableCommands.put(cmdInfo.name(), cmdInfo.description());
            }
        }
    }

    @Cmd(name = "Exit", description = "ExitApplication")
    public void exit() {
        System.out.println("exit");
    }

    @Cmd(name = "Help", description = "Show all available commands")
    public void printHelp() {
        StringBuilder builder = new StringBuilder();
        availableCommands.forEach((key, value) -> builder.append(key).append(": ").append(value).append("\n"));
        System.out.println(builder);
    }

    @Cmd(name = "run", description = "Run the application")
    public void run() {
        System.out.println("run");
    }
}
