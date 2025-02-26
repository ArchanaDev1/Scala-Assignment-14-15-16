class Covariant[+T](val items: T)

class Bird {
    def speak(): String = {
        "bird is speaking"
    }
}

class Parrot extends Bird {
    override def speak(): String = {
        "parrot is speaking"
    }
}

class Contravariant[-T] {
    def addItem(item: T): Unit = {
        println(s"item added: $item")
    }
}