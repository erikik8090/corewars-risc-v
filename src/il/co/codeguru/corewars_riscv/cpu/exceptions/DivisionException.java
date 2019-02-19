package il.co.codeguru.corewars_riscv.cpu.exceptions;

/**
 * Thrown by DIV/IDIV opcodes when the division overflows, or when dividing by zero.
 * 
 * @author DL
 */
public class DivisionException extends CpuException {
	private static final long serialVersionUID = 1L;
}
