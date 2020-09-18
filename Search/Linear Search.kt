fun linearSearch(array:ArrayList<Int>,value:Int){
    var index = -1
    for (i in array.indices) {
        if(array[i]==value) {
            index = 0
            println("$value is found at $i index")
            break
        }
    }
    
    if(index==-1) println("$value not found")
}

fun main(args: Array<String>) {
    linearSearch(arrayListof<Int>(10,8,12,45,2),45)    
}