package en;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Env {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("echo", "Hexlet!");
        Map<String, String> env = pb.environment();
        env.put("FOO", "BARS");

        Process p = pb.start();
        System.out.println(p);


//        ProcessBuilder pb = new ProcessBuilder("set.sh", "myArg1", "myArg2");
//        Map<String, String> env = pb.environment();
//        env.put("VAR1", "myValue");
//        env.remove("OTHERVAR");
//        env.put("VAR2", env.get("VAR1") + "suffix");
//        pb.directory(new File("myDir"));
//        Process p = pb.start();

    }
}
