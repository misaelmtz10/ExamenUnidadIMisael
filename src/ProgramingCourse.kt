open class ProgramingCourse(var id : Int, var name : String,var description  : String) {

}


class GestionProgramingCourse{

    val listCouse : MutableList<ProgramingCourse> = mutableListOf()
    fun addProgramingCourse(id:Int, name:String, description: String):Int{
        // Registrar curso
        val listaAdd = ProgramingCourse(listCouse.size+1, name, description)
        listCouse.add(listaAdd)
        return listCouse.size-1
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