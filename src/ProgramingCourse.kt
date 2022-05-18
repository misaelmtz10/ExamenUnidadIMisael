open class ProgramingCourse(id : Int, name : String,description  : String) : CourseAttr (id,name,description) {

}


class GestionProgramingCourse{

    val listCouse : MutableList<ProgramingCourse> = mutableListOf()
    fun addProgramingCourse(name:String, description: String):MutableList<ProgramingCourse>{
        // Registrar curso
        val listaAdd = ProgramingCourse(listCouse.size+1, name, description)
        listCouse.add(listaAdd)
        return listCouse
    }

    fun editProgramingCourse(id: Int, name : String, description  : String){
        val editlist=ProgramingCourse(id,name,description)
        listCouse.set(id-1,editlist)
    }

    fun deleteProgramingCourse(id: Int){
        val index = id -1
        listCouse.removeAt(index)
    }

    fun showAllProgramingCourse(){
        for (i in listCouse){
            println(i)
        }
    }
}