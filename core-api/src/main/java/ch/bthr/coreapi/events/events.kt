package ch.bthr.coreapi.events

abstract class BaseEvent<T>(
        open val id:T // val que les getters , si var => getters et setters
)
 data class CustomerCreatedEvent <T>(
         override val id:String,
         val name: String,
         val mail:String
 ):BaseEvent<String>(id)

data class CustomerUpdatedEvent <T>(
        override val id:String,
        val name: String,
        val mail:String
):BaseEvent<String>(id)
