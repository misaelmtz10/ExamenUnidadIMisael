open class CourseAttr(var id : Int, var name : String,var description  : String) {
    companion object{
        fun getMessageRegister(id: Int,name : String, description  : String): Unit {
            return if(id != null && name !="" &&  description != ""){
                println("Registraste Exitosamente el Curso!")
            }else{
                println("Error! No se Registro Correctamente")
            }
        }

        fun getMessageDelete(id: Int): Unit {
            return if(id == null){
                println("Borrado Exitosamente!")
            }else{
                println("Error! No se pudo Borrar")
            }
        }
        fun getMessageActualizar(id: Int): Unit {
            return if(id != id){
                println("Actualizado Exitosamente!")
            }else{
                println("Error! No se pudo Actualizar")
            }
        }

    }

}