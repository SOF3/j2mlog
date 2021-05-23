import j2mlog.Links;
import j2mlog.Print;
import j2mlog.ProcessorLoop;

public class HelloWorld {
    @ProcessorLoop
    public static void loop() {
        Print.write("Hello world!");
        Print.flush(Links.byName("message1"));
    }
}
