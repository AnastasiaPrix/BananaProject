//import org.apache.jena.ontology.Individual;
//import org.apache.jena.ontology.OntClass;
//import org.apache.jena.ontology.OntModel;
//import org.apache.jena.rdf.model.ModelFactory;
//import org.apache.jena.rdf.model.Resource;
//
//import java.util.Iterator;
//
//import static org.apache.jena.ontology.OntModelSpec.OWL_MEM;
//import static org.apache.jena.ontology.OntModelSpec.OWL_MEM_MICRO_RULE_INF;
//
//public class OntResource {
//    // create the base model
////    String SOURCE = "C:\\Users\\User\\Desktop\\SCL\\new_owl.owl";
////    String NS = SOURCE + "#";
////    OntModel base;
////    base.read(SOURCE, "RDF/XML");
//
//    // create the reasoning model using the base
//    OntModel inf = ModelFactory.createOntologyModel( OWL_MEM_MICRO_RULE_INF, base );
//
//    // create a dummy paper for this example
//    OntClass paper = base.getOntClass( NS + "Paper" );
//    Individual p1 = base.createIndividual( NS + "paper1", paper );
//
//// list the asserted types
//for (Iterator<Resource> i = p1.listRDFTypes(); i.hasNext(); ) {
//        System.out.println( p1.getURI() + " is asserted in class " + i.next() );
//    }
//
//// list the inferred types
//for (Iterator<Resource> i = p1.listRDFTypes(); i.hasNext(); ) {
//        System.out.println( p1.getURI() + " is inferred to be in class " + i.next() );
//    }
//
//    public OntResource() {
//        base = ModelFactory.createOntologyModel( OWL_MEM );
//    }
//}
