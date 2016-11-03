package com.hmrc.cftf.services.documentum;

import com.hmrc.cftf.services.common.AbstractCoreService;
import com.hmrc.cftf.services.common.ContentServiceException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;

/**
 * Created by anilhemnani on 14/09/2016.
 */
public class DocumentumPublisherService extends AbstractCoreService<String, String> {

    private static final String lineSep = System.getProperty("line.separator");
    public String execute(String input) {
        try {
            String fileName = writeFile(input.getBytes());
            System.out.println("Publishing document "+fileName);
            System.out.println("Content of the file is "+lineSep+input);
            return fileName;
        }catch (Exception e){
            throw new ContentServiceException("Failed to publish content", e);
        }
    }

    private String writeFile(byte[] content)throws Exception{
        File f = new File(""+System.currentTimeMillis()+".txt");
        FileOutputStream fw = new FileOutputStream(f);
        fw.write(content);
        fw.flush();
        fw.close();
        return f.getAbsolutePath();
    }

}
