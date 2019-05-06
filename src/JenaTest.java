import org.apache.jena.base.Sys;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.ontology.Ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.util.FileManager;
import ru.avicomp.ontapi.jena.utils.Iter;

import java.io.File;
import java.io.InputStream;
import java.util.Iterator;

public class JenaTest {

    public static void main(String[] args) {
        OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM_MINI_RULE_INF); // Any Spec
        String inputFileName = "C:\\Users\\alexbol96\\Desktop\\SCL\\new_rdf.rdf ";
        String NS = "http://www.semanticweb.org/user/ontologies/2018/4/ASPPRZ#";
        // use the FileManager to find the input file
        InputStream in = FileManager.get().open(inputFileName);
        if (in == null) {
            throw new IllegalArgumentException(
                    "File: " + inputFileName + " not found");
        }
        model.read(in, null);
        StmtIterator iterator = model.listStatements();
        while (iterator.hasNext()){
            Statement statement = iterator.nextStatement();
            Resource subject = statement.getSubject();
            Property predicate = statement.getPredicate();
            RDFNode object = statement.getObject();
            System.out.print("Subject: " + subject.toString()); // Generates internal Jena identifier, it's not an URI, Just a Jena label
            System.out.print(" Predicate: " + predicate.toString() + " ");
            if (object instanceof Resource) {
                System.out.print("Object " + object.toString());
            } else {
                // object is a literal
                System.out.print(" \" Object " + object.toString() + "\"");
            }
            System.out.println(" .");
        }
            for (Iterator k = model.listOntologies(); k.hasNext();){
                Ontology ont = (Ontology) k.next();
                OntClass automation = model.getOntClass(NS + "Automation");
                for (Iterator<OntClass> i = automation.listSubClasses(); i.hasNext(); ) {
                    OntClass c = i.next();
                    System.out.println(c.getURI());
                    System.out.println(c.listProperties().nextStatement().getPredicate().getURI());
                }
            }

        model.write(System.out);
    }

   }

