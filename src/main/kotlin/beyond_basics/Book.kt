package beyond_basics


/***************************************************************************/
object Constants {
    const val MAX_BORROWED_BOOKS = 3
    const val BASE_URL = "https://library.com/catalog/"
}

/******************************* Model Book Class **************************************/
data class Book(var title: String, var author: String, var year: Int, var pages: Int){
    fun canBorrow(): Boolean {
           // Get the current number of borrowed books for the user
        val currentBorrowedBooks = getCurrentBorrowedBooks()

        if (currentBorrowedBooks >= Constants.MAX_BORROWED_BOOKS) {
            return false
        } else {
            return true
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
    


}

/********************** Extension function on Book class ************************/
    fun Book.weight() = this.pages * 1.5

    fun Book.tornPages(pagesTorn: Int) = this.pages.minus(pagesTorn)


 /************************* Class utilising extension functions from Book ****************/
    class Puppy{
        fun playWithBook(book: Book){
            var tornPages = (1..book.pages).random()            
            book.tornPages(tornPages)
            println("Puppy played with the book and tore $tornPages, now the book has ${book.pages} pages left.")

        }
    }

/*********************************************************************************/
fun main() {

              /************Sample Books ***********/
    val purpleHibiscus = Book(title = "Purple Hibiscus", author = "Chimamanda Adichie", 2007, 307)
    val halfOfAYellowSun = Book(title = "Half of a yellow sun", author = "Chimamanda Adichie", 2007, 400)
    val harryPorter = Book(title = "Harry Porter", author = "J.K Rowling", 2002, pages = 320)
    var romeoAndJuliet = Book(title = "Romeo and Juliet", author = "Williams Shakespeare", 1900, pages = 200)
    var hamlet = Book(title = "Hamlet", author = "Williams Shakespeare", 1902, pages =265)
    var macBeth = Book(title = "Macbeth", author = "Williams Shakespeare", 1902, pages = 322)

    
    var bingo = Puppy()
    while(macBeth.pages>0){
        bingo.playWithBook(macBeth)
    }
    
    

    // function using string deconstruction
    fun retrieveBookDetails(book: Book): Pair<String, String> = Pair(book.title, book.author)
    fun retrieveAllBookDetails(book: Book): Triple<String, String, Int> = Triple(book.title, book.author, book.year)


//    String deconstruction
    var (title, author, year) = retrieveAllBookDetails(harryPorter)
    println("Author of $title is $author. It was written in $year")

    var books = listOf(purpleHibiscus, harryPorter, halfOfAYellowSun, macBeth, hamlet, romeoAndJuliet)

    
    var booksByShakespeare = mutableListOf<String>()
    
    // Object filtering
    books.filter { book -> book.author == "Williams Shakespeare" }
        .forEach { book -> booksByShakespeare.add(book.title) }

    //Maps author to his books
    var library = mapOf("Williams Shakespeare" to booksByShakespeare)
    
    /********************* Checks if hamlet is contained in library *********************/ 
    var isHamlet = library.any { it.value.contains("Hamlet") }
    println(isHamlet)

    val moreBooks = mutableMapOf<String, String>()
    moreBooks["The Great Gatsby"] = "F. Scott Fitzgerald"

    val newBook = "Pride and Prejudice"
    val bookAuthor = moreBooks.getOrPut(newBook) { "Jane Austen" }

    }