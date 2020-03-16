/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utility;

/**
 *
 * @author Aarima
 */


import java.io.File;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUploader {

    public String uploadFile(HttpServletRequest request, ServletContext context, String target) {
        String imagepath = "";
        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        List items = null;
        try {
            items = upload.parseRequest(request);
        } catch (FileUploadException e) {
            System.out.println(e);
        }
        Iterator itr = items.iterator();
        while (itr.hasNext()) {
            FileItem item = (FileItem) itr.next();
            try {
                String photo = item.getName();
                imagepath = target + "/" + photo;
                File savedFile = new File(context.getRealPath("/") + imagepath);
                item.write(savedFile);

            } catch (Exception e) {
                System.out.println(e);
            }

        }
        return imagepath;
    }
}
