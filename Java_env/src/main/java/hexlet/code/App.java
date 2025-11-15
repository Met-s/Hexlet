package hexlet.code;

//import java.io.File;
//import static hexlet.code.Constants.CORRECT_ANSWERS;
//import static hexlet.code.Config.SONAR_TOKEN;
//import java.util.Properties;
import java.io.IOException;
import java.util.Map;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.lang.Process;
//import java.lang.ProcessBuilder;



public class App {
    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder pb = new ProcessBuilder();
        Map<String, String> env = pb.environment();
        env.put("SONAR_T", "56845554477");
//        Process p = pb.start();
        String gets = env.get("SONAR_T");
        System.out.println(gets);

// -----------------------------------------
//        ProcessBuilder pb = new ProcessBuilder("myCommand");
//        Map&lt;String, String&gt;
//        env = pb.environment();
//        env.put("VAR1", "myValue");

// -----------------------------------------
//        // Create a ProcessBuilder object.
//        ProcessBuilder processBuilder = new ProcessBuilder(
//                "echo", "Hello, Hexlet!");
//
//        // Start the process.
//        Process process = processBuilder.start();
//        System.out.println(process);
//
//        // Get the output stream of the process.
//        InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream());
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//        // Read the output of the process and print it to the console.
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
//
//        // Close the buffered reader.
//        bufferedReader.close();
//
//        // Wait for the process to finish.
//        process.waitFor();

// -----------------------------------------
        System.out.println("Hello world!");
//
//        ProcessBuilder pb = new ProcessBuilder("VAR");
//        Map<String, String> env = pb.environment();
//        env.put("VAR1", "myValue");
//        env.remove("OTHERVAR");
//        env.put("VAR2", env.get("VAR1") + "suffix");
//        pb.directory(new File("hexlet.code.file.txt"));
//        Process p = pb.start();
//
//        System.out.println(p);
// -----------------------------------------
//        System.out.println(SONAR_TOKEN);
//
//        Properties prop = new Properties();
//        prop.load(App.class.getClassLoader().getResourceAsStream("Config.properties"));
//        System.out.println(prop.getProperty("token"));
    }
}
