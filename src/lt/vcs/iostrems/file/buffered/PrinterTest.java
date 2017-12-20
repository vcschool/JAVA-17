package lt.vcs.iostrems.file.buffered;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.*;

public class PrinterTest {
    @Test
    public void test() {
        //given
        Printer printer = new Printer();
        //when
        printer.copyFile("doyourbest.txt", "bimbam.txt");
        //then
        try {
            new FileReader("bimbam.txt");
        } catch (FileNotFoundException e) {
            Assert.fail("File not found");
        }

    }
}