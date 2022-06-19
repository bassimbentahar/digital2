package ch.bthr.coreapi.commands

import org.axonframework.modelling.command.TargetAggregateIdentifier

abstract class BaseCommand<T>(
        @TargetAggregateIdentifier
        open val id:T // val que les getters , si var => getters et setters
)
 data class CreateCustomerCommand <T>(
         override val id:String,
         val name: String,
         val mail:String
 ):BaseCommand<String>(id)

data class UpdateCustomerCommand <T>(
        override val id:String,
        val name: String,
        val mail:String
):BaseCommand<String>(id)
