import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import ru.smarteps.scl.TConductingEquipment;
import ru.smarteps.scl.TTerminal;

import java.util.ArrayList;
import java.util.List;


public class metodterma {
    private static List<TTerminal> Terminals;
    private static List<String> cNN;
    private static List<String> cCN;

    public static void MetodTerm(TConductingEquipment conductingEquipment, Individual inda, ObjectProperty hasCN, ObjectProperty hasTerminal, OntModel model, String NS) {
        Terminals = conductingEquipment.getTerminal();

        OntClass TerminalClass = model.getOntClass(NS + "Terminal");
        OntClass connectivityNodeClass = model.getOntClass(NS + "ConnectivityNode");

        for (int i = 0; i < Terminals.size(); i++) {
            String term = Terminals.get(i).getName() + "_" + conductingEquipment.getName();
            String CN = conductingEquipment.getTerminal().get(i).getConnectivityNode();
            Individual CNDIS = model.createIndividual(NS + CN, connectivityNodeClass);
            Individual terminal = model.createIndividual(NS + term, TerminalClass);
            inda.addProperty(hasCN, CNDIS);
            inda.addProperty(hasTerminal, terminal);

        }
        return;
    }
}
