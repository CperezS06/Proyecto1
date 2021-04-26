package com.ks.example.spring;

import com.ks.example.spring.repositorio.AlumnoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication implements ApplicationRunner {


	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);

	}

	@Override
	public void run(ApplicationArguments args) throws Exception{
		/*alumnoRepo.findAll();
		//GUARDAR
		Alumno alumno = alumnoRepo.save(new Alumno("cesar",27,3,8.7));
		System.out.println(alumnoRepo.findAll().toString());
		alumnoRepo.existsById(1);
		//ACTUALIZAR
		alumno.setCalif(10d);
		alumno.setGrade(6);
		alumnoRepo.save(alumno);
		System.out.println(alumnoRepo.findAll().toString());
		//ELIMINAR
		System.out.println(alumnoRepo.findAll().toString());*/
	}


}
