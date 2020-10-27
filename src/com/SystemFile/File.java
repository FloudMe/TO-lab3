package com.SystemFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class File implements FileComponent
{
    private String name, data;

    public File(String name, String data)
    {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9.]*");
        Matcher matcher = pattern.matcher(name);

        if(!matcher.matches())
            throw new RuntimeException("Zla nazwa pliku " + name);


        this.name = name;
        this.data = data;
    }

    public String getName()
    {
        return name;
    }

    public String getData()
    {
        return data;
    }

    @Override
    public void tree(String indent)
    {
        indent += indent;
        System.out.println(indent + name);
    }

    public void more()
    {
        System.out.println(data);
    }
}
