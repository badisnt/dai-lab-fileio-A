file:///C:/Users/badis/Desktop/heigvd/daidai/dai-lab-fileio-A/fileioapp/src/test/java/ch/heig/dai/lab/fileio/badisnt/EncodingSelectorTest.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

action parameters:
offset: 1047
uri: file:///C:/Users/badis/Desktop/heigvd/daidai/dai-lab-fileio-A/fileioapp/src/test/java/ch/heig/dai/lab/fileio/badisnt/EncodingSelectorTest.java
text:
```scala
// TODO change this to your own package instead of jehrensb ***
package ch.heig.dai.lab.fileio.badisnt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.File;
import java.nio.charset.StandardCharsets;

public class EncodingSelectorTest {

    private final EncodingSelector selector = new EncodingSelector();

    @Test
    public void encodingTest() {
        assertEquals (StandardCharsets.UTF_8, selector.getEncoding(new File("file1.utf8")));
        assertEquals (StandardCharsets.US_ASCII, selector.getEncoding(new File("file1.txt")));
        assertEquals (StandardCharsets.UTF_16BE, selector.getEncoding(new File("file1.utf16be")));
        assertEquals (StandardCharsets.UTF_16LE, selector.getEncoding(new File("file1.utf16le")));
    }

    @Test
    public void nullTest() {
        assertEquals (null, selector.getEncoding(new File("file1.utf")));
        assertEquals (null, selector.getEncoding(new File("file1")));
    }

    @Test@@
    public void dotsTests() {
        assertEquals (StandardCharsets.UTF_8, selector.getEncoding(new File("file1.txt.utf8")));
        assertEquals (StandardCharsets.US_ASCII, selector.getEncoding(new File("file1.utf8.txt")));
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
	scala.meta.internal.pc.completions.CompletionProvider.completions(CompletionProvider.scala:46)
	scala.meta.internal.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:123)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator