package br.com.chataoWeb.chataoWebspring.model.entity;

import br.com.chataoWeb.chataoWebspring.model.domain.EMessageType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

	private String content;
	private String sender;
	private EMessageType type;
}
