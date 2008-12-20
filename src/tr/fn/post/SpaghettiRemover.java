package tr.fn.post;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tr.fn.gen.instr.Instruction;
import tr.fn.gen.instr.Jump;
import tr.fn.gen.instr.Label;
import tr.fn.gen.instr.MkClos;
import tr.fn.gen.instr.MkFunval;

public class SpaghettiRemover {
	private PostprocessContext context;

	public SpaghettiRemover(PostprocessContext context) {
		this.context = context;
	}
	
	public void execute() {
		List<Instruction> ret = new ArrayList<Instruction>();
		List<List<Instruction>> bodies = new ArrayList<List<Instruction>>();
		
		ret = collectBodies(context.getInstructions().iterator(), bodies, null);
		for (List<Instruction> body : bodies) {
			for (Instruction instruction : body) {
				ret.add(instruction);
			}
		}
		
		context.setInstructions(ret);
	}
	
	private List<Instruction> collectBodies(Iterator<Instruction> it, List<List<Instruction>> bodies, Label end) {
		List<Instruction> ret = new ArrayList<Instruction>();
		
		while (it.hasNext()) {
			Instruction instr = it.next();
			if (instr instanceof MkFunval || instr instanceof MkClos) {
				ret.add(instr);
				Jump jump = (Jump) it.next();
				bodies.add(collectBodies(it, bodies, jump.getLabel()));
			} else if (instr instanceof Label && end != null && end.equals(instr)) {
				return ret;
			} else {
				ret.add(instr);
			}
		}
		
		return ret;
	}
	
}
