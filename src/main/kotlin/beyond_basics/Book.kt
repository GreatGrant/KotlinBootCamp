package beyond_basics

/*
*Let’s create a basic book class, with a title, author, and year. Of course, you could get each of the properties separately.
Create a method that returns both the title and the author as a Pair.
Create a method that returns the title, author and year as a Triple. Use the documentation to find out how to use Triple.
Create a book instance.
Print out the information about the book in a sentence, such as: “Here is your book X written by Y in Z.”
* */
data class Book(var title: String, var author: String, var year: Int)

fun retrieveBookDetails(book: Book): Pair<String, String> = Pair(book.title, book.author)
fun retrieveAllBookDetails(book: Book): Triple<String, String, Int> = Triple(book.title, book.author, book.year)

fun main(){
    val book = Book(title = "Harry Porter", author = "J.K Rowling", 2002)
    var (title, author, year) = retrieveAllBookDetails(book)
    println("Author of $title is $author. It was written in $year")
}