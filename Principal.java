	public class Principal{
	public static void main (String[] args){
	BufferR Scan= new BufferR();
	Calculadora Calc= new Calculadora();
	Fibonacci Fibo= new Fibonacci();
	Tablas Mul= new Tablas();


	int opciones;
	char simbolos;	
	int limit;	
	int num1;
	int num2;
	int c;

		//Menu
		System.out.println(" ---------------------------");
		System.out.println("|     MENU DE OPERACIONES   |");
		System.out.println("|  1. Calculadora           |");
		System.out.println("|  2. Serie de Fibonacci    |");
		System.out.println("|  3. Tablas de multiplicar |");
		System.out.println(" ---------------------------");

		//Switch para el menu de operaciones
		opciones=Scan.ingresarNumero();
		switch(opciones){
		case 1:
		//Calculadora
		System.out.println("Escogio la Calculadora! :");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Para continuar, Ingrese un signo valido de operacion!");
		System.out.println("+ para suma");
		System.out.println("- para resta");
		System.out.println("* para multiplicacion");
		System.out.println("/ para division");
		System.out.println("--------------------------------------------------------------------");
				//Switch para evaluar el signo
			simbolos=Scan.ingresarSigno();
			switch(simbolos){
				case '+':
				//Suma
				System.out.println("ESCOGIO LA OPCION SUMA (+)");
				System.out.println("----------------------------------");
				System.out.println("|     Ingrese el Primer Numero    |");
				System.out.println("----------------------------------");
				num1=Scan.ingresarNumero();
				System.out.println("----------------------------------");
				System.out.println("|     Ingrese el Segundo Numero  |");
				System.out.println("----------------------------------");
				num2=Scan.ingresarNumero();
				System.out.println("----------------------------------");
				System.out.println("el Total de la suma de: "+ num1 + " + " + num2 +" = "+ Calc.sumar(num1,num2));
				break;

				case'-':
				//Resta
				System.out.println("ESCOGIO LA OPCION RESTA (-)");
				System.out.println("----------------------------------");
				System.out.println("|     Ingrese el Primer Numero    |");
				System.out.println("----------------------------------");
				num1=Scan.ingresarNumero();
				System.out.println("----------------------------------");
				System.out.println("|     Ingrese el Segundo Numero  |");
				System.out.println("----------------------------------");
				num2=Scan.ingresarNumero();
				System.out.println("----------------------------------");
				System.out.println("el Total de la resta de: "+ num1 + " - " + num2 +" = "+ Calc.restar(num1,num2));
				break;

				case '*':
				//Multiplicacion
				System.out.println("ESCOGIO LA OPCION MULTIPLICACION (*)");
				System.out.println("----------------------------------");
				System.out.println("|     Ingrese el Primer Numero    |");
				System.out.println("----------------------------------");
				num1=Scan.ingresarNumero();
				System.out.println("----------------------------------");
				System.out.println("|     Ingrese el Segundo Numero  |");
				System.out.println("----------------------------------");
				num2=Scan.ingresarNumero();
				System.out.println("----------------------------------");
				
				break;

				case '/':
				//Division
				System.out.println("ESCOGIO LA OPCION DIVISION (/)");
				System.out.println("----------------------------------");
				System.out.println("|     Ingrese el Primer Numero    |");
				System.out.println("----------------------------------");
				num1=Scan.ingresarNumero();
				System.out.println("----------------------------------");
				System.out.println("|     Ingrese el Segundo Numero  |");
				System.out.println("----------------------------------");
				num2=Scan.ingresarNumero();
				if (num2==0){
					System.out.println("No se puede realizar la operacion");
				}else{
				System.out.println("----------------------------------");
				System.out.println("el Total de la Division de: "+ num1 + " / " + num2 +" = "+ Calc.dividir(num1,num2));
				}break;
				//Default de submenu calculadora
				default:
				System.out.println("****ERROR****");
				System.out.println("Error, Esta opcion no existe :(");
				break;		
			}
			break;
			case 2:
			//Fibonacci
			System.out.println("Escogio la opcion de serie de Fibonacci!");
			System.out.println("----------------------------------");
			System.out.println("| Ingrese el No. de iteraciones  |");
			System.out.println("----------------------------------");
			c=Scan.ingresarNumero();
			System.out.println("----------------------------------");
			Fibo.serie(c);
			System.out.println("Fin!");
			System.out.println("----------------------------------");
			break;		

			case 3:
			//Tablas de multiplicar
			System.out.println("Escogio la opcion las tablas de Multiplicar!");
			System.out.println("----------------------------------");
			System.out.println("|     Ingrese el Primer Numero    |");
			System.out.println("----------------------------------");
			num1=Scan.ingresarNumero();
			System.out.println("----------------------------------");
			System.out.println("|        Ingrese el limite       |");
			System.out.println("----------------------------------");
			limit=Scan.ingresarNumero();
			Mul.tab(num1,limit);
			break;

		//Default de Menu principal
		default:
		System.out.println("****ERROR****");
		System.out.println("Error, Esta opcion no existe :(");
		}
		
	
}	}
		
	


