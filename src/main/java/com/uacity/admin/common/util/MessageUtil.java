package com.uacity.admin.common.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by eegijmc on 7/11/2016.
 */
public class MessageUtil {

    public static String getMessage(String fileName) {
        String path = MessageUtil.class.getResource("/rest").getPath() + fileName + ".json";
        File file = new File(path);
        String content = null;
        try {
            content = FileUtils.readFileToString(file, "UTF-8");
        } catch (IOException e) {

        }
        return content;
    }

}
