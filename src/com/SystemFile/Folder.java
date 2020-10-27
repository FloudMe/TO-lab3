package com.SystemFile;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Folder implements FileComponent, FolderComponent {
    private String name;
    private List<FileComponent> contents;

    public Folder(String name)
    {
        this.name = name;
        this.contents = new ArrayList<>();
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void tree(String indent)
    {
        indent +=indent;
        System.out.println(indent + name);
        for(FileComponent fileComponent: contents)
            fileComponent.tree(indent);

    }

    @Override
    public void addFileComponent(FileComponent fc)
    {
        if(!contents.contains(fc)){
            contents.add(fc);
        }
    }

    @Override
    public void removeFileComponent(FileComponent fc)
    {
        contents.remove(fc);
    }

    @Override
    public void ls()
    {
        for(FileComponent fileComponent: contents)
            System.out.println(fileComponent.getName());
    }

}
