package br.com.unisanta.desafio;

import java.io.IOException;
import java.io.OutputStream;
import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.SerialPort;

public class ControlePorta 
{
	private OutputStream serialOut;
	private int taxa;
	private String porta;

	public ControlePorta(String _porta, int _taxa) 
	{
		this.porta = _porta;
		this.taxa = _taxa;
		this.abrePorta();
	}

	private void abrePorta() 
	{
		try 
		{
			CommPortIdentifier portId = null;
			try 
			{
				portId = CommPortIdentifier.getPortIdentifier(this.porta);
			} 
			catch (NoSuchPortException npe) 
			{
				System.out.println("Porta não encontrada.");
			}

			SerialPort port = (SerialPort) portId.open("Comunicação serial", this.taxa);
			serialOut = port.getOutputStream();
			port.setSerialPortParams(this.taxa, SerialPort.DATABITS_8, // taxa de 10 bits 8 (envio)
					SerialPort.STOPBITS_1, // taxa de 10 bits 1 (recebimento)
					SerialPort.PARITY_NONE); // receber e enviar dados

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void fechaPorta() 
	{
		try 
		{
			serialOut.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Não foi possível fechar porta COM.");
		}
	}
	
	
	public void enviaDado(String _valor)
	{
	    try 
	    {
	      serialOut.write(Integer.parseInt(_valor));
	    } 
	    catch (IOException ex)
	    {
	        System.out.println("Não foi possível enviar o dado. ");
	    }
	} 
}
