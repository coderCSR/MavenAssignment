package org.assignment.assignmentmaven;

import lombok.Getter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

@Getter
public class TrackingBufferedReader extends BufferedReader {
    private boolean closed = false;

    public TrackingBufferedReader(Reader in) {
        super(in);
    }

    @Override
    public void close() throws IOException {
        super.close();
        closed = true;
    }

}
