package org.codingame.utils;

import org.junit.Test;

import java.io.File;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Test for {@link MergeFiles}
 */
public class MergeFilesTest {

    private static final String TEST_TEMPLATE = "TestTemplate";
    private static final String SOURCE_DIRECTORY = "testsourcedir";
    private static final String OUTPUT_FILE = "Player.java";

    @Test
    public void output_file_should_exist() throws Exception {
        MergeFiles mergeFiles = new MergeFiles();
        mergeFiles.mergeFilesWithTemplate(TEST_TEMPLATE, SOURCE_DIRECTORY, OUTPUT_FILE);

        File outputFile = new File(OUTPUT_FILE);
        assertThat("Output file exists", outputFile.exists(), is(true));
    }
}