import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import ru.smarteps.scl.*;

import java.util.List;

public class metTR {
    private static List<TTerminal> Terminals;
    private static List<String> cNN;
    private static List<String> cCN;

    public static void MetodTerm(TPowerTransformer powerTransformer, Individual inda, ObjectProperty hasCN, ObjectProperty hasTerminal, OntModel model, String NS) {
        // Terminals = conductingEquipment.getTerminal();

        OntClass voltageLevelClass = model.getOntClass(NS + "VoltageLevel"); ///ON VOOBSHE NUGEN??????
        OntClass TerminalClass = model.getOntClass(NS + "Terminal");
        OntClass connectivityNodeClass = model.getOntClass(NS + "ConnectivityNode");
        OntClass PTWClass = model.getOntClass(NS + "PTW");
        OntClass YEFNClass = model.getOntClass(NS + "YEFN");
        OntClass ZBSHClass = model.getOntClass(NS + "ZBSH");
        OntClass YLTCClass = model.getOntClass(NS + "YLTC");
        OntClass YPSHClass = model.getOntClass(NS + "YPSH");
        ObjectProperty hasPTW = model.getObjectProperty(NS + "hasPTW");
        ObjectProperty partOf = model.getObjectProperty(NS + "partOf");
        ObjectProperty hasVoltageLevel = model.getObjectProperty(NS + "hasVoltageLevel");
//

        for (TTransformerWinding winding : powerTransformer.getTransformerWinding()) {
            Individual PTWIndividual = model.createIndividual(NS + winding.getName() + "_" + powerTransformer.getName(), PTWClass);

            String voltage = winding.getTerminal().get(0).getVoltageLevelName();
            OntClass U = model.getOntClass(NS + voltage);
            Individual voltageIndividual = model.createIndividual(NS + voltage, U);
            inda.addProperty(hasVoltageLevel, voltageIndividual);
            inda.addProperty(hasPTW, PTWIndividual);
            for (TTerminal ptwTerminals : winding.getTerminal()) {
                String term = ptwTerminals.getName() + "_" + winding.getName();
                String CN = winding.getTerminal().get(0).getConnectivityNode();
                Individual CNDIS = model.createIndividual(NS + CN, connectivityNodeClass);
                Individual ptwTerminalIndividual = model.createIndividual(NS + term, TerminalClass);
                PTWIndividual.addProperty(hasCN, CNDIS);
                PTWIndividual.addProperty(hasTerminal, ptwTerminalIndividual);


                for (TLNode trlnode : powerTransformer.getLNode()) {
                    List<String> LTClass = trlnode.getLnClass();
                    if (LTClass.contains("YLTC")) {
                        Individual YLTCIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YLTCClass);
                        YLTCIndividual.addProperty(partOf, inda);
                    }
                    if (LTClass.contains("YPSH")) {
                        Individual YPSHIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YPSHClass);
                        YPSHIndividual.addProperty(partOf, inda);
                    }
                    if (LTClass.contains("YEFN")) {
                        Individual YEFNIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YEFNClass);
                        YEFNIndividual.addProperty(partOf, inda);
                    }
                    if (LTClass.contains("ZBSH")) {
                        Individual ZBSHIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), ZBSHClass);
                        ZBSHIndividual.addProperty(partOf, inda);
                    }
                }
            }
        }
        return;
    }
}
