package com.littlejava.model;

import java.io.File;

public abstract class NewsReader {
    protected File file;

    public NewsReader(File file) {
        this.file = file;
    }

    public abstract News readNews();
}
