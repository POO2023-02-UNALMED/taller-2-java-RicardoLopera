package test;

public class Auto {
	String modelo;
	int precio;
	public Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int numerodeasientos = 0;
		for(int i = 0;i < asientos.length; i++) {
			if (asientos[i] != null) {
				numerodeasientos++;
			}
		}
		return numerodeasientos;
	}
	public String verificarIntegridad() {
		boolean AsientosOriginales = true;
		for(int i=0;i<asientos.length;i++) {
			if(asientos[i] != null ) {
				if(registro != asientos[i].registro) {
					AsientosOriginales = false;
					break;
				}
			}
		}
		if(registro == motor.registro && AsientosOriginales == true) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
		
	}
}
