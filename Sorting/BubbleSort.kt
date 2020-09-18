fun <T : Comparable<T>> MutableList<T>.bubbleSort(array: MutableList<T>){

    var swap = false
    var temp:T?=null

    for(i in 0 until array.size-1){

        for (j in 0 until array.size-i-1) {
            if (array[j]>array[j+1]){
                temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
                swap = true
            }
        }

        if (!swap) break
    }
}