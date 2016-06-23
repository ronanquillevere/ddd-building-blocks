# ddd-building-blocks
A set of interfaces and classes to ease DDD implementation

* DomainEvent
* Entity
* Factory
* Repository
* Service
* ValueObject

Note that I beleive that <b>aggregate</b> and <b>aggregate roots</b> do not need any explicite interface. The aggregate root should be an entity providing access to the rest of the aggregate objects (either Value Objects or Entities). 
