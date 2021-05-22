package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val toReturn = sadArray.toMutableList()
        var delFlag = false

        for (i in 1..sadArray.lastIndex - 1){
            if (toReturn[i - 1] + toReturn[i + 1] < toReturn[i]) {
                delFlag = true
                toReturn.removeAt(i)
                break
            }
        }

        if (delFlag)
            return convertToHappy(toReturn.toIntArray())
        else
            return toReturn.toIntArray()
    }
}
