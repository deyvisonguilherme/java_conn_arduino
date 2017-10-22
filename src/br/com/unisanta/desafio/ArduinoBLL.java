package br.com.unisanta.desafio;

public class ArduinoBLL 
{
	private static ControlePorta _arduino;
	
	public static void conectarArduino() {
		_arduino = new ControlePorta("/dev/ttyACM0", 9600);
	}

	private static int display = 0;
	private static boolean flag;

	public static void setDisplay(int _display) {
		display = _display;
	}

	public static int getDisplay() {
		return display;
	}

	public static void setFlag(boolean _flag) {
		flag = _flag;
	}

	public static boolean getFlag() {
		return flag;
	}

	public static String mostraBits(int _x) 
	{
		String retorno = "";
		int aux = 128;

		for (int i = 0; i < 8; ++i) {
			if ((_x & aux) != 0) {
				retorno += "1";
			} else {
				retorno += "0";
			}
			aux = aux >> 1;
		}
		return retorno;
	}

	public static void ligaDispositivo(String _n) {
		int aux = 1 << (Integer.parseInt(_n) - 1);
		display = display | aux;
	}

	public static void desligaDispositivo(String _n) {
		int aux = 1 << (Integer.parseInt(_n) - 1);
		display = display & ~aux;
	}

	public static void comunicacaoArduino(String _valor)
	{
		_arduino.enviaDado(_valor);
	}
}
