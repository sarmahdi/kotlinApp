package pentarealmstech.infogro.model

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass

@MappedSuperclass
open class NamedEntity : BaseEntity() {

    @Column(name = "name")
    open var name: String? = null

    override fun toString(): String =
        this.name ?: ""

}