package abstractfactory;

public class IntelFactory implements CpuFactory {

	@Override
	public Cpu produceCpu() {
		return new IntelCpu();
	}

}
