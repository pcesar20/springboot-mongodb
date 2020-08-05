package com.pc.mongosb.dto;

import java.util.Date;

public class CommentDTO {
	private String text;
	private Date  data;
	private AuthorDTO autor;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String text, Date data, AuthorDTO autor) {
		this.text = text;
		this.data = data;
		this.autor = autor;
	}
	
	
}
