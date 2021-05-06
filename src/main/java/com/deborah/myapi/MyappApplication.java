package com.deborah.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deborah.myapi.domain.Usuario;
import com.deborah.myapi.repositorys.UsuarioRepository;

@SpringBootApplication
public class MyappApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Deborah Caroline", "deborah", "1234");
		Usuario u2 = new Usuario(null, "Vinicius Rodrigues", "vinicius", "1234");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
