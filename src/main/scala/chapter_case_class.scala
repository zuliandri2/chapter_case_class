object chapter_case_class {

  def main(args: Array[String]): Unit = {

    val frankeistance = Book("978-0486282114")
    println(frankeistance.isbn)

    val message = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")
    println(message.sender)

  }

}

case class Book(isbn: String)

case class Message(sender: String, recipient: String, body: String)