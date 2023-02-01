package pentarealmstech.infogro.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Brand (

     @GeneratedValue(strategy = GenerationType.AUTO)
      @Id
      var id: Long = -1,

      var name: String = ""
){

}