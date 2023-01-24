package beyond_basics

/*
*Let’s create a basic book class, with a title, author, and year. Of course, you could get each of the properties separately.
Create a method that returns both the title and the author as a Pair.
Create a method that returns the title, author and year as a Triple. Use the documentation to find out how to use Triple.
Create a book instance.
Print out the information about the book in a sentence, such as: “Here is your book X written by Y in Z.”
* */

object Constants {
    const val MAX_BORROWED_BOOKS = 3
    const val BASE_URL = "https://library.com/catalog/"
}

data class Book(var title: String, var author: String, var year: Int){
    fun canBorrow(): Boolean {
           // Get the current number of borrowed books for the user
        val currentBorrowedBooks = getCurrentBorrowedBooks()

        if (currentBorrowedBooks >= Constants.MAX_BORROWED_BOOKS) {
            return false
        } else {
            return true
        }
    }
}

fun printUrl() {
        val bookTitle = "Book Title"
        val url = "${Constants.BASE_URL}$bookTitle.html"
        println(url)
    }

    private fun getCurrentBorrowedBooks(): Int {
        // Code to get the current number of borrowed books for the user
        return 0
    }
    
fun retrieveBookDetails(book: Book): Pair<String, String> = Pair(book.title, book.author)
fun retrieveAllBookDetails(book: Book): Triple<String, String, Int> = Triple(book.title, book.author, book.year)

fun main() {
    val purpleHibiscus = Book(title = "Purple Hibiscus", author = "Chimamanda Adichie", 2007)
    val halfOfAYellowSun = Book(title = "Half of a yellow sun", author = "Chimamanda Adichie", 2007)
    val harryPorter = Book(title = "Harry Porter", author = "J.K Rowling", 2002)
    var romeoAndJuliet = Book(title = "Romeo and Juliet", author = "Williams Shakespeare", 1900)
    var hamlet = Book(title = "Hamlet", author = "Williams Shakespeare", 1902)
    var macBeth = Book(title = "Macbeth", author = "Williams Shakespeare", 1902)

//    String deconstruction
    var (title, author, year) = retrieveAllBookDetails(harryPorter)
    println("Author of $title is $author. It was written in $year")

    var books = listOf(purpleHibiscus, harryPorter, halfOfAYellowSun, macBeth, hamlet, romeoAndJuliet)

    var booksByShakespeare = mutableListOf<String>()
    books.filter { book -> book.author == "Williams Shakespeare" }
        .forEach { book -> booksByShakespeare.add(book.title) }


    var library = mapOf("Williams Shakespeare" to booksByShakespeare)
// Checks if hamlet is contained in library
    var isHamlet = library.any { it.value.contains("Hamlet") }
    println(isHamlet)

    val moreBooks = mutableMapOf<String, String>()
    moreBooks["The Great Gatsby"] = "F. Scott Fitzgerald"

    val newBook = "Pride and Prejudice"
    val bookAuthor = moreBooks.getOrPut(newBook) { "Jane Austen" }


}