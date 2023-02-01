package pentarealmstech.infogro.model.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import pentarealmstech.infogro.model.Product


@RepositoryRestResource(collectionResourceRel = "products", path = "products")
interface ProductRepository : CrudRepository<Product, Long> {
}