package com.seastar.langchain.core.prompt.base;

import lombok.Data;

@Data
public class StringPromptTemplate {

    private String prompt;

    public StringPromptTemplate(String prompt) {
        this.prompt = prompt;
    }
}
