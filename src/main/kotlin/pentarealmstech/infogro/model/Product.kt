package pentarealmstech.infogro.model

import jakarta.persistence.*


@Entity
@Table(name = "products")
data class Product(

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
     var id: Long = -1,

    var name: String = "",

    @ManyToOne
    @JoinColumn(name = "brand_id")
    var brandId: Brand? = null,


    @ManyToOne
    @JoinColumn(name = "type_id")
    var type: ProductType? = null,

    var sku: String = "",

    var barcode: String = "",

    var ingredients: List<String>,

    var powerAccessible: Boolean = true,

    var internetReliability: Short = 3, // 1-5
    val brand: String

) {
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Product
//
//        if (id != other.id) return false
//        if (name != other.name) return false
//        if (brand != other.brand) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = id.hashCode()
//        result = 31 * result + name.hashCode()
//        result = 31 * result + brand.hashCode()
//        return result
//    }
}