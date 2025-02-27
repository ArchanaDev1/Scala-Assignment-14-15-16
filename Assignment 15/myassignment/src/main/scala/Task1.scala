class Container[T]{
    private var datas: List[T]=List()

    def adddata(data:T):Unit={
        datas=datas:+data
    }

   def getdata:List[T]={
     datas
   } 
}