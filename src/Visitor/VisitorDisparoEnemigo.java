package Visitor;
import GameObjects.GameObject;
import GameObjects.Aliados.Aliado;
import GameObjects.Disparos.DisparoAliado;
import GameObjects.Disparos.DisparoEnemigo;
import GameObjects.Enemigos.Enemigo;
import GameObjects.Premios.Premio;

/*
 *  Clase usada por disparos enemigos
 */
public class VisitorDisparoEnemigo extends Visitor {

	public VisitorDisparoEnemigo(GameObject o) {
		super(o);
	}

	@Override
	public void visit(Aliado a) {
		obj.atacar(a);		
		//System.out.println("VisitorDisparoEnemigo.visit(Aliado)");
	}

	@Override
	public void visit(Enemigo e) {
		// No debe hacer nada
		//System.out.println("VisitorDisparoEnemigo.visit(Enemigo)");
	}

	@Override
	public void visit(DisparoAliado d) {
		// No debe hacer nada
		//System.out.println("VisitorDisparoEnemigo.visit(DisparoAliado)");
	}

	@Override
	public void visit(DisparoEnemigo d) {
		// No debe hacer nada
		//System.out.println("VisitorDisparoEnemigo.visit(DisparoEnemigo)");
	}
	
	@Override
	public void visit(Premio p) {
		obj.atacar(p);
	}
}
