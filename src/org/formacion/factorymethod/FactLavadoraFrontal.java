package org.formacion.factorymethod;

public class FactLavadoraFrontal  implements CrearLavadoras{
	@Override
	public Lavadora crearLavadora() {
		Lavadora lavadora = new LavadoraCargaFrontal();
		return lavadora;
	}

}
