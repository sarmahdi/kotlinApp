package pentarealmstech.infogro


import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.web.servlet.config.annotation.CorsRegistry
import pentarealmstech.infogro.model.Product

@Configuration
open class RestConfiguration : RepositoryRestConfigurer {
//    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?, cors: CorsRegistry?) {
//        super.configureRepositoryRestConfiguration(config, cors)
//    }

    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration?, cors: CorsRegistry?) {
        config?.exposeIdsFor(Product::class.java)
        config?.setBasePath("/api");
    }
}