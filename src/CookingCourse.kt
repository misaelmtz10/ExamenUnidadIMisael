open class CookingCourse( id : Int, name : String, description  : String) : CourseAttr (id,name,description) {

}
fun main(args : Array<String>) {
    val funcionesCocina: FuncionesCocina=FuncionesCocina()
    funcionesCocina.add("luis","abner")
    funcionesCocina.showAll()

    funcionesCocina.delete(1)

}

class  FuncionesCocina{

    val list : MutableList<CookingCourse> =mutableListOf()
    fun add( name : String, description  : String):Int{
        val cookingCourseclass=CookingCourse(list.size+1,name,description)
        list.add(cookingCourseclass)
        return list.size+1
    }
    fun delete(id : Int){
        val index = id -1
        list.removeAt(index)
    }
    fun edit(id: Int, name : String, description  : String){
        val cookingCourseclass=CookingCourse(id,name,description)
        list.set(id-1,cookingCourseclass)
    }
    fun showAll(){
        for (i in list){
            println(i.name)
        }
    }

}