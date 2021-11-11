package pruebas;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int edad1 = 10;
      int edad2 = 10;
      int res = edad1 + edad2;
      
    //ahora quiero mostrar el contenido de res
    		System.out.println("la suma de edad + edad2 es=" + res );		
    		System.out.println(res);
    		System.out.println("----------------------------------");
    		
    		double alto = 175.5; //defecto de los numero con decimales
    		
    		//para los float 
    		float ancho = 205.7F;
    		System.out.println("----------------------------------");
    		
    		
    		//obtener el resultado de una division
    		//alto/ancho > siempre es con decimales
    		//float < double
    		//quedar con el floatante que esta dentro del double
    		float resDiv = (float)alto/ancho; 
    		
    		byte valor = 127; // > -128 a + 127
    		
    		// division /
    		float div0 = (float)alto / 0;
    		
    		System.out.println("div 0="+div0);
    		
    		System.out.println("fin");
    		
    		int a = 10;
    		int b = 5;
    		//mod%
    		int mod = a % b; 
    		System.out.println(a +"%" + b + "=");
    		
    		int edadAdulto 
    		
    		
    		System.out.println("----------------------------------");
    		
    		double multi = alto * ancho;
    		System.out.println("*" + multi);
    		
    		// relacionales
    		// > < >= <= != TODOS > boolean
    							//175.5  != 205.5
    		boolean resAltoAncho =  alto != ancho; //true
    		System.out.println(alto + " != " + ancho + " = " + resAltoAncho);
    		
	}

}
