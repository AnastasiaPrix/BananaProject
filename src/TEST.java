import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.cassandra.streaming.StreamOut;
import org.apache.jena.base.Sys;
import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.ontology.*;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.*;
import org.apache.jena.reasoner.Reasoner;
import org.apache.jena.reasoner.ReasonerRegistry;
import org.apache.jena.reasoner.rulesys.GenericRuleReasoner;
import org.apache.jena.reasoner.rulesys.Rule;
import org.apache.jena.util.FileManager;
import org.mindswap.pellet.jena.PelletReasonerFactory;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import ru.smarteps.scl.*;
import org.apache.commons.lang3.StringUtils;


public class TEST {
    private static TSubstation mySubstation;
    private static TVoltage voltage;
    private static List<TPowerTransformerEnum> ptrTypes;
    private static List<String> cNodeNames;
    private static List<String> cCN;
    private static List<TTerminal> ctrTerminals;
    private static List<String> cNNctr;
    private static List<String> cCNctr;
    private static List<TTerminal> vtrTerminals;
    private static List<String> cNNvtr;
    private static List<String> cCNvtr;
    private static List<TTerminal> cbrTerminals;
    private static List<String> cNNcbr;
    private static List<String> cCNcbr;
    private static List<TTerminal> disTerminals;
    private static List<String> cNNdis;
    private static List<String> cCNdis;
    private static List<TTerminal> iflTerminals;
    private static List<String> cNNifl;
    private static List<String> cCNifl;
    private static List<TTerminal> capTerminals;
    private static List<String> cNNcap;
    private static List<String> cCNcap;
    private static List<TTerminal> gilTerminals;
    private static List<String> cNNgil;
    private static List<String> cCNgil;
    private static List<TTerminal> motTerminals;
    private static List<String> cNNmot;
    private static List<String> cCNmot;
    private static List<TTerminal> reaTerminals;
    private static List<String> cNNrea;
    private static List<String> cCNrea;
    private static List<TTerminal> efnTerminals;
    private static List<String> cNNefn;
    private static List<String> cCNefn;
    private static List<TTerminal> linTerminals;
    private static List<String> cNNlin;
    private static List<String> cCNlin;
    private static List<TTerminal> cabTerminals;
    private static List<String> cNNcab;
    private static List<String> cCNcab;

    private static String cNNptw;
    private static String cCNptw;


    private static Map<String, List<String>> ctr = new HashMap<>();
    private static Map<String, List<String>> vtr = new HashMap<>();
    private static Map<String, List<String>> cbr = new HashMap<>();
    private static Map<String, List<String>> dis = new HashMap<>();
    private static Map<String, List<String>> ptr = new HashMap<>();
    private static Map<String, List<String>> ifl = new HashMap<>();
    private static Map<String, List<String>> cap = new HashMap<>();
    private static Map<String, List<String>> gil = new HashMap<>();
    private static Map<String, List<String>> mot = new HashMap<>();
    private static Map<String, List<String>> rea = new HashMap<>();
    private static Map<String, List<String>> efn = new HashMap<>();
    private static Map<String, List<String>> lin = new HashMap<>();
    private static Map<String, List<String>> cab = new HashMap<>();
    public static Set<Individual> namesIndividual = new HashSet<>();
    public static List<Integer> voltageValues = new ArrayList<>();
    public static Set<Individual> voltageeIndividual = new HashSet<>();


    //public static Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

    public static void main(String[] args) {
        // создание пустой модели
        OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM_MINI_RULE_INF);
        // путь к файлу с онтологией
       // String inputOntFilename = "C:\\Users\\anast\\Desktop\\magistratura\\project\\ontologies\\ont1_1_4.rdf";
        String inputOntFilename = "C:\\Users\\anast\\Desktop\\magistratura\\project\\ontologies\\ont1_1_3.rdf";

//        ипользование менеджера файлов для нахождения входного файла
        InputStream in = FileManager.get().open(inputOntFilename);
        if (in == null) {
            throw new IllegalArgumentException(
                    "File: " + inputOntFilename + " not found");
        }
        // считывание данных из файла в модель
        model.read(in, null);




        File scdFile = new File("C:\\Users\\anast\\Desktop\\PIGv7.scd");

        SCL tsub = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(SCL.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            tsub = (SCL) jaxbUnmarshaller.unmarshal(scdFile);
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String NS = "http://www.semanticweb.org/anast/ontologies/2019/3/untitled-ontology-22#";
        OntClass voltageLevelClass = model.getOntClass(NS + "VoltageLevel"); ///ON VOOBSHE NUGEN??????
        OntClass TerminalClass = model.getOntClass(NS + "Terminal");
        OntClass connectivityNodeClass = model.getOntClass(NS + "ConnectivityNode");
        OntClass YEFNClass = model.getOntClass(NS + "YEFN");
        OntClass ZBSHClass = model.getOntClass(NS + "ZBSH");
        OntClass BusClass = model.getOntClass(NS + "Bus");
        OntClass BusBreakerClass = model.getOntClass(NS + "BusBreaker");
        OntClass bypassBreakerClass = model.getOntClass(NS + "bypassBreaker");
        OntClass fiderBreakerClass = model.getOntClass(NS + "fiderBreaker");
        OntClass selectionalizingBreakerClass = model.getOntClass(NS + "selectionalizingBreaker");
        OntClass XSWIClass = model.getOntClass(NS + "XSWI");
        OntClass ZCABClass = model.getOntClass(NS + "ZCAB");
        OntClass ZGILClass = model.getOntClass(NS + "ZGIL");
        OntClass ZLINClass = model.getOntClass(NS + "ZLIN");
        OntClass IFLClass = model.getOntClass(NS + "ZLIN");
        OntClass PTWClass = model.getOntClass(NS + "PTW");
        OntClass YLTCClass = model.getOntClass(NS + "YLTC");
        OntClass YPSHClass = model.getOntClass(NS + "YPSH");
        OntClass ATRClass = model.getOntClass(NS + "AutoTransformers");
        OntClass TTRClass = model.getOntClass(NS + "ThreeWidningTransformers");
        OntClass TRClass = model.getOntClass(NS + "TwoWidningTransformers");
        OntClass ZCAPClass = model.getOntClass(NS + "ZCAP");
        OntClass ZMOTClass = model.getOntClass(NS + "ZMOT");
        OntClass ZREAClass = model.getOntClass(NS + "ZREA");
        OntClass TCTRClass = model.getOntClass(NS + "TCTR");

        // считывание класса из модели
        OntClass TVTRClass = model.getOntClass(NS + "TVTR");
        // считывние свойства из модели
        ObjectProperty hasVoltageLevel = model.getObjectProperty(NS + "hasVoltageLevel");

        ObjectProperty hasCN = model.getObjectProperty(NS + "hasCN");
        ObjectProperty hasTerminal = model.getObjectProperty(NS + "hasTerminal");
        ObjectProperty hasPower = model.getObjectProperty(NS + "hasPower");
        ObjectProperty hasPTW = model.getObjectProperty(NS + "hasPTW");
        ObjectProperty hasParts = model.getObjectProperty(NS + "hasParts");
        ObjectProperty connectedWith = model.getObjectProperty(NS + "connectedWith");
        ObjectProperty partOf = model.getObjectProperty(NS + "partOf");


        DatatypeProperty hasName = model.getDatatypeProperty(NS + "hasName");
        DatatypeProperty hasVoltage = model.getDatatypeProperty(NS + "hasVoltage");
        DatatypeProperty voltageType = model.getDatatypeProperty(NS + "voltageType");

        List<TSubstation> substations = tsub.getSubstation();
        mySubstation = substations.get(0);
        String v = "v_";
        for (TVoltageLevel voltageLevel : mySubstation.getVoltageLevel()) {
            voltage = voltageLevel.getVoltage();
            String VOL1 = voltage.getValue().toString();
            voltageValues.add(Integer.parseInt(VOL1));
            String VOL =v.concat(VOL1);
            OntClass U = model.getOntClass(NS + VOL);
            Individual voltageIndividual = model.createIndividual(NS + voltage.getValue().toString(), U);
            voltageIndividual.addProperty(hasVoltage,VOL1,XSDDatatype.XSDinteger);
            voltageeIndividual.add(voltageIndividual);
            namesIndividual.add(voltageIndividual);
            for (TBay bay : voltageLevel.getBay()) {
                TText text = bay.getText();
                for (TConnectivityNode connectivityNode : bay.getConnectivityNode()) {
                    List<String> CNode = Arrays.asList(connectivityNode.getPathName());
                    Individual cNodeIndividual = model.createIndividual(NS + connectivityNode.getPathName(), connectivityNodeClass);
                    namesIndividual.add(cNodeIndividual);
                }
                if (text != null) {
                    if (text.getContent().toString().equals("[Bus]")) {
                        Individual busIndividual = model.createIndividual(NS + bay.getName(), BusClass);
                        busIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        busIndividual.addProperty(hasVoltage,VOL1,XSDDatatype.XSDinteger);
                        for (TConnectivityNode node: bay.getConnectivityNode()){
                            Individual cNodeB = model.createIndividual(NS+node.getPathName(), connectivityNodeClass);
                            busIndividual.addProperty(hasCN, cNodeB  );
                        }

                       // busIndividual.addProperty(hasCN, bay.getConnectivityNode().toString());
                        namesIndividual.add(busIndividual);
                    }
                }
                for (TConductingEquipment conductingEquipment : bay.getConductingEquipment()) {
                    List<String> basicTypes = Arrays.asList(conductingEquipment.getType());
                    if (basicTypes.contains("EFN")) {
//                      String currentEFN = conductingEquipment.getName();
                        Individual EFNIndividual = model.createIndividual(NS + conductingEquipment.getName(), YEFNClass);
                        EFNIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        EFNIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                        namesIndividual.add(EFNIndividual);
                        metodterma.MetodTerm(conductingEquipment, EFNIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual); //sozdaet hasCN, hasTerminal, individi terminal
//                          hasCN, hasTerminal, hasVoltageLevel, (partOf  ???)
                        //efnTerminals = conductingEquipment.getTerminal();
                        //List<Individual> efnTerminalIndividual = new ArrayList<>();
                        //List<Individual> efnCNNsIndividual = new ArrayList<Individual>();
                        // for (int i = 0; i < efnTerminals.size(); i++) {
                        //String term = efnTerminals.get(i).getName() + "_" + conductingEquipment.getType();
                        //EFNIndividual.addProperty(hasCN, conductingEquipment.getTerminal().get(i).getConnectivityNode());
                        //EFNIndividual.addProperty(hasTerminal, term);
                        //Individual efnterminal = model.createIndividual(NS + term, TerminalClass);
//                            cNNefn = Arrays.asList(efnTerminals.get(i).getCNodeName());
//                            cCNefn = Arrays.asList(efnTerminals.get(i).getConnectivityNode());
//                            efnTerminalIndividual.add(model.createIndividual(NS + efnTerminals.get(i).getName(), TerminalClass));
//	                            efnTerminalIndividual.addProperty(hasTerminal, efnTerminalIndividual.get(i));
//                            efnCNNsIndividual.add(model.createIndividual(NS + efnTerminals.get(i).getConnectivityNode(), connectivityNodeClass));
//	                            efnIndividual.addProperty(hasCN, ctrCNNsIndividual.get(i));
                        // }
                    }
                    if (basicTypes.contains("PSH")) {
                        Individual PSHIndividual = model.createIndividual(NS + conductingEquipment.getName(), YPSHClass);
                        PSHIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        PSHIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                        namesIndividual.add(PSHIndividual);
                        metodterma.MetodTerm(conductingEquipment, PSHIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual); //sozdaet hasCN, hasTerminal, individi terminal
//                          hasCN, hasTerminal, hasVoltageLevel, (partOf  ???)
                        //efnTerminals = conductingEquipment.getTerminal();
                        //List<Individual> efnTerminalIndividual = new ArrayList<>();
                        //List<Individual> efnCNNsIndividual = new ArrayList<Individual>();
                        // for (int i = 0; i < efnTerminals.size(); i++) {
                        //String term = efnTerminals.get(i).getName() + "_" + conductingEquipment.getType();
                        //EFNIndividual.addProperty(hasCN, conductingEquipment.getTerminal().get(i).getConnectivityNode());
                        //EFNIndividual.addProperty(hasTerminal, term);
                        //Individual efnterminal = model.createIndividual(NS + term, TerminalClass);
//                            cNNefn = Arrays.asList(efnTerminals.get(i).getCNodeName());
//                            cCNefn = Arrays.asList(efnTerminals.get(i).getConnectivityNode());
//                            efnTerminalIndividual.add(model.createIndividual(NS + efnTerminals.get(i).getName(), TerminalClass));
//	                            efnTerminalIndividual.addProperty(hasTerminal, efnTerminalIndividual.get(i));
//                            efnCNNsIndividual.add(model.createIndividual(NS + efnTerminals.get(i).getConnectivityNode(), connectivityNodeClass));
//	                            efnIndividual.addProperty(hasCN, ctrCNNsIndividual.get(i));
                        // }}}
                    }
                    if (basicTypes.contains("CBR")) {
                        TText text1 = conductingEquipment.getText();
                        if (text1 != null) {
                            String TEXT2 = text1.getContent().toString();
                            if (TEXT2.equals("[BusBreaker]")) {
                                Individual BusBreakerIndividual = model.createIndividual(NS + conductingEquipment.getName(), BusBreakerClass);
                                BusBreakerIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                                BusBreakerIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                                namesIndividual.add(BusBreakerIndividual);
                                metodterma.MetodTerm(conductingEquipment, BusBreakerIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual);
                            }
                            if (TEXT2.equals("[bypassBreaker]")) {
                                Individual bypassBreakerIndividual = model.createIndividual(NS + conductingEquipment.getName(), bypassBreakerClass);
                                bypassBreakerIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                                bypassBreakerIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                                namesIndividual.add(bypassBreakerIndividual);
                                metodterma.MetodTerm(conductingEquipment, bypassBreakerIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual);
                            }
                            if (TEXT2.equals("[selectionalizingBreaker]")) {
                                Individual selBrIndividual = model.createIndividual(NS + conductingEquipment.getName(), selectionalizingBreakerClass);
                                selBrIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                                selBrIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                                namesIndividual.add(selBrIndividual);
                                metodterma.MetodTerm(conductingEquipment, selBrIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual);
                            }
                            if (TEXT2.equals("[fiderBreaker]")) {
                                Individual fiderBreakerIndividual = model.createIndividual(NS + conductingEquipment.getName(), fiderBreakerClass);
                                fiderBreakerIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                                fiderBreakerIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                                namesIndividual.add(fiderBreakerIndividual);
                                metodterma.MetodTerm(conductingEquipment, fiderBreakerIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual);
                            }
                        }
                    }
                    if (basicTypes.contains("DIS")) {
                        Individual XSWIIndividual = model.createIndividual(NS + conductingEquipment.getName(), XSWIClass);
                        XSWIIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        XSWIIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                        namesIndividual.add(XSWIIndividual);
                       metodterma.MetodTerm(conductingEquipment, XSWIIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual);
//                        disTerminals = conductingEquipment.getTerminal();
//                        List<Individual> disTerminalIndividual = new ArrayList<>();
//                        List<Individual> disCNNsIndividual = new ArrayList<>();
//                        for (int i = 0; i < disTerminals.size(); i++) {
//                          PARSING Terminal
//                          hasVoltageLevel
//                            cNNdis = Arrays.asList(disTerminals.get(i).getCNodeName());
//                            cCNdis = Arrays.asList(disTerminals.get(i).getConnectivityNode());
                        //disTerminalIndividual.add(model.createIndividual(NS + disTerminals.get(i).getName(), TerminalClass));
//                            model.createIndividual(NS +
//                                            disTerminals.get(i).getName(),
//                                    TerminalClass).addProperty(hasTerminal, disTerminalIndividual.get(i));

//                            disCNNsIndividual.add(model.createIndividual(NS + disTerminals.get(i).getConnectivityNode(), connectivityNodeClass));

//                            model.createIndividual(NS + disTerminals.get(i).getConnectivityNode(),
//                                    connectivityNodeClass).addProperty(hasCN, disCNNsIndividual.get(i));
//                        }
                    }
                    if (basicTypes.contains("CAB")) {
                        Individual CABIndividual = model.createIndividual(NS + conductingEquipment.getName(), ZCABClass);
                        CABIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        CABIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                        namesIndividual.add(CABIndividual);
                        metodterma.MetodTerm(conductingEquipment, CABIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual);
                        //String currentCAB = conductingEquipment.getName();
                        //__________________________________________________________________________________
                        //PARSING CAB
                        //__________________________________________________________________________________

                        // cabTerminals = conductingEquipment.getTerminal();
//                        List<Individual> ctrTerminalIndividual = new ArrayList<Individual>();
//                        List<Individual> ctrCNNsIndividual = new ArrayList<Individual>();
                        // for (int i = 0; i < cabTerminals.size(); i++) {
                        //cNNcab = Arrays.asList(cabTerminals.get(i).getCNodeName());
                        //cCNcab = Arrays.asList(cabTerminals.get(i).getConnectivityNode());
//	                            ctrTerminalIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getName(), model.getOntClass(NS + "Terminal")));
//	                            ctrIndividual.addProperty(hasTerminal, ctrTerminalIndividual.get(i));
//	                            ctrCNNsIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getConnectivityNode(),
//	                                    model.getOntClass(NS + "ConnectivityNodes")));
//	                            ctrIndividual.addProperty(hasConnectivityNode, ctrCNNsIndividual.get(i));
                        //}
                    }
                    if (basicTypes.contains("GIL")) {
                        Individual GILIndividual = model.createIndividual(NS + conductingEquipment.getName(), ZGILClass);
                        GILIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        GILIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                        namesIndividual.add(GILIndividual);
                       metodterma.MetodTerm(conductingEquipment, GILIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual);
                        for (TLNode gillnode : conductingEquipment.getLNode()) {
                            List<String> LTClass = gillnode.getLnClass();
                            if (LTClass.contains("YPSH")) {
                                Individual YPSHIndividual = model.createIndividual(NS + gillnode.getLnClass().toString(), YPSHClass);
                                YPSHIndividual.addProperty(partOf, GILIndividual);
                                namesIndividual.add(YPSHIndividual);
                            }
                        }
                        // String currentGIL = conductingEquipment.getName();
                        //__________________________________________________________________________________
                        //PARSING gil
                        //__________________________________________________________________________________
//	                        Individual ctrIndividual = model.createIndividual(NS + currentIFL, measurementClass);
                        //  gilTerminals = conductingEquipment.getTerminal();
//                        List<Individual> ctrTerminalIndividual = new ArrayList<Individual>();
//                        List<Individual> ctrCNNsIndividual = new ArrayList<Individual>();
                        // for (int i = 0; i < gilTerminals.size(); i++) {
                        //cNNgil = Arrays.asList(gilTerminals.get(i).getCNodeName());
                        //  cCNgil = Arrays.asList(gilTerminals.get(i).getConnectivityNode());
//	                            ctrTerminalIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getName(), model.getOntClass(NS + "Terminal")));
//	                            ctrIndividual.addProperty(hasTerminal, ctrTerminalIndividual.get(i));
//	                            ctrCNNsIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getConnectivityNode(),
//	                                    model.getOntClass(NS + "ConnectivityNodes")));
//	                            ctrIndividual.addProperty(hasConnectivityNode, ctrCNNsIndividual.get(i));
                        //}
                    }
                    if (basicTypes.contains("LIN")) {
                        Individual LINIndividual = model.createIndividual(NS + conductingEquipment.getName(), ZLINClass);
                        LINIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        LINIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                        namesIndividual.add(LINIndividual);
                        metodterma.MetodTerm(conductingEquipment, LINIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual);
                        //String currentLIN = conductingEquipment.getName();
                        //__________________________________________________________________________________
                        //PARSING LIN
                        //__________________________________________________________________________________
//	                        Individual ctrIndividual = model.createIndividual(NS + currentIFL, measurementClass);
                        // linTerminals = conductingEquipment.getTerminal();
//                        List<Individual> ctrTerminalIndividual = new ArrayList<Individual>();
//                        List<Individual> ctrCNNsIndividual = new ArrayList<Individual>();
                        //for (int i = 0; i < linTerminals.size(); i++) {
                        //cNNlin = Arrays.asList(linTerminals.get(i).getCNodeName());
                        //cCNlin = Arrays.asList(linTerminals.get(i).getConnectivityNode());
//	                            ctrTerminalIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getName(), model.getOntClass(NS + "Terminal")));
//	                            ctrIndividual.addProperty(hasTerminal, ctrTerminalIndividual.get(i));
//	                            ctrCNNsIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getConnectivityNode(),
//	                                    model.getOntClass(NS + "ConnectivityNodes")));
//	                            ctrIndividual.addProperty(hasConnectivityNode, ctrCNNsIndividual.get(i));
                        //}
                    }
                    if (basicTypes.contains("IFL")) {
                        Individual IFLIndividual = model.createIndividual(NS + conductingEquipment.getName(), IFLClass);
                        IFLIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        IFLIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                        namesIndividual.add(IFLIndividual);
                        metodterma.MetodTerm(conductingEquipment, IFLIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual);
                    }
                    if (basicTypes.contains("CAP")) {
                        Individual CAPIndividual = model.createIndividual(NS + conductingEquipment.getName(), ZCAPClass);
                        CAPIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        CAPIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                        namesIndividual.add(CAPIndividual);
                        metodterma.MetodTerm(conductingEquipment, CAPIndividual, hasCN, hasTerminal,hasName, model, NS, namesIndividual);
                        //String currentCAP = conductingEquipment.getName();
//                    PARSING ???
//                    hasCN, hasTerminal, hasVoltageLevel
//	                        Individual ctrIndividual = model.createIndividual(NS + currentIFL, measurementClass);
                        //capTerminals = conductingEquipment.getTerminal();
//                        List<Individual> ctrTerminalIndividual = new ArrayList<Individual>();
//                        List<Individual> ctrCNNsIndividual = new ArrayList<Individual>();
//                        for (int i = 0; i < capTerminals.size(); i++) {
//                          PARSING Terminal
//                          hasVoltageLevel
//                            cNNcap = Arrays.asList(capTerminals.get(i).getCNodeName());
//                            cCNcap = Arrays.asList(capTerminals.get(i).getConnectivityNode());
//	                            ctrTerminalIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getName(), model.getOntClass(NS + "Terminal")));
//	                            ctrIndividual.addProperty(hasTerminal, ctrTerminalIndividual.get(i));
//	                            ctrCNNsIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getConnectivityNode(),
//	                                    model.getOntClass(NS + "ConnectivityNodes")));
//	                            ctrIndividual.addProperty(hasConnectivityNode, ctrCNNsIndividual.get(i));
//                        }
                    }
                    if (basicTypes.contains("MOT")) {
                        Individual MOTIndividual = model.createIndividual(NS + conductingEquipment.getName(), ZMOTClass);
                        MOTIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        MOTIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                        namesIndividual.add(MOTIndividual);
                        metodterma.MetodTerm(conductingEquipment, MOTIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual);
//                        String currentMOT = conductingEquipment.getName();
                        //__________________________________________________________________________________
                        //PARSING MOT
                        //__________________________________________________________________________________
//	                        Individual ctrIndividual = model.createIndividual(NS + currentIFL, measurementClass);
//                        motTerminals = conductingEquipment.getTerminal();
//                        List<Individual> ctrTerminalIndividual = new ArrayList<Individual>();
//                        List<Individual> ctrCNNsIndividual = new ArrayList<Individual>();
//                        for (int i = 0; i < motTerminals.size(); i++) {
//                            cNNmot = Arrays.asList(motTerminals.get(i).getCNodeName());
//                            cCNmot = Arrays.asList(motTerminals.get(i).getConnectivityNode());
//	                            ctrTerminalIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getName(), model.getOntClass(NS + "Terminal")));
//	                            ctrIndividual.addProperty(hasTerminal, ctrTerminalIndividual.get(i));
//	                            ctrCNNsIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getConnectivityNode(),
//	                                    model.getOntClass(NS + "ConnectivityNodes")));
//	                            ctrIndividual.addProperty(hasConnectivityNode, ctrCNNsIndividual.get(i));
//                        }
                    }
                    if (basicTypes.contains("REA")) {
                        Individual REAIndividual = model.createIndividual(NS + conductingEquipment.getName(), ZREAClass);
                        REAIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        REAIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                        namesIndividual.add(REAIndividual);
                        metodterma.MetodTerm(conductingEquipment, REAIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual);
                        for (TLNode realnode : conductingEquipment.getLNode()) {
                            List<String> LTClass = realnode.getLnClass();
                            if (LTClass.contains("YPSH")) {
                                Individual YPSHIndividual = model.createIndividual(NS + realnode.getLnClass().toString(), YPSHClass);
                                YPSHIndividual.addProperty(partOf, REAIndividual);
                                namesIndividual.add(YPSHIndividual);
                            }
                            if (LTClass.contains("YEFN")) {
                                Individual YEFNIndividual = model.createIndividual(NS + realnode.getLnClass().toString(), YEFNClass);
                                YEFNIndividual.addProperty(partOf, REAIndividual);
                                namesIndividual.add(YEFNIndividual);
                            }
                        }
//                        String currentREA = conductingEquipment.getName();
                        //__________________________________________________________________________________
                        //PARSING REA
                        //__________________________________________________________________________________
//	                        Individual ctrIndividual = model.createIndividual(NS + currentIFL, measurementClass);
//                        reaTerminals = conductingEquipment.getTerminal();
//                        List<Individual> ctrTerminalIndividual = new ArrayList<Individual>();
//                        List<Individual> ctrCNNsIndividual = new ArrayList<Individual>();
//                        for (int i = 0; i < reaTerminals.size(); i++) {
//                            cNNrea = Arrays.asList(reaTerminals.get(i).getCNodeName());
//                            cCNrea = Arrays.asList(reaTerminals.get(i).getConnectivityNode());
//	                            ctrTerminalIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getName(), model.getOntClass(NS + "Terminal")));
//	                            ctrIndividual.addProperty(hasTerminal, ctrTerminalIndividual.get(i));
//	                            ctrCNNsIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getConnectivityNode(),
//	                                    model.getOntClass(NS + "ConnectivityNodes")));
//	                            ctrIndividual.addProperty(hasConnectivityNode, ctrCNNsIndividual.get(i));
//                        }
                    }
                    if (basicTypes.contains("CTR")) {
                        Individual CTRIndividual = model.createIndividual(NS + conductingEquipment.getName(), TCTRClass);
                        CTRIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        CTRIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                        namesIndividual.add(CTRIndividual);
                        metodterma.MetodTerm(conductingEquipment, CTRIndividual, hasCN, hasTerminal, hasName ,model, NS, namesIndividual);
                        // String currentCTR = conductingEquipment.getName();
//                      PARSING TCTR
//                      hasCN, hasTerminal, hasVoltageLevel
                        //ctrTerminals = conductingEquipment.getTerminal();
                        //List<Individual> ctrTerminalIndividual = new ArrayList<Individual>();
                        //List<Individual> ctrCNNsIndividual = new ArrayList<Individual>();
                        // for (int i = 0; i < ctrTerminals.size(); i++) {
                        //cNNctr = Arrays.asList(ctrTerminals.get(i).getCNodeName());
                        //cCNctr = Arrays.asList(ctrTerminals.get(i).getConnectivityNode());
//                          PARSING Terminal
//                          hasVoltageLevel
//	                            ctrTerminalIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getName(), model.getOntClass(NS + "Terminal")));
//	                            ctrIndividual.addProperty(hasTerminal, ctrTerminalIndividual.get(i));
//	                            ctrCNNsIndividual.add(model.createIndividual(
//	                                    NS + ctrTerminals.get(i).getConnectivityNode(),
//	                                    model.getOntClass(NS + "ConnectivityNodes")));
//	                            ctrIndividual.addProperty(hasConnectivityNode, ctrCNNsIndividual.get(i));
                        //}
                    }
                    if (basicTypes.contains("VTR")) {
                        Individual VTRIndividual = model.createIndividual(NS + conductingEquipment.getName(), TVTRClass);
                        VTRIndividual.addProperty(hasVoltageLevel, voltageIndividual);
                        VTRIndividual.addProperty(hasVoltage,VOL1, XSDDatatype.XSDinteger);
                        namesIndividual.add(VTRIndividual);
                        metodterma.MetodTerm(conductingEquipment, VTRIndividual, hasCN, hasTerminal, hasName, model, NS, namesIndividual);
//                        String currentVTR = conductingEquipment.getName();
//                      PARSING TVTR
//                      hasCN, hasTerminal, hasVoltageLevel
//                        vtrTerminals = conductingEquipment.getTerminal();
//                        List<Individual> vtrTerminalIndividual = new ArrayList<Individual>();
//                        List<Individual> vtrCNNsIndividual = new ArrayList<Individual>();
//                        for (int i = 0; i < vtrTerminals.size(); i++) {
//                            cNNvtr = Arrays.asList(vtrTerminals.get(i).getCNodeName());
//                            cCNvtr = Arrays.asList(vtrTerminals.get(i).getConnectivityNode());
//                          PARSING Terminal
//                          hasVoltageLevel
//                            vtrTerminalIndividual.add(model.createIndividual(
//                                    NS + vtrTerminals.get(i).getName(), TerminalClass));
//                            model.createIndividual(
//                                    NS + vtrTerminals.get(i).getName(), TerminalClass).addProperty(hasTerminal, vtrTerminalIndividual.get(i));
//                            vtrCNNsIndividual.add(model.createIndividual(
//                                    NS + vtrTerminals.get(i).getConnectivityNode(),
//                                    connectivityNodeClass));
//                            model.createIndividual(
//                                    NS + vtrTerminals.get(i).getConnectivityNode(),
//                                    connectivityNodeClass).addProperty(hasCN, vtrCNNsIndividual.get(i));
//                        }
                    }
                }
            }
        }
        for (TPowerTransformer powerTransformer : mySubstation.getPowerTransformer()) {
            ptrTypes = Collections.singletonList(powerTransformer.getType());
            TText text3 = powerTransformer.getText();
            if (text3 != null) {
//                    String TEXT1 = text.getContent().toString();
                if (text3.getContent().toString().equals("[AutoTransformers]")) {
                    Individual ATRIndividual = model.createIndividual(NS + powerTransformer.getName(), ATRClass);
                    namesIndividual.add(ATRIndividual);

//                    for (TTransformerWinding winding : powerTransformer.getTransformerWinding()) {
//                        Individual PTWIndividual = model.createIndividual(NS + winding.getName() + "_" + powerTransformer.getName(), PTWClass);
//                        ATRIndividual.addProperty(hasPTW, winding.getName() + "_" + powerTransformer.getName());
//                        for (TTerminal ptwTerminals : winding.getTerminal()) {
//                            String term = ptwTerminals.getName() + "_" + winding.getName();
//                            Individual ptwTerminalIndividual = model.createIndividual(NS + term, TerminalClass);
//                            PTWIndividual.addProperty(hasCN, winding.getTerminal().get(0).getConnectivityNode());
//                            PTWIndividual.addProperty(hasTerminal, term);
//                            for (TLNode trlnode : powerTransformer.getLNode()) {
//                                List<String> LTClass = trlnode.getLnClass();
//                                if (LTClass.contains("YLTC")) {
//                                    Individual YLTCIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YLTCClass);
//                                    YLTCIndividual.addProperty(partOf, ATRIndividual);
//                                }
//                                if (LTClass.contains("YPSH")) {
//                                    Individual YPSHIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YPSHClass);
//                                    YPSHIndividual.addProperty(partOf, ATRIndividual);
//                                }
//                                if (LTClass.contains("YEFN")) {
//                                    Individual YEFNIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YEFNClass);
//                                    YEFNIndividual.addProperty(partOf, ATRIndividual);
//                                }
//                                if (LTClass.contains("ZBSH")) {
//                                    Individual ZBSHIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), ZBSHClass);
//                                    ZBSHIndividual.addProperty(partOf, ATRIndividual);
//                                }
//                            }
//                        }
//                    }
                    metTR.MetodTerm(powerTransformer, ATRIndividual, hasCN, hasTerminal, model, NS, hasName, namesIndividual);
                }
                if (text3.getContent().toString().equals("[ThreeWidningTransformers]")) {
                    Individual TTRIndividual = model.createIndividual(NS + powerTransformer.getName(), TTRClass);
                    namesIndividual.add(TTRIndividual);
//                    for (TTransformerWinding winding : powerTransformer.getTransformerWinding()) {
//                        Individual PTWIndividual = model.createIndividual(NS + winding.getName() + "_" + powerTransformer.getName(), PTWClass);
//                        TTRIndividual.addProperty(hasPTW, winding.getName() + "_" + powerTransformer.getName());
//                        for (TTerminal ptwTerminals : winding.getTerminal()) {
//                            String term = ptwTerminals.getName() + "_" + winding.getName();
//                            Individual ptwTerminalIndividual = model.createIndividual(NS + term, TerminalClass);
//                            PTWIndividual.addProperty(hasCN, winding.getTerminal().get(0).getConnectivityNode());
//                            PTWIndividual.addProperty(hasTerminal, term);
//                            for (TLNode trlnode : powerTransformer.getLNode()) {
//                                List<String> LTClass = trlnode.getLnClass();
//                                if (LTClass.contains("YLTC")) {
//                                    Individual YLTCIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YLTCClass);
//                                    YLTCIndividual.addProperty(partOf, TTRIndividual);
//                                }
//                                if (LTClass.contains("YPSH")) {
//                                    Individual YPSHIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YPSHClass);
//                                    YPSHIndividual.addProperty(partOf, TTRIndividual);
//                                }
//                                if (LTClass.contains("YEFN")) {
//                                    Individual YEFNIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YEFNClass);
//                                    YEFNIndividual.addProperty(partOf, TTRIndividual);
//                                }
//                                if (LTClass.contains("ZBSH")) {
//                                    Individual ZBSHIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), ZBSHClass);
//                                    ZBSHIndividual.addProperty(partOf, TTRIndividual);
//                                }
//                            }
//                        }
//                    }
                    metTR.MetodTerm(powerTransformer, TTRIndividual, hasCN, hasTerminal, model, NS, hasName, namesIndividual);
                }
                if (text3.getContent().toString().equals("[TwoWidningTransformers]")) {
                    Individual TRIndividual = model.createIndividual(NS + powerTransformer.getName(), TRClass);
                    namesIndividual.add(TRIndividual);
//                    for (TTransformerWinding winding : powerTransformer.getTransformerWinding()) {
//                        Individual PTWIndividual = model.createIndividual(NS + winding.getName() + "_" + powerTransformer.getName(), PTWClass);
//                        TRIndividual.addProperty(hasPTW, winding.getName() + "_" + powerTransformer.getName());
//                        for (TTerminal ptwTerminals : winding.getTerminal()) {
//                            String term = ptwTerminals.getName() + "_" + winding.getName();
//                            Individual ptwTerminalIndividual = model.createIndividual(NS + term, TerminalClass);
//                            PTWIndividual.addProperty(hasCN, winding.getTerminal().get(0).getConnectivityNode());
//                            PTWIndividual.addProperty(hasTerminal, term);
//                            for (TLNode trlnode : powerTransformer.getLNode()) {
//                                List<String> LTClass = trlnode.getLnClass();
//                                if (LTClass.contains("YLTC")) {
//                                    Individual YLTCIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YLTCClass);
//                                    YLTCIndividual.addProperty(partOf, TRIndividual);
//                                }
//                                if (LTClass.contains("YPSH")) {
//                                    Individual YPSHIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YPSHClass);
//                                    YPSHIndividual.addProperty(partOf, TRIndividual);
//                                }
//                                if (LTClass.contains("YEFN")) {
//                                    Individual YEFNIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YEFNClass);
//                                    YEFNIndividual.addProperty(partOf, TRIndividual);
//                                }
//                                if (LTClass.contains("ZBSH")) {
//                                    Individual ZBSHIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), ZBSHClass);
//                                    ZBSHIndividual.addProperty(partOf, TRIndividual);
//                                }
//                            }
//                        }
//                    }
                    metTR.MetodTerm(powerTransformer, TRIndividual, hasCN, hasTerminal, model, NS, hasName, namesIndividual);
                }
            }
//                for (TLNode trlnode : powerTransformer.getLNode()) {
//                    List<String> LTClass = trlnode.getLnClass();
//                    if (LTClass.contains("YLTC")) {
//                   Individual YLTCIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YLTC);
            //YLTCIndividual.addProperty(hasBus, busIndividual);
//                    PARSING YLTC
//                    }
//                    if (LTClass.contains("YPSH")) {
///                  Individual YPSHIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YPSH);
//                    PARSING YPSH
//                    hasCN, hasTerminal, hasVoltageLevel
//                    }
//                    if (LTClass.contains("YEFN")) {
//                        Individual YEFNIndividual = model.createIndividual(NS + trlnode.getLnClass().toString(), YEFNClass);
//                        YEFNIndividual.addProperty(partOf, REAIndividual);
//                    }
//                if (LTClass.contains("YPTR")) {
//                    Individual YPTRIndividual = model.createIndividual(NS + lnode.getLnClass().toString(), YPTR);
//                    PARSING YPTR
//                    hasPower, hasPTW, hasCN, hasTerminal, hasVoltageLevel
//                }
//                }
            //String PTR = ptrTypes.toString();
            // if (ptrTypes.toString().equals("[PTR]")) {
            // for (TTransformerWinding winding : powerTransformer.getTransformerWinding()) {
            // Individual PTWIndividual = model.createIndividual(NS + winding.getName()+"_"+powerTransformer.getName(), PTWClass);
            //for (TTerminal ptwTerminals : winding.getTerminal()) {
            // String term = ptwTerminals.getName() + "_" + winding.getName();
            //  Individual ptwTerminalIndividual = model.createIndividual(NS + term, TerminalClass);
            // PTWIndividual.addProperty(hasCN, winding.getTerminal().get(0).getConnectivityNode());
            //  PTWIndividual.addProperty(hasTerminal, term);

            //Individual ptwCNNsIndividual = model.createIndividual(NS + ptwTerminals.getName(), connectivityNodeClass);
            //cNNptw = ptwTerminals.getCNodeName();
            //cCNptw = ptwTerminals.getConnectivityNode();
            //ptwTerminalIndividual.addProperty(hasTerminal, ptwTerminalIndividual);
            //ptwCNNsIndividual.addProperty(hasCN, ptwCNNsIndividual);
            //}
            //}
            //}
        }
        int k = 1;
        for (Individual i : namesIndividual) {
            k++;
            i.addProperty(hasName,k+"", XSDDatatype.XSDinteger);
        }

        Collections.sort(voltageValues);
        Collections.reverse(voltageValues);
        int number = 1;
        for (int i=0 ; i<voltageValues.size(); i++) {
            for (Individual j : voltageeIndividual) {
               String[] voltT = j.getURI().toString().split("#");
//                System.out.println("!!-----------------");
//                System.out.println(j);
                int nVolt = Integer.parseInt(voltT[1]);
              //   System.out.println("!!!" + nVolt);
                if (nVolt == voltageValues.get(i)){

                    j.addProperty(voltageType,number+"",XSDDatatype.XSDinteger);
                }
            }
            if (voltageValues.size()==3){
                number++;
            }
            else if (voltageValues.size()==2){
                number= number+2;
            }
        }
        // сохранение (запись) модели в выходной файл
        try {
           // FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\anast\\Desktop\\magistratura\\project\\ontologies\\ont_PS2_pig.owl");
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\anast\\Desktop\\magistratura\\project\\ontologies\\ont_PS3_pig.owl");
            model.write(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

