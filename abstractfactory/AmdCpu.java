package abstractfactory;

public class AmdCpu implements Cpu {

	@Override
	public void process() {
		System.out.println("AMD cpu is processing");
	}

}
