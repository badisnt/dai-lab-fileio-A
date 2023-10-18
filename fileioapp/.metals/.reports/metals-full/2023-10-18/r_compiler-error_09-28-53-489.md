file:///C:/Users/badis/Desktop/heigvd/daidai/dai-lab-fileio-A/fileioapp/src/test/java/ch/heig/dai/lab/fileio/badisnt/FileExplorerTests.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

action parameters:
offset: 429
uri: file:///C:/Users/badis/Desktop/heigvd/daidai/dai-lab-fileio-A/fileioapp/src/test/java/ch/heig/dai/lab/fileio/badisnt/FileExplorerTests.java
text:
```scala
// TODO change this to your own package instead of jehrensb ***
package ch.heig.dai.lab.fileio.badisnt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.File;
import java.io.IOException;
import java.util.Set;

public class FileExplorerTests {

    @Test
    @Disabled
    public void getNewFilesTest() throws IOException {
    @@    // Create a temporary directory under the default temp directory using java.io.File

        File tempDir = new File(System.getProperty("java.io.tmpdir"), Long.toString(System.nanoTime()));
        tempDir.mkdir();
        tempDir.deleteOnExit();

        // Create a FileExplorer for that directory
        FileExplorer explorer = new FileExplorer(tempDir.toString());

        // Check that no files are found
        assertEquals(explorer.getNewFile(), null);
        
        // Create some files in the directory and check that they are found
        Set<File> expectedFiles = Set.of(
            new File(tempDir, "file1.txt"),
            new File(tempDir, "file2.txt"),
            new File(tempDir, "file3.txt")
        );
        for (File file : expectedFiles) { file.createNewFile(); }
        Set<File> actualFiles = Set.of(
            explorer.getNewFile(),
            explorer.getNewFile(),
            explorer.getNewFile()
        );
        assertEquals(expectedFiles, actualFiles);

        // Check that no files are found
        assertEquals(explorer.getNewFile(), null);

        // Create some files in the directory and check that they are found
        expectedFiles = Set.of(
            new File(tempDir, "file4.txt"),
            new File(tempDir, "file5.txt")
        );
        for (File file : expectedFiles) { file.createNewFile(); }
        actualFiles = Set.of(
            explorer.getNewFile(),
            explorer.getNewFile()
        );
        assertEquals(expectedFiles, actualFiles);
    }
}
```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:34)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:329)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator