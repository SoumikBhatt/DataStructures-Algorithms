fun binarySearch(array: ArrayList<Int>, value: Int) {
    array.sort()
    var high = array.size
    var low = 0
    var mid: Int
    var index = -1

    loop@ while (low <= high) {
        mid = low + (high - low) / 2

        when {
            array[mid] == value -> {
                index = 0
                println("$value is found at $mid index")
                break@loop
            }
            value > array[mid] -> {
                low = mid + 1
            }
            else -> high = mid - 1
        }
    }

    if (index==-1) println("$value not found")

}

fun main(args: Array<String>) {
    binarySearch(arrayListof<Int>(10,8,12,45,2),45)    
}