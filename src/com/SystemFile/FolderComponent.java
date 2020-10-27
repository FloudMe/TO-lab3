package com.SystemFile;

public interface FolderComponent {
    void addFileComponent(FileComponent fc);
    void removeFileComponent(FileComponent fc);
    void ls();
}
