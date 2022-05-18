open class CourseAttr(var id : Int, var name : String,var description  : String) {

    companion object{
        fun getMessage(id: Int) {
            return if(id != null){
                println("Registraste Exitosamente el Curso!")
            }else{
                println("Error! No se Registro Correctamente")
            }
        }
    }


}