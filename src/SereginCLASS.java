//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintStream;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import javax.xml.bind.Unmarshaller;
//
//import org.apache.jena.ontology.DataRange;
//import org.apache.jena.ontology.DatatypeProperty;
//import org.apache.jena.ontology.OntClass;
//import org.apache.jena.ontology.OntModel;
//import org.apache.jena.ontology.OntModelSpec;
//import org.apache.jena.rdf.model.ModelFactory;
//import org.apache.jena.rdf.model.RDFList;
//import org.apache.jena.rdf.model.RDFNode;
//import org.apache.jena.riot.RDFDataMgr;
//import org.apache.jena.riot.RDFFormat;
//import org.apache.jena.sparql.function.library.leviathan.sec;
//
//import com.google.gson.ExclusionStrategy;
//import com.google.gson.FieldAttributes;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//
//import ru.smarteps.scl.SCL;
//import ru.smarteps.scl.TBay;
//import ru.smarteps.scl.TConductingEquipment;
//import ru.smarteps.scl.TConnectivityNode;
//import ru.smarteps.scl.TTerminal;
//
//public class SereginCLASS {
//
//
//    private static Object NameOfClass;
//    private static char[] cs;
//
//
////	public static Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
//
//    public static <T> void marshalAny (Class<T> clazz, T information, String outPutFileName) { //String outPutFileName - как будет называться хмл файл
//        JAXBContext jaxbContext;
//        try {
//            jaxbContext = JAXBContext.newInstance(clazz);
//            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//            jaxbMarshaller.marshal(information, new File(outPutFileName));
//        } catch (JAXBException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
//
//    public static void main(String[] args) throws MalformedURLException {
//        File file = new File("src/new.scd");
//        JAXBContext jaxbContext;
//        SCL tsub = null;
//        try {
//            jaxbContext = JAXBContext.newInstance(SCL.class);
//            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//            tsub = (SCL) jaxbUnmarshaller.unmarshal(file);
//
//
//            Map<String, List<TConductingEquipment>> linkMap = new HashMap<String, List<TConductingEquipment>>();//Создаем пустой HashMap для хранения связей
//            Map<String, TConductingEquipment> equipmentMap = new HashMap<String, TConductingEquipment>();//Создаем пустой HashMap для хранения оборудования
//            //Пример обхода всех ячеек в одном классе напряжения. Добавить внешний цикл обхода по уровням напряжения
//            //tsub.getSubstation().get(0).getVoltageLevel().get(0).getBay().get(0).getName();
//
//            for (int i = 0; i<tsub.getSubstation().get(0).getVoltageLevel().size(); i++) {
//                for (TBay bay : tsub.getSubstation().get(0).getVoltageLevel().get(i).getBay()) { //Перебираем ячейки
//                    for (TConductingEquipment ce : bay.getConductingEquipment()) { //Перебираем оборудование внутри каждой ячейки
//                        equipmentMap.put(ce.getName(), ce); //Добавляем оборудование в хэшмэп
//                        //System.out.println(equipmentMap.values()+"-------------"+i);
//                    }
//                    for (TConnectivityNode cn : bay.getConnectivityNode()) { //Перебираем все конн.ноды и
//                        linkMap.put(cn.getName(), new LinkedList<TConductingEquipment>());// добавляем пустые массивы для хранения оборудования
//                    }
//                }
//                for (TConductingEquipment ce : equipmentMap.values()) { //Проходимся по всем элементам оборудования из хэшмэпа
//                    List<TConductingEquipment> connList = linkMap.get(ce.getTerminal().get(i).getCNodeName()); //Из хэшмэпа для связей достаём лист оборудования, подключенного к данному конн.ноду
//                    connList.add(ce); //Добавляем в этот лист наше оборудование из внешнего цикла
//					/*for (TTerminal t: ce.getTerminal()) { //Проходимся по всем терминалам/подключениям оборудования
//						String connectivityNodeName = t.getCNodeName(); //Находим имя конн.нода, к которому подключен терминал
//					}*/
//                }
//            }
//
//            //индивиды в jena
//            System.out.println(linkMap.values().toString()+"-------------");
//            System.err.println(equipmentMap.values()+"-------------");
//            //System.err.println("-------------"+tsub.getSubstation().get(0).getVoltageLevel().get(0).getBay().get(2).getConductingEquipment().get(0).getName()+"-------------");
//
//            String NS = "http://www.w3.org/TR/owl-features/#term_OWLDL";
//
//            OntModel m = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);
//
//	      /*
//	        ArrayList<OntClass> a = new ArrayList();
//	        ArrayList<OntClass> b = new ArrayList();
//	        for(int i=0;i<equipmentMap.size();i++) {
//	        	a.add(m.createClass( NS+i));
//	        }
//
//	        Set<Entry<String, List<TConductingEquipment>>> set = linkMap.entrySet();
//
//	        for(Entry<String, List<TConductingEquipment>> me : set) {
//	        	for(int i = 0;i<me.getValue().size();i++) {
//
//	        	}
//	        	System.out.println(me.getValue().size());
//	        	for(int i = 0;i<me.getValue().size();i++) {
//	        		//a.add(m.createClass( NS+me.getValue() ));
//		        	b.addDisjointWith( b );
//	        		}
//	        	}
//	        */
//
//            //System.out.print(me.getKey() + ": ");
//            //System.out.println(me.getValue().get(0));
//
//            OntClass a1 = m.createClass( NS+"A" );
//            OntClass b1 = m.createClass( NS+"B" );
//            OntClass c = m.createClass( NS+"C" );
//            a1.addDisjointWith( b1 );
//            a1.addDisjointWith( c );
//            a1.createIndividual(NS);
//
//
//            //OntClass Info = m.createClass(NS + "ClasstestOntology");
//
//            // m.write(System.out);
//            // DatatypeProperty testOne = m.createOntology(NS  +"testOntology");
//
//            DatatypeProperty testOne = m.createDatatypeProperty(NS  +"PropertytestOntology");
//
//            DataRange range = m.createDataRange(
//                    m.createList(
//                            (Iterator<? extends RDFNode>) Arrays.asList(linkMap.values().toString())
//                                    .stream()
//                                    .<Object>map(v -> (RDFNode) m.createTypedLiteral(v))
//                                    .iterator()));
//
//            testOne.addRange(range);
//
//            m.write(System.out);
//
//
//
//	       /*
//	        File fileowl = new File("output.owl");
//	        JAXBContext jaxbContextowl;
//	        SCL tsub = null;
//
//	        jaxbContext = JAXBContext.newInstance(SCL.class);
//	        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//	        tsub = (SCL) jaxbUnmarshaller.unmarshal(file);
//*/
//
//
//	        /*PrintStream out = null;
//			try {
//				out = new PrintStream(new FileOutputStream("output.owl"));
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	        //System.setOut((PrintStream) m.write(System.out));
//	         */
//
//        } catch (JAXBException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//
//    }
//
//
//}
