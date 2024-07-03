package org.assignment.assignmentmaven;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class TryWithResourcesTest {
    @Test
    public void testResourceClosed() {
        String filePath = Paths.get("src", "main", "resources", "test.txt").toString();
        TrackingBufferedReader br = null;
        try {
            br = new TrackingBufferedReader(new FileReader(filePath));
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                    assertTrue(br.isClosed());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
