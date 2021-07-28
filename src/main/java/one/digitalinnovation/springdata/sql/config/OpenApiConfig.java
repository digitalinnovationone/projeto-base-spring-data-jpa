package one.digitalinnovation.springdata.sql.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;

/**
 * @see <a href="https://stackoverflow.com/a/49029740/3072570">Open API 3 Config Reference</a>
 */
@Configuration
public class OpenApiConfig {

    public static final String TAG_LIVROS = "Livros";

    @Autowired
    BuildProperties buildProperties;
    
    @Bean
    public OpenAPI customOpenAPI() {
        final Info info = new Info()
                .title("API do Projeto Base Spring Data JPA")
                .description("API no Estilo Arquitetural REST para o Projeto Base Spring Data JPA.")
                .version(buildProperties.getVersion());

        return new OpenAPI().components(new Components())
                .addTagsItem(createTag(TAG_LIVROS, "Operações do domínio de livros."))
                .info(info);
    }

    private Tag createTag(String name, String description) {
        final Tag tag = new Tag();
        tag.setName(name);
        tag.setDescription(description);
        return tag;
    }

}
