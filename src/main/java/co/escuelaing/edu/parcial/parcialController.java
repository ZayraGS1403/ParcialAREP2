
package co.escuelaing.edu.parcial;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class parcialController {

	public static void main(String[] args) {
		SpringApplication.run(parcialController.class, args);
	}

    @GetMapping("/primos")
	public ResponseEntity<Map<String, Object>> obtenPrimos(@RequestParam(name = "x") int x) {
		List<Integer> primos = new ArrayList<>();
		for (int i = 2; i <= x; i++) {
			if (esPrimo(i)) {
				primos.add(i);
			}
		}

        

}