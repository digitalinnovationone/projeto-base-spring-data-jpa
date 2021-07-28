package one.digitalinnovation.springdata.sql.controller.livros;

import java.util.Collections;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import one.digitalinnovation.springdata.sql.config.OpenApiConfig;
import one.digitalinnovation.springdata.sql.controller.livros.dto.LivroDto;

@Tag(name = OpenApiConfig.TAG_LIVROS)
@RestController
@RequestMapping("livros")
public class LivrosRestController {

	@GetMapping
	public ResponseEntity<List<LivroDto>> buscarTodos() {
		return ResponseEntity.ok(Collections.emptyList());
	}

	@GetMapping("/{id}")
	public ResponseEntity<LivroDto> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.noContent().build();
	}

	@PostMapping
	public ResponseEntity<LivroDto> inserir(@RequestBody LivroDto dto) {
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<LivroDto> atualizar(@PathVariable Long id, @RequestBody LivroDto dto) {
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		return ResponseEntity.ok().build();
	}
}
