class Covariant[+T](val datas: T)

class Bird {
    def speak(): String = {
        "bird is flying"
    }
}

class Parrot extends Bird {
    override def speak(): String = {
        "parrot is flying"
    }
}

class Contravariant[-T] {
    def adddata(data: T): Unit = {
        println(s"data added: $data")
    }
}