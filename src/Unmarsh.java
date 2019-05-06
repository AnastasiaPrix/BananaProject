import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.jena.ontology.*;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.*;
import org.apache.jena.reasoner.Reasoner;
import org.apache.jena.reasoner.ReasonerRegistry;
import org.apache.jena.reasoner.rulesys.GenericRuleReasoner;
import org.apache.jena.reasoner.rulesys.Rule;
import org.apache.jena.util.FileManager;
import ru.smarteps.scl.*;
import org.apache.commons.lang3.StringUtils;

public class Unmarsh {
    private static TSubstation mySubstation;
    private static TVoltage voltage;
    private static List<TTerminal> ctrTerminals;
    private static List<TTerminal> vtrTerminals;
    private static List<TTerminal> cbrTerminals;
    private static List<TTerminal> disTerminals;
    private static List<TPowerTransformerEnum> ptrTypes;
    public static void main(String[] args) {
        OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM_MINI_RULE_INF); // Any Spec
        String inputOntFilename = "C:\\Users\\User\\Desktop\\SCL\\new_rdf1.rdf ";
//        String NS = "http://www.semanticweb.org/user/ontologies/2018/4/ASPPRZ#";
        // use the FileManager to find the input scdFile
//        InputStream in = FileManager.get().open(inputOntFilename);
//        if (in == null) {
//            throw new IllegalArgumentException(
//                    "File: " + inputOntFilename + " not found");
//        }
//        model.read(in, null);
//        File scdFile = new File("src/new.scd");
//
//        JAXBContext jaxbContext;
//        SCL tsub = null;
//        try {
//            jaxbContext = JAXBContext.newInstance(SCL.class);
//            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//            tsub = (SCL) jaxbUnmarshaller.unmarshal(scdFile);
////			System.out.println(tsub);
//        } catch (JAXBException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        OntClass voltageLevelClass = model.createClass(NS + "Voltage Level");//Create absent VL class
//        List<TSubstation> substations = tsub.getSubstation();
//        mySubstation = substations.get(0);
//        System.out.println("Voltage level phase!");
//        for (TVoltageLevel voltageLevel : mySubstation.getVoltageLevel()) {
//            voltage = voltageLevel.getVoltage();
//            Individual voltageIndividual = model.createIndividual(
//                    NS + voltage.getValue().toString(), voltageLevelClass);
//            System.out.println("Bay phase!");
//            for (TBay bay : voltageLevel.getBay()) {
//                OntClass bayClass = model.getOntClass(NS + "Bay");
//                Individual bayIndividual = model.createIndividual(
//                        NS + bay.getName().toString(), bayClass);
//                ObjectProperty hasBay = model.createObjectProperty(NS + "hasBay");
//                voltageIndividual.addProperty(hasBay, bayIndividual);
//                System.out.println("Conducting equipment phase!");
//                for (TConductingEquipment conductingEquipment : bay.getConductingEquipment()) {
//                    List<String> basicTypes = Arrays.asList(conductingEquipment.getType());
//                    OntClass measurementClass = model.getOntClass(NS + "Measurement");
//                    OntClass switchingClass = model.getOntClass(NS + "Switching");
//                    ObjectProperty hasTerminal = model.createObjectProperty(NS + "hasTerminal");
//                    ObjectProperty hasConnectivityNode = model.createObjectProperty(NS + "hasConnectivityNode");
//                    if (basicTypes.contains("CTR")) {
//                        System.out.println("CTR phase!");
//                        String currentCTR = conductingEquipment.getName();
//                        Individual ctrIndividual = model.createIndividual(NS + currentCTR, measurementClass);
//                        ctrTerminals = conductingEquipment.getTerminal();
//                        List<Individual> ctrTerminalIndividual = new ArrayList<Individual>();
//                        List<Individual> ctrCNNsIndividual = new ArrayList<Individual>();
//                        for (int i = 0; i < ctrTerminals.size(); i++) {
//                            ctrTerminalIndividual.add(model.createIndividual(
//                                    NS + ctrTerminals.get(i).getName(), model.getOntClass(NS + "Terminal")));
//                            ctrIndividual.addProperty(hasTerminal, ctrTerminalIndividual.get(i));
//                            ctrCNNsIndividual.add(model.createIndividual(
//                                    NS + ctrTerminals.get(i).getConnectivityNode(),
//                                    model.getOntClass(NS + "ConnectivityNodes")));
//                            ctrIndividual.addProperty(hasConnectivityNode, ctrCNNsIndividual.get(i));
//                        }
//                    }
//                    if (basicTypes.contains("VTR")) {
//                        System.out.println("VTR phase!");
//                        String currentVTR = conductingEquipment.getName();
//                        Individual vtrIndividual = model.createIndividual(NS + currentVTR, measurementClass);
//                        vtrTerminals = conductingEquipment.getTerminal();
//                        List<Individual> vtrTerminalIndividual = new ArrayList<Individual>();
//                        List<Individual> vtrCNNsIndividual = new ArrayList<Individual>();
//                        for (int i = 0; i < vtrTerminals.size(); i++) {
//                            vtrTerminalIndividual.add(model.createIndividual(
//                                    NS + vtrTerminals.get(i).getName(), model.getOntClass(NS + "Terminal")));
//                            vtrIndividual.addProperty(hasTerminal, vtrTerminalIndividual.get(i));
//                            vtrCNNsIndividual.add(model.createIndividual(
//                                    NS + vtrTerminals.get(i).getConnectivityNode(),
//                                    model.getOntClass(NS + "ConnectivityNodes")));
//                            vtrIndividual.addProperty(hasConnectivityNode, vtrCNNsIndividual.get(i));
//                        }
//                    }
//                    if (basicTypes.contains("CBR")) {
//                        System.out.println("CBR phase!");
//                        String currentCBR = conductingEquipment.getName();
//                        Individual cbrIndividual = model.createIndividual(NS + currentCBR, switchingClass);
//                        cbrTerminals = conductingEquipment.getTerminal();
//                        List<Individual> cbrTerminalIndividual = new ArrayList<Individual>();
//                        List<Individual> cbrCNNsIndividual = new ArrayList<Individual>();
//                        for (int i = 0; i < cbrTerminals.size(); i++) {
//                            cbrTerminalIndividual.add(model.createIndividual(
//                                    NS + cbrTerminals.get(i).getName(), model.getOntClass(NS + "Terminal")));
//                            cbrIndividual.addProperty(hasTerminal, cbrTerminalIndividual.get(i));
//                            cbrCNNsIndividual.add(model.createIndividual(
//                                    NS + cbrTerminals.get(i).getConnectivityNode(),
//                                    model.getOntClass(NS + "ConnectivityNodes")));
//                            cbrIndividual.addProperty(hasConnectivityNode, cbrCNNsIndividual.get(i));
//                        }
//                    }
//                    if (basicTypes.contains("DIS")) {
//                        System.out.println("DIS phase!");
//                        String currentDIS = conductingEquipment.getName();
//                        Individual disIndividual = model.createIndividual(NS + currentDIS, switchingClass);
//                        disTerminals = conductingEquipment.getTerminal();
//                        List<Individual> disTerminalIndividual = new ArrayList<Individual>();
//                        List<Individual> disCNNsIndividual = new ArrayList<Individual>();

//                        for (int i = 0; i < disTerminals.size(); i++) {
//                            disTerminalIndividual.add(model.createIndividual(
//                                    NS + disTerminals.get(i).getName(), model.getOntClass(NS + "Terminal")));
//                            disIndividual.addProperty(hasTerminal, disTerminalIndividual.get(i));
//                            disCNNsIndividual.add(model.createIndividual(
//                                    NS + disTerminals.get(i).getConnectivityNode(),
//                                    model.getOntClass(NS + "ConnectivityNodes")));
//                            disIndividual.addProperty(hasConnectivityNode, disCNNsIndividual.get(i));
//                        }

//                    }
//                }
//            }

//            for (TPowerTransformer powerTransformer : mySubstation.getPowerTransformer()) {
//                ptrTypes = Collections.singletonList(powerTransformer.getType());
//                OntClass pwtClass = model.getOntClass(NS + "Transformers");
//                ObjectProperty hasTerminal = model.createObjectProperty(NS + "hasTerminal");
//                OntClass pwtWindingSubClass = model.createClass(NS + "Windings");
//                pwtClass.addSubClass(pwtWindingSubClass);
//                if (ptrTypes.contains("PTR")) {
//                    System.out.println("PTR phase!");
//                    String currentPTR = powerTransformer.getName();
//                    List<Individual> windingIndividual = new ArrayList<Individual>();
//                    for (TTransformerWinding winding : powerTransformer.getTransformerWinding()) {
//                        windingIndividual.add(model.createIndividual(
//                                NS + winding.getName(), model.getOntClass(NS + "Windings")));
//                        List<Individual> ptrTerminalIndividual = new ArrayList<Individual>();
//                        List<Individual> ptrCNNsIndividual = new ArrayList<Individual>();
//                        for (TTerminal ptrTerminal : winding.getTerminal()) {
//                            ptrTerminalIndividual.add(model.createIndividual(
//                                    NS + ptrTerminal.getName(), model.getOntClass(NS + "Terminal")));
//                            ptrCNNsIndividual.add(model.createIndividual(
//                                    NS + ptrTerminal.getConnectivityNode(),
//                                    model.getOntClass(NS + "ConnectivityNodes")));
//                            for (int i = 0; i < windingIndividual.size(); i++) {
//                                windingIndividual.get(i).addProperty(hasTerminal, ptrTerminalIndividual.get(i));
//                            }
//                        }
//                    }
//                }
//            }
//        }
  //      Model model = FileManager.get().loadModel("/Users/alexbol96/Downloads/IEC_6112");
//        model.write(System.out);
//      Reasoner reasoner = new GenericRuleReasoner(Rule.rulesFromURL("rules.txt"));
//        InfModel infModel = ModelFactory.createInfModel( reasoner, model );
//
//        StmtIterator it = infModel.listStatements();
//
//        while ( it.hasNext() ) {
//            Statement stmt = it.nextStatement();
//
//            Resource subject = stmt.getSubject();
//            Property predicate = stmt.getPredicate();
//            RDFNode object = stmt.getObject();
//
//            System.out.println(subject.toString() + " " + predicate.toString() + " " + object.toString());
//        }
//        String queryString =
//                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
//                        "PREFIX ASPPRZ: <http://www.semanticweb.org/user/ontologies/2018/4/ASPPRZ#>\n" +
//                        "SELECT DISTINCT ?breaker ?term\n" +
//                        "WHERE { ?breaker rdf:type ASPPRZ:CircutBreakers.\n" +
//                        "?breaker ASPPRZ:hasTerminal ?term.}";
//        Query query = QueryFactory.create(queryString);
//        QueryExecution queryExecution = QueryExecutionFactory.create(query, model);
//        ResultSet resultSet = queryExecution.execSelect();
////        resultSet.
//
//        try{
//            while (resultSet.hasNext()) {
//                QuerySolution solution = resultSet.nextSolution();
//                System.out.println(solution);
//                String solStr[] = solution.toString().split("\\?");
//                for (int i = 0; i<solStr.length; i++){
//                    if (solStr[i].contains("#")){
//                        System.out.println(solStr[i].substring(solStr[i].indexOf("<") + 1, solStr[i].indexOf(">")));
//                    }else {
//                        continue;
//                    }
//                }
//
//
//            }
//
//        }finally {
//            queryExecution.close();
//        }
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\User\\Desktop\\SCL\\new_rdf1.rdf ");
//            model.write(fileOutputStream);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        String rule = "[rule1:(?x http://www.semanticweb.org/user/ontologies/2018/4/ASPPRZ#isProtectedBy ?y) " +
                "(?x http://www.semanticweb.org/user/ontologies/2018/4/ASPPRZ#hasTerminal ?z)" +
                "->(?y http://www.semanticweb.org/user/ontologies/2018/4/ASPPRZ#useTerminal ?z)]";

        String ruleQuery =
                "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
                        "PREFIX ASPPRZ: <http://www.semanticweb.org/user/ontologies/2018/4/ASPPRZ#>\n" +
                "SELECT *" +
                "WHERE { ?x" +
                        " ?y ?z}";

//        Reasoner reasoner = new GenericRuleReasoner(Rule.parseRules(rule));
//        InfModel model1 = ModelFactory.createInfModel(reasoner, model);

        Reasoner reasoner = ReasonerRegistry.getOWLMiniReasoner();
        InfModel inf = ModelFactory.createInfModel(reasoner, model);

        Query queryReasoner = QueryFactory.create(ruleQuery);
        QueryExecution qe = QueryExecutionFactory.create(queryReasoner, inf);
        ResultSet resultSet = qe.execSelect();

//        for ( ; resultSet.hasNext() ;){
//            QuerySolution solution = resultSet.nextSolution();
//            System.out.println(" ");
//            System.out.println(solution.getResource("x").getLocalName());
//            System.out.println(" ");
//            System.out.println(solution.getResource("y").getLocalName());
//            System.out.println(" ");
//            System.out.println(solution.getResource("z").getLocalName());
//        }
        qe.close();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/alexbol96/Downloads/IEC_6119");
            inf.write(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}