package com.david.demo;
import com.david.demo.controllers.InformacionAprendiz;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/aprendiz")
	public InformacionAprendiz messageView(){
             return new InformacionAprendiz(LocalDateTime.now(),"Oscar David",
					 "Gallego García", "2675793", "Análisis y desarrollo de software",
					 "Evidencia java en spring", "Pereira-colombia");
	}
}


