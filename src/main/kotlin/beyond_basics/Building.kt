package beyond_basics
/**
 * Create a new package and file and call them Buildings.
 * Create a class BaseBuildingMaterial with a property numberNeeded that is set to 1. You always need 1 of the base material.
 * Create two subclasses, Wood and Brick. For BaseBuildingMaterial you need 4 units of wood or 8 units of brick. Now you have a type hierarchy.
 * Create a generic class Building that can take any building material as its argument, and only building materials.
 * A building always requires 100 base materials. Add a property baseMaterialsNeeded and set it to 100.
 * Add another property, actualMaterialsNeeded and use a one-line function to calculate this from numberNeeded of the passed-in material.
 * Add a method build() that prints the type and number of materials needed.
 *
 * Hint: Use reflection to get the class and simple name: instance::class.simpleName
 * Create a main function and make a building using Wood.
 *
 * If you did this correctly, running main() will print something like “400 Wood required”.
 * **/
abstract class BaseBuildingMaterial(var numberNeeded: Int = 1)

class Wood(): BaseBuildingMaterial(numberNeeded = 4)
class Brick(): BaseBuildingMaterial(numberNeeded = 8)

class Building<T: BaseBuildingMaterial>(buildingMaterial: T){
    private val baseMaterialsNeeded = 100
    private var actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded
    init {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun main(){
    Building(Wood())
}