package OOP

open class Book(val title: String, val author: String) {
    private var _currentPage = 0

        var currentPage: Int
            get() = _currentPage
            set(value) {_currentPage = value}

    open fun readPage() {
        currentPage++
    }
}

class Ebook(
    title: String,
    author: String,
    var format: String = "text"
) : Book(title, author) {
    private var _currentWordCount = 0

    var currentWordCount: Int
        get() = _currentWordCount
        set(value) {
            _currentWordCount = value
        }

    override fun readPage() {
        currentWordCount += 250
    }
}

fun main() {
    val book = Book("The Great Gatsby", "F. Scott Fitzgerald")
    val ebook = Ebook("The Great Gatsby", "F. Scott Fitzgerald", "PDF")

    println(
        "Book Title: ${book.title} " +
                "Book Author: ${book.author}"
    )

    println(
        "eBook Title: ${ebook.title} " +
                "eBook Author: ${ebook.author}" +
                "eBook Format: ${ebook.format}"
    )

    println("Current Page of book : ${book.currentPage}")
    book.readPage()
    println("Current Page of book : ${book.currentPage}")

    println("Current Word Count of ebook : ${ebook.currentWordCount}")
    ebook.readPage()
    println("Current Word Count of ebook : ${ebook.currentWordCount}")

}