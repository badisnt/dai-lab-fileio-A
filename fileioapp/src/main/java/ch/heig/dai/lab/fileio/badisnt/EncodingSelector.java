package ch.heig.dai.lab.fileio.badisnt;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EncodingSelector {

    /**
     * Get the encoding of a file based on its extension.
     * The following extensions are recognized:
     *   - .utf8:    UTF-8
     *   - .txt:     US-ASCII
     *   - .utf16be: UTF-16BE
     *   - .utf16le: UTF-16LE
     * 
     * @param file the file to get the encoding from
     * @return the encoding of the file, or null if the extension is not recognized
     */
    public Charset getEncoding(File file) {
        String filename = file.getName();
        int lastIndexOfDot = filename.lastIndexOf(".");
        if(lastIndexOfDot==-1)
            return null;
        String extension = filename.substring(lastIndexOfDot);
        switch(extension){
            case ".utf8":
                return StandardCharsets.UTF_8;
            case ".txt":
                return StandardCharsets.US_ASCII;
            case ".utf16be":
                return StandardCharsets.UTF_16BE;
            case ".utf16le":
                return StandardCharsets.UTF_16LE;
            default:
                return null;    
        }
    }
}