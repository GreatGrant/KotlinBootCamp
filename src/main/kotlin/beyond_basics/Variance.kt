package beyond_basics

fun main(){
    // valid
    val adminComp: Comparable<AdministrativeUser> = userComperator

    // Invalid
//    val userComp: Comparable<User> = adminComparator
}
open class User(id: Int)
class NormalUser(): User(1)
class AdministrativeUser(): User(2)

val adminComparator: Comparable<AdministrativeUser> = object : Comparable<AdministrativeUser>{
    override fun compareTo(other: AdministrativeUser): Int {
        return 1
    }
    }

val userComperator: Comparable<User> = object: Comparable<User>{
    override fun compareTo(other: User): Int {
        return 1
    }


}