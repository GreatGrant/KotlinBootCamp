package OOP

open class Book(val title: String, val author: String){
    private var currentPage = 1

    open fun readPage() = currentPage++
}

class Ebook(var wordCount: Int = 0): Book("", ""){
    override fun readPage(): Int { return wordCount+250 }
}

fun main(){
    val harryPorter = Book("Harry Porter", "J.K Rowling")
    print("Reading ${harryPorter.title} ${harryPorter.readPage()}")
}