package org.formacion.factorymethod;

public class FactLavadoraSuperior implements CrearLavadoras{

@Override
public Lavadora crearLavadora() {
	Lavadora lavadora = new LavadoraCargaSuperior();
	return lavadora;
}

}
