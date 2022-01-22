package br.com.chataoWeb.chataoWebspring.model.domain;

import lombok.Getter;

@Getter
public enum EMessageType {
    CHAT,
    LEAVE,
    JOIN;

    private EMessageType type;

    public void setType(EMessageType type) {
        this.type = type;
    }
}
