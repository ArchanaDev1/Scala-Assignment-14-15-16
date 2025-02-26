class Container[T]{
    private var items: List[T]=List()

    def addItem(item:T):Unit={
        items=items:+item
    }

   def getItems:List[T]={
     items
   } 
}