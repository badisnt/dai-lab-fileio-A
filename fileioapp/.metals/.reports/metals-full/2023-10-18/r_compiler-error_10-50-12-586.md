file:///C:/Users/badis/Desktop/heigvd/daidai/dai-lab-fileio-A/fileioapp/src/test/java/ch/heig/dai/lab/fileio/badisnt/TransformerTest.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

action parameters:
offset: 450
uri: file:///C:/Users/badis/Desktop/heigvd/daidai/dai-lab-fileio-A/fileioapp/src/test/java/ch/heig/dai/lab/fileio/badisnt/TransformerTest.java
text:
```scala
// TODO change this to your own package instead of jehrensb ***
package ch.heig.dai.lab.fileio.badisnt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransformerTest {
    private final String newName = "Jean-Claude Van Damme";
    public final int numWordsPerLine = 3;

    private final Transformer transformer = new Transformer(newName, numWor@@dsPerLine);
        private String testString = "Chuck Norris s’est fait flasher à 280km/h sur l’autoroute. A pied.";

    @Test
    public void replaceChuckTest() {
        String expected = "Jean-Claude Van Damme s’est fait flasher à 280km/h sur l’autoroute. A pied.";
        assertEquals(expected, transformer.replaceChuck(testString));
    }

    @Test
    @Disabled
    public void noReplaceChuckTest() {
        String testString = "Ce texte ne contient pas le nom de Chuck N.";
        assertEquals(testString, transformer.replaceChuck(testString));
    }

    @Test
    @Disabled
    public void capitalizeWordsTest() {
        String expected = "Chuck Norris S’est Fait Flasher À 280km/h Sur L’autoroute. A Pied.";
        assertEquals(expected, transformer.capitalizeWords(testString));
    }

    @Test
    @Disabled
    public void wrapAndNumberLines() {
        String expected = "1. Chuck Norris s’est\n2. fait flasher à\n3. 280km/h sur l’autoroute.\n4. A pied.\n";
        assertEquals(expected, transformer.wrapAndNumberLines(testString));
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