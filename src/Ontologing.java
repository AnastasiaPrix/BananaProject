import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.reasoner.Reasoner;
import com.hp.hpl.jena.reasoner.ValidityReport;
import com.hp.hpl.jena.reasoner.rulesys.GenericRuleReasoner;
import com.hp.hpl.jena.reasoner.rulesys.Rule;
import com.hp.hpl.jena.util.FileManager;
import org.mindswap.pellet.jena.PelletReasoner;
import org.mindswap.pellet.jena.PelletReasonerFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import org.apache.jena.ontology.*;

import java.io.InputStream;

public class Ontologing  {
    public static void main(String[] args) {
        OntModel model = ModelFactory.createOntologyModel(PelletReasonerFactory.THE_SPEC, null);
        String inputOntFilename = "/Users/alexbol96/Downloads/IEC_6115";
        String NS = "http://www.semanticweb.org/user/ontologies/2018/4/ASPPRZ#";
        InputStream in = FileManager.get().open(inputOntFilename);
        if (in == null) {
            throw new IllegalArgumentException(
                    "File: " + inputOntFilename + " not found");
        }

        model.read(in, null);
        ObjectProperty hasTerminal = (ObjectProperty) model.getObjectProperty(NS + "hasTerminal");


        Reasoner reasoner = PelletReasonerFactory.theInstance().create();
        InfModel infModel = ModelFactory.createInfModel(reasoner, model);

        StmtIterator iterator = infModel.listStatements();

        while (iterator.hasNext()){
            Statement stmt = iterator.nextStatement();
            Resource subject = stmt.getSubject();
            Property predicate = stmt.getPredicate();
            RDFNode object = stmt.getObject();
            System.out.println(subject.toString() + predicate.toString() + object.toString());
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/alexbol96/Downloads/pellet");
            infModel.write(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

