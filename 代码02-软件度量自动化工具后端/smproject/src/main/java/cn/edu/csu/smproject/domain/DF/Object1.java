package cn.edu.csu.smproject.domain.DF;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Object1 {
    @JacksonXmlProperty(namespace = "o",localName = "Process")
    private Process process;

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }
}
