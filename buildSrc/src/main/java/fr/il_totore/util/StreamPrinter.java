package fr.il_totore.util;

import java.io.*;

public class StreamPrinter implements Closeable {

    private Thread thread;
    private Runnable runnable;
    private InputStream inputStream;
    private PrintStream printStream;
    private boolean closed = false;

    public StreamPrinter(InputStream inputStream, PrintStream printStream) {
        this.inputStream = inputStream;
        this.printStream = printStream;
        this.runnable = () -> {
            try {
                String line;
                BufferedReader input = new BufferedReader(new InputStreamReader(inputStream));
                while((line = input.readLine()) != null && !closed) {
                    printStream.println(line);
                }
                close();
                input.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        };
        this.thread = new Thread(runnable);
    }

    @Override
    public void close() throws IOException {
        closed = true;
    }

    public void start(boolean sync) {
        if(sync) {
            runnable.run();
        } else {
            thread.start();
        }
    }
}
