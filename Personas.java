public class Personas{
		String nombre;
		String apellido;
		int edad;
		String sexo;

		public Personas(String n, String a, int e, String s){
			this.nombre=n;
			this.apellido=a;
			this.edad=e;
			this.sexo=s;
		}
		public String retornarNombre(){
			return nombre;
		}
		public String retornarApellido(){
			return apellido;
		}
		public int retornarEdad(){
			return edad;
		}
		public String retornarSexo(){
			return sexo;
		}
		public void obtenerNombre(String n){
			this.nombre=n;
		}
		public void obtenerApellido(String a){
			this.apellido=a;
		}
		public void obtenerEdad(int e){
			this.edad=e;
		}
		public void obtenerSexo	(String s){
			this.sexo=s;
		}
	}