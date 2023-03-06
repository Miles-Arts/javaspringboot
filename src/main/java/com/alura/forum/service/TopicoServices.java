package com.alura.forum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alura.forum.repository.TopicoRepository;

@Service
public class TopicoServices {
	
	@Autowired
	private TopicoRepository topicoRespository;

}
