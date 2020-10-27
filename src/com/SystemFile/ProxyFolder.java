package com.SystemFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProxyFolder implements FileComponent, FolderComponent {

    private Folder folder;
    private String folderName;

    public ProxyFolder(String folderName)
    {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9.]*");
        Matcher matcher = pattern.matcher(folderName);

        if(!matcher.matches())
            throw new RuntimeException("Zla nazwa folderu " + folderName);

        this.folderName = folderName;
    }

    @Override
    public void tree(String indent)
    {
        if(folder == null)
            folder = new Folder(folderName);

        folder.tree(indent);
    }

    @Override
    public String getName()
    {
        return folderName;
    }

    @Override
    public void addFileComponent(FileComponent fc)
    {
        if(folder == null)
            folder = new Folder(folderName);

        folder.addFileComponent(fc);
    }

    @Override
    public void removeFileComponent(FileComponent fc)
    {
        if(folder == null)
            folder = new Folder(folderName);

        folder.removeFileComponent(fc);
    }

    @Override
    public void ls()
    {
        if(folder == null)
            folder = new Folder(folderName);

        folder.ls();
    }
}
