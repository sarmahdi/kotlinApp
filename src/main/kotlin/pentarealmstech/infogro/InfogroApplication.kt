package pentarealmstech.infogro


import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import pentarealmstech.infogro.model.Product
import pentarealmstech.infogro.model.repository.ProductRepository

@SpringBootApplication
//@EntityScan("pentarealmstech.infogro.model")
//@EnableJpaRepositories("pentarealmstech.infogro.model.repository")

class InfogroApplication


@Bean
fun run(repository: ProductRepository) = ApplicationRunner {

    repository.save(
        Product(

            name = "product1",
            sku = "3039 SE Stark St, Portland, OR 97214",
            barcode = "555-111-4444",
            brand = "brand1",
            powerAccessible = true,
            internetReliability = 5,
                    ingredients = listOf("Sugar","water")
        )
    )

    repository.save(
        Product(
            name = "Product2",
            sku = "221 W N Loop Blvd, Austin, TX 78751",
            barcode = "555-111-2424",
            brand = "brand1",
            powerAccessible = true,
            internetReliability = 3,
            ingredients = listOf("Sugar","Salt")

        )
    )

}

fun main(args: Array<String>) {
    runApplication<InfogroApplication>(*args)
}
