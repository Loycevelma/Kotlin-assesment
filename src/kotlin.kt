fun main(){
var book= listOf(Book("Born a crime","Trevor",120),
    Book("Chozi la heri","Trevor",300),
    Book("Blossoms of the savanah","Trevor",160),
    Book("Doll's house","Trevor",150),
    )
    println(bookList(book))
    var account=CurrentAccount(2819367,"Loyce Velma",120000.0)
  account.deposit(45000.0)
   account.withdraw(23764.9)
   account.details()

    var save=SavingsAccount(2389365,"Amondi",250000.9,23670)
    (save.withdraw(3.0))

}
data class Book(var title:String,var author:String,var pages:Int)
fun bookList(books:List<Book>):List<Book>{
    var sortedBook=books.sortedByDescending{book -> book.title }
    return sortedBook
}

 open class CurrentAccount(var accountNumber:Int ,var accountName:String,var balance:Double ){
    fun deposit(amount:Double){
        balance+=amount
        println(balance)
    }
   open fun withdraw(amount:Double){
        balance-=amount
        println(balance)
    }
   fun  details(){
        println("Hello  your account number is$accountNumber and your account balance is $balance and it is being operated by $accountName")
    }
}
class SavingsAccount( accountNumber:Int , accountName:String, balance:Double,var withdrawals:Int):CurrentAccount(accountNumber,accountName,balance){
override fun withdraw(amount:Double){
    if(balance<4)
        println("withdraw money")
    else if(balance>4)
    println(balance)
}
}


