package minhasclasses.comandos;
import minhasclasses.Tipo;
import minhasclasses.Item;
import minhasclasses.comandos.Exibe;

public class EntradaDados extends Comando{
	private Item ref1;
	
	Exibe exibe;
	Item item;
	
	public Exibe getExibe() {
		return exibe;
	}

	public void setExibe(Exibe exibe) {
		this.exibe = exibe;
	}

	public Item getItem() {
		return item;
	}

	public EntradaDados(){}
	
	public Item getListaComandos() {
		return ref1;
	}

	public void setItem(Item ref1) {
		this.ref1 = ref1;
	}
	
	public String geraCodigoDestino(){
		String codigoLeia ="";
		if(item.getTipo() == Tipo.STRING){
			codigoLeia += "new java/util/Scanner \r\n";
			codigoLeia += "dup \r\n";
			codigoLeia += "getstatic java/lang/System/in Ljava/io/InputStream \r\n";
			codigoLeia += "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V \r\n";
			codigoLeia += "invokevirtual java/util/Scanner/nextLine()S \r\n";
			codigoLeia += "dstore_1";
		}
		else 
		{
			codigoLeia += "new java/util/Scanner \r\n";
			codigoLeia += "dup \r\n";
			codigoLeia += "getstatic java/lang/System/in Ljava/io/InputStream";
			codigoLeia += "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V \r\n";
			codigoLeia += "invokevirtual java/util/Scanner/nextDouble()D \r\n";
			codigoLeia += "dstore_1";
		}	
		
		return codigoLeia;
	}

	@Override
	public String toString() {
		return "\nComando ENTRADA (item): "+
		       "item: "+this.ref1.toString();
	}
		
}
