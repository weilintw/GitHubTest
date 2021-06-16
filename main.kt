fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}
fun main() {
    fun printLength(obj: Any) {
        println("'$obj' 您的名字共有 ${getStringLength(obj) ?: "... 錯誤 , 這不是一個字串 "} 個字 ")
    }
    println("請問大名？")
    val name = readLine()
    println("您好， $name！！")
    printLength("$name")
}
