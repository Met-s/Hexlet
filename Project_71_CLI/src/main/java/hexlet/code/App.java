package hexlet.code;

import java.util.concurrent.Callable;
//import java.util.logging.Logger;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;


@Command(name = "gendiff",
        mixinStandardHelpOptions = true,
        version = "1.0",
        description = "Compares two configuration files and shows a difference.")


public class App implements Callable<String> {
//    static Logger logger = Logger.getLogger(App.class.getName());

    @Option(names = {"-f", "--format"},
            paramLabel = "format",
            defaultValue = "stylish",
            description = "output format [default: stylish]")
    private String format;

    @Parameters(index = "0",
            paramLabel = "filepath1",
            defaultValue = "",
            description = "path to first file")
    String filepath1;

    @Parameters(index = "1",
            paramLabel = "filepath2",
            defaultValue = "",
            description = "path to second file")
    String filepath2;

    @Override
    public String call() throws Exception {

        return "";
    }

    public static void main(String[] args) throws Exception {

        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);

        System.out.println("Hello World!");
//        logger.info("Hello World!");
    }
}

